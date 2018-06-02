package tutorial;

public class personAddress {

	public String fname;
	public String lname;
	public String email;
	public int phone;
	
	public void setName(String fname){
		this.fname = fname;
	}
	
	public String getName(){
		return this.fname;
	}
	
	public void setPhone(int obj_phone)
	{
		phone = obj_phone;
	}
	
	public boolean equals(personAddress obj_name){
		
		if(this.fname.equals(obj_name.fname)&&(this.lname.equals(obj_name.lname)) )
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
}
