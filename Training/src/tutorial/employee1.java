package tutorial;

public class employee1 extends person {
	private double salary;
	private int year;
	private String ID;
	
	public employee1(double salary, int year, String ID, String name){
		super(name);
		this.salary = salary;
		this.year = year;
		this.ID = ID;
	}
	
	public double getSalary(){
		return this.salary;
	}
	
	public int getYear(){
		return this.year;
	}
	
	public String getID(){
		return this.ID;
	}
	
	public boolean equals(Object otherObj){
		boolean isEqual = false;
		
		if(otherObj != null && otherObj instanceof employee1){
			employee1 emp = (employee1)otherObj;
			isEqual = this.hassameName(emp) && (this.salary == emp.salary) && (this.year == emp.year) && (this.ID == emp.ID);
			
		}
		return isEqual;
	}
	
	public void writeOutput(){
		super.writeOutput();
		System.out.println("Salary is "+salary +" year is "+year +" ID " +ID);
	}
}
