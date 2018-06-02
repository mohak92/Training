package tutorial;

public class underGrad extends student {
	private int level;
	
	public underGrad(){
		super();
		level = 1;
	}
	
	public underGrad(String name, int level, int ID){
		super(ID, name);
		setlevel(level);
	}
	
	public void setlevel(int Newlevel){
		if (Newlevel >= 1 && Newlevel <=4){
			this.level = Newlevel;
		}
		else{
			System.out.println("Illeagal level");
			System.exit(0);
		}
	}
	
	public void reset(String nName, int nID, int nLevel){
		super.reset(nName, nID);
		setlevel(nLevel);
	}

	public int getLevel(){
		return level;
	}
	
	public void writeOutput(){
		super.writeOutput();
		System.out.println("level is "+level);
	}
	
	public boolean equals(underGrad oGrad){
		
		return equals(( (student)oGrad ) ) && (this.level == oGrad.level);
		
	}
}
