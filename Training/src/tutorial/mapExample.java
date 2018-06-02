package tutorial;
import java.util.*;

public class mapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> bMap = new TreeMap<String, String>();
		Set<String> bSet = new HashSet<String>();
		String [] names = {"Mohak", "Neal", "Neals"};
		String [] bDay = {"April 4", "May 7", "May 9"};
		
		for (int i = 0; i <= names.length - 1; i++){
			bMap.put(names[i], bDay[i]);
		}
		
		for (String name:bMap.keySet()){
			bSet.add(bMap.get(name));
		}
		
		System.out.println("size of set is " + bSet.size());
		System.out.println("size of map is " + bMap.size());
		if (bSet.size()<bMap.size()){
			System.out.println("some people have same birthdates");
		}
		System.out.println(bMap);
	}

}
