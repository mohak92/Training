package tutorial;

public class negativeexp extends Exception {
	
	public negativeexp(){
		super("-ve number entered");
	}
	
	public negativeexp(String message){
		super(message);
	}
	

}
