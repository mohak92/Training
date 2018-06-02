package tutorial;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class blackrockQ3 {
    
    public static final String SEPARATOR = "@";
    public static final String COLON = ":";
    
    /*
     * Complete the function below.
     *
	 * Note: The questions in this test build upon each other. We recommend you
	 * copy your solutions to your text editor of choice before proceeding to
	 * the next question as you will not be able to revisit previous questions.
	 */

    static String printHoldings(String portfolioString) {

    	String[] rec_str = new String[portfolioString.length()];
    	String[] rec_str1 = new String[portfolioString.length()];
    	String format_string="";
    	rec_str = portfolioString.split(SEPARATOR);
    	rec_str1 = portfolioString.split(COLON);
    	
    	List<String> al = new ArrayList<String>();
    	for (int i=0;i< rec_str.length;i++)
    	{
    	    al.add(rec_str[i]);
    	   
    	    
    	}
    	
    	List<String> al1 = new ArrayList<String>();
    	for (int i=0;i< rec_str1.length;i++)
    	{
    	    al1.add(rec_str1[i]);
    	   
    	    
    	}
    	
    	Collections.sort(al);
    	Collections.sort(al1);
    	
    	format_string+="[";
    	String my_temp_str="";
    	
    	for (int i =0 ; i< al1.size() ; i++)
    	{
    		String each_rec = al1.get(i);
    		String[] split_rec = each_rec.split(",");
    		
    		for (int j=0; j< split_rec.length ; j++)
    		{
    		
    			  my_temp_str+=split_rec[j];
    			  if (j != split_rec.length - 1)
    			  {
    				  my_temp_str+=", ";
    			  }
    			
    		}
    		
    		format_string+=my_temp_str  + "]";
    		
    		if (i != al1.size() - 1)
    		{
    		  
    		  format_string+=", [";
    		}
    		my_temp_str="";
    	}
    	
    	for (int i =0 ; i< al.size() ; i++)
    	{
    		String each_rec = al.get(i);
    		String[] split_rec = each_rec.split(",");
    		
    		for (int j=0; j< split_rec.length ; j++)
    		{
    		
    			  my_temp_str+=split_rec[j];
    			  if (j != split_rec.length - 1)
    			  {
    				  my_temp_str+=", ";
    			  }
    			
    		}
    		
    		format_string+=my_temp_str  + "]";
    		
    		if (i != al.size() - 1)
    		{
    		  
    		  format_string+=", [";
    		}
    		my_temp_str="";
    	}
    	
        return format_string;
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
        res = printHoldings(_input);
        System.out.println(res);
    }
}