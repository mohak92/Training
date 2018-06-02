package tutorial;

public class shapeBasic implements shapeInterface {
	private int Offset;
	
	public shapeBasic(){
		Offset = 0;
	}
	
	public shapeBasic(int Offset){
		this.Offset = Offset;
	}
	@Override
	public void setOffset(int Offset) {
		// TODO Auto-generated method stub
		this.Offset = Offset;
	}

	@Override
	public int getOffset() {
		// TODO Auto-generated method stub
		return this.Offset;
	}

	@Override
	public void drawat(int linenumber) {
		// TODO Auto-generated method stub
		for(int i = 0; i < linenumber; i++){
			System.out.println();
			}
		drawhere();
	}

	@Override
	public void drawhere() {
		// TODO Auto-generated method stub
		for(int i = 0; i <= Offset; i++){
			System.out.println(" ");
		}
		
		System.out.println("*");
	}

}
