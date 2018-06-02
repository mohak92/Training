package tutorial;

public class ArrayEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,4,0};
		int[] b = {1, 4, 8};
		boolean match = true;
		
		if(a.length != b.length){
			match = false;
			
		}
		else
		{
			for(int i=0; i<=a.length - 1; i++){
				if(a[i]!=b[i]){
					match = false;
					break;
				}
				
			}
			
			if(match){
				System.out.println("Two Arrays are equal");
			}
			else{
				System.out.println("Two Arrays are not equal");
			}
		}
	}
}
