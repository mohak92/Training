package tutorial;
import java.util.*;

public class wordsArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> words = new ArrayList<String>();
		
		words.add("one");
		words.add("two");
		words.add("three");
		
		Iterator<String> iter = words.iterator();
		
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
