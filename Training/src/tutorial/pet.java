package tutorial;

public class pet {
	
	private String name;
	private int age;
	private double weight;
	
	private pet first, second;
	
	
	public pet(){
		name ="No name";
		age = 0;
		weight = 0;
	}
	
	public pet(String objName)
	{
	  
		this(objName,0,0);
	  
	}
	
	
	public pet(pet firstpet, pet Secondpet)
	{
		first = firstpet;
		second = Secondpet;
	}
	
public pet(String objName, int objAge, double objWeight){
		
		name = objName;
		if(objAge < 0 || objWeight < 0 ){
			System.out.println("Age or weight is wrong");
			System.exit(0);
		}
		else
		{
			setAge(objAge);
			weight = objWeight;
		}
		
	}



	public pet getFirst()
	{
		return first;
	}
	
	public pet getSecond()
	{
		return second;
	}
	
	
	public void setName(String obj_name)
	{
		name = obj_name;
	}
	
public void setAge(int objAge){
		
		if(objAge < 0){
			System.out.println("Age or weight is wrong");
			System.exit(0);
	}
		else
	{
		age = objAge;
	}
	}
	
	public int getAge(){
		return age;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void  writeOutput()
	{
		System.out.println("First pair is");
		first.getName();
		System.out.println("Second pair is");
		second.getName();
		
	}
	
	
	
	
}
