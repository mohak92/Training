package tutorial;


public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
       Employee emp = new Employee("Mohaks", "VP",3500.9899,"hourly");
       Employee emp2 = new Employee("Mohak", "VP",500.9899,"hourly");
       
     
      /* if (emp.equals(emp2))
       {
    	   System.out.println("Both are equal");
       }
       else
       {
    	   System.out.println("Both are not equal");
       }*/
   
       Manager mgr = new Manager();
       
      System.out.println(emp.get_info());
      emp.compute_salary(20);
      System.out.printf("%8.2f", emp.get_salary());
     
      System.out.println(" Manager details "+ mgr.get_info());
      mgr.compute_salary(20);
      mgr.get_salary();
      
       
	}

}

