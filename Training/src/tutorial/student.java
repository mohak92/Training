package tutorial;

public class student extends person {
 private int studentid;
 
 public student(){
	 super();
	 studentid = 0;
 }
 
 public student(int ID, String objName){
	 super(objName);
	 studentid = ID;
 }
 
 public void reset(String newName, int newID){
	 
	 setName(newName);
	 studentid = newID;
	 
 }
 
 public void setID(int ID){
	 this.studentid = ID;
 }
 
 public int getID(){
	 return studentid;
 }
 
 /*public boolean equals(student s){
	 return ( ( this.studentid == s.studentid ) && ( this.hassameName(s) ));
 }*/
 
 public boolean equals(Object newObj){
	 boolean isEqual = false;
	 
	 if(newObj != null && (newObj instanceof student) ){
		 student newStudent = (student)newObj; 
		 isEqual = ( ( this.studentid == newStudent.studentid ) && ( this.hassameName(newStudent) ));
	 }
	 
	return isEqual;
	 
	 
 }
 
 public void writeOutput(){
	 super.writeOutput();
	 System.out.println("ID "+studentid);
 }
 
 public String toString(){
	 return "name" + this.getName() +"ID is" + this.studentid;
 }
}
