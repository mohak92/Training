package tutorial;

public class GradeBook {


		// TODO Auto-generated method stub 
		private String CourseName;
		private int Marks;
		
	     public GradeBook()
	    {
	        CourseName = "default";
	    }
	    
	     public GradeBook(String course)
		 {
		    	CourseName = course;
		 }
		    
	    public void GetRusult()
	    {
	    	//String result;
	    	
	    	System.out.println(Marks >= 60 ? "Pass" : "Fail");
	    	/*
	    	if (this.Marks > 60) {
	    		
	    		result = "pass";
	    	
	    		
	    	}
	    	else {
	    		result = "Fail";
	    	}
	    	
	    	return result;
	    	*/
	    	
	    }
		
	    
		public String  displayMessage(String msg)
		{
			msg +="From my class";
			return msg;
		}

		public void SetCourseName(String course)
		{
			CourseName = course;
			
		}
		
		public String GetCourseName()
		{
			return CourseName;
		}
		
		public void SetMarks(int Marks){
			this.Marks = Marks;
		}
		
		public int GetMarks(){
			return this.Marks;
		}
		
}
