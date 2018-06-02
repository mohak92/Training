package tutorial;
import java.util.*;

public class arrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("one");
		arr.add("two");
		arr.add("three");
		arr.add(1, "four");
		arr.remove(4);
		
		if(arr.contains("three")){
			System.out.println("three is in array list");
		}
		
		for(String elements: arr){
			System.out.println(elements);
		}
	}

}
