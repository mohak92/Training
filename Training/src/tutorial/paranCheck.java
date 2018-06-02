package tutorial;
import java.util.*;

public class paranCheck {
	
	String expression;
	
	String sample = "iiii";
	
	public void setExpression(String exp){
		expression = exp;
	}
	
	public String getExpression(){
		return expression;
	}
	
	public boolean match(){
		Stack<Character> stk = new Stack<Character>();
		boolean correct = true;
		int count_left =0;
		int count_right=0;
		//System.out.println("Expression length" + expression.length());
		for (int i=0; i<= expression.length() -1; i++)
		{
			char c = expression.charAt(i);
			//System.out.println("char here" + c + " i is " + i);
		
			if (c== '(' || c==')')
			stk.push(c);
		
	    }
			
	   while (!stk.isEmpty())
	   {
		   char c0 = stk.pop().charValue();
		   //System.out.println("char c0 is " + c0);
		   if (c0 == '(')
		   {
			   count_left++;
		   }
		   if (c0 == ')')
		   {
			   count_right++;
		   }
		   
	   }
	   
	   if (count_left != count_right)
	   {
		   correct = false;
	   }
				
		return correct;
	}
}
