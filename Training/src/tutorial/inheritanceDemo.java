package tutorial;

public class inheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		employee1 emp = new employee1(100000, 2015, "tf45yr4", "Anil");
		employee1 emp1 = new employee1(100000, 2015, "tf45yr4", "John");
		emp.writeOutput();
		
		
		student sd = new student();
		student sd1 = new student();
		underGrad ug = new underGrad();
		sd.setName("Neal");
		sd.setID(132);
		sd1.setName("Neal");
		sd1.setID(132);
		//System.out.println(sd1.toString());
		ug.setlevel(4);
		//sd1.writeOutput();
		//ug.writeOutput();
		if(emp.equals(emp1)){
			System.out.println("Both are equal");
		}
		else{
			System.out.println("Both are not equal");
		}
		
		//System.out.println("Student ID = "+sd.getID() + "Student Name "+sd.getName());
		
	}

}
