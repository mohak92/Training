package tutorial.BlackRock;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class blackrockQ4 {
    
	public static final String SEPARATOR = "@";
    public static final String COLON = ":";
    public static final String COMMA = ",";
    
    /*
     * Complete the function below.
     *
 	 * Note: The questions in this test build upon each other. We recommend you
	 * copy your solutions to your text editor of choice before proceeding to
	 * the next question as you will not be able to revisit previous questions.
	 */
	
	public static class PortfolioHolding{
        private String ticker;
        private String name;
        private int quantity;
		private double price;
		private double netVal;
		private double percentVal;
		private double totalHoldingVal;
        
        public PortfolioHolding(String input){
            String[] pfHoldingStr = input.split(COMMA);
            this.ticker = pfHoldingStr[0];
            this.name = pfHoldingStr[1];
            this.quantity = Integer.parseInt(pfHoldingStr[2]);
			if(pfHoldingStr.length >3){
				this.price = Double.parseDouble(pfHoldingStr[3]);
			}			
        }
		
		public PortfolioHolding(PortfolioHolding portfolio, PortfolioHolding benchmark){		
			if(portfolio.getTicker().equals(benchmark.getTicker())){	
				this.ticker = portfolio.getTicker();				
				this.name = portfolio.getName();
				this.quantity = portfolio.getQuantity();
				this.price = benchmark.getPrice(); 
			}			
        }
		
        public String getTicker(){
            return ticker;
        }
        
        public void setTicker(String inputTicker){
            ticker = inputTicker;        
        }
        
        public String getName(){
            return name;
        }
        
        public void setName(String inputName){
            name = inputName;        
        }
        
        public int getQuantity(){
        	//System.out.println(quantity);
            return quantity;
        }
        
        public void setQuantity(int inputQuantity){
            quantity = inputQuantity;        
        }
		
		 public double getPrice(){
            return price;
        }
        
        public void setPrice(double inputPrice){
            price = inputPrice;        
        }
		
		public double getNetVal(){
            return quantity*price;
        }
		
		public double getPercentVal(){
            return (this.getNetVal()/this.getTotalHoldingVal())*100;
        }
	
		public double getTotalHoldingVal(){
            return totalHoldingVal;
        }
        
        public void setTotalHoldingVal(double inputTotalHoldingVal){
            totalHoldingVal = inputTotalHoldingVal;        
        }

    }
	
	
    static HashMap<String, PortfolioHolding> generateMap(String[] inputArray) {
	
		HashMap<String, PortfolioHolding> retMap 
		                    = new HashMap<String, PortfolioHolding>();
		for(String str : inputArray){
			PortfolioHolding ph = new PortfolioHolding(str);
			retMap.put(ph.getTicker() , ph);
		}
		return retMap;
    }
	
	public static class Transaction implements Comparable<Transaction>{
        private String transType;
        private String ticker;
        private double quantity;
        
        public Transaction(PortfolioHolding portfolio, PortfolioHolding benchmark){
		
			if(portfolio.getTicker().equals(benchmark.getTicker())){	
				// Setting the ticker on the transaction 
				this.ticker = portfolio.getTicker();
				
				this.quantity = Math.abs(((benchmark.getQuantity() - portfolio.getQuantity())));
					                
				if(portfolio.getQuantity() < benchmark.getQuantity()){
					this.transType = "BUY";					
				}
				else if(portfolio.getQuantity() > benchmark.getQuantity()){
					this.transType = "SELL";
				}	
				else{
					/*
					do nothing as it creates a transaction object only
					if a transaction exists
					*/
				}
			}			
        }
        
        public String getTicker(){
            return ticker;
        }
        
        public void setTicker(String inputTicker){
            ticker = inputTicker;        
        }
        
        public String getTransType(){
            return transType;
        }
        
        public void setTransType(String inputTransType){
            transType = inputTransType;        
        }
        
        public double getQuantity(){
            return quantity;
        }
        
        public void setQuantity(double inputQuantity){
            quantity = inputQuantity;        
        }
        
        @Override
        public String toString(){
            return "["+this.transType+", "+this.ticker+", "
                    +String.format("%.2f",this.quantity)+"]";
        }        
    
        @Override
        public int compareTo(Transaction transObj){
            return (this.ticker.compareTo(transObj.getTicker()));
        }
    }
	
    static String generateTransactions(String inputString) {
        // Splitting the input string based on ':' into a portfolio and benchmark string
        String[] inputArray = inputString.split(COLON);
		
        // splitting the input string based on '@' into a portfolio and benchmark array		
        String[] portfolioArray = inputArray[0].split(SEPARATOR);
		String[] benchmarkArray = inputArray[1].split(SEPARATOR);
		
		HashMap<String, PortfolioHolding> portfolioMap 
		        = generateMap(portfolioArray);
		HashMap<String, PortfolioHolding> benchmarkMap 
		        = generateMap(benchmarkArray);

		PortfolioHolding phObj = null;
		PortfolioHolding bhObj = null;
		
		List<Transaction> transList = new ArrayList<Transaction>();
		Transaction transObj = null;
		
		double phTotHoldVal = 0.0;
		double bhTotHoldVal = 0.0;
		
		for(String key : (Set<String>)portfolioMap.keySet()){
			phObj = (PortfolioHolding) portfolioMap.get(key);
			bhObj = (PortfolioHolding) benchmarkMap.get(key);
			
			phObj.setPrice(bhObj.getPrice());
						
			phTotHoldVal += phObj.getNetVal();
			bhTotHoldVal += bhObj.getNetVal();
					
		}
		
		for(String key : portfolioMap.keySet()){
		    phObj = portfolioMap.get(key);
		    bhObj = benchmarkMap.get(key);
		    
			phObj.setTotalHoldingVal(phTotHoldVal);
			bhObj.setTotalHoldingVal(bhTotHoldVal);
			
			transObj = new Transaction(phObj, bhObj);
			transList.add(transObj);
		}
		
        Collections.sort(transList);
        
        String[] outputArr = new String[transList.size()];
        
        int i =0;
        for(Transaction obj : transList){
            outputArr[i] = obj.toString();
            i++;
        }
        return String.join(", ", outputArr);    
    }
    
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        String res;
        String _input;
        try {
            _input = in.nextLine();
        } catch (Exception e) {
            _input = null;
        }
        res = generateTransactions(_input);
        System.out.println(res);
    }
}

