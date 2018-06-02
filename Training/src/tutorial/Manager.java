package tutorial;

public class Manager extends Employee {
	public String mgr_name;
	public String mgr_desig;
	public double mgr_sal;
	
	
	public Manager()
	{
		
		super();
	    mgr_name = "Manager";
	}
	
	public void compute_salary(int no_of_hrs)
	{
		System.out.println("i am in manager");
	}

	 
}
