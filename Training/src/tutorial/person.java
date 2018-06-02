package tutorial;

public class person {

	private String name;
	
	public person(){
		name = "no name";
	}
	
	public person(String objName){
		name = objName;
		
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public boolean hassameName(person p){
		return this.name.equals(p.name);
	}
	
	public void writeOutput(){
		System.out.println("Name is "+name);
	}
}


