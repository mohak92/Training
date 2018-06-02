package tutorial;

public class DemoParanCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		paranCheck pc = new paranCheck();
		
		String expr = "(a+(b+(c+d)) + (d + e))";
		pc.setExpression(expr);
		
		
		
		if (pc.match())
		{
			System.out.println("They match");
		}
		else
		{
			System.out.println("They do not match");
		}

	}

}
