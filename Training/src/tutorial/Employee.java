package tutorial;

public class Employee {

	public String name;
	public String designation;
	private double salary;
	public String emp_type;
	
	public Employee()
	{
		name="";
		designation = "";
		salary=0;
		emp_type="";
	}
	
	public Employee(String obj_name,String obj_designation, double obj_salary, String obj_emptype)
	{
		name = obj_name;
		designation = obj_designation;
		salary = obj_salary;
		emp_type = obj_emptype;
	}
	
	public String get_info()
	{
		String val = name + " "+ designation + " " +  emp_type;
		return val;
	}
	
	public double get_salary()
	{
		return salary;
	}
	
	public void compute_salary(int no_of_hrs)
	{
	   String tmp_type = this.emp_type;
	  
	   
	   if (tmp_type.equals("hourly"))
	   {
		   salary = 8 * no_of_hrs;
	   }
	   else if (tmp_type.equals("permanent"))
	   {  
		 salary = salary - 0.25;  
	   }
	   
	
	}
	
	public boolean equals (Employee emp_obj){
		
		if (this.name.equals(emp_obj.name) && (this.get_salary() == emp_obj.get_salary()))
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}
}
