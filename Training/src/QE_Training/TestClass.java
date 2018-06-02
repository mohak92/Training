package QE_Training;
import java.util.*;
public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> m1 = new HashMap<String, String>();
		m1.put("Kimi Raikkonen", "7");
		m1.put("Sebastian Vettel", "5");
		m1.put("Fernando Alonso", "14");
		m1.put("Lewis Hamilton", "44");
		m1.put("Valteri Bottas", "77");
		m1.put("Scuderia Ferrari", "1");
		m1.put("McLaren", "2");
		m1.put("Mercedes", "3");
		
		for(Map.Entry<String, String> entry: m1.entrySet()) {
			System.out.println("Key :"+entry.getKey()+" Value :"+entry.getValue());
		}
		
		System.out.println();
		System.out.println(" Map Element ");
		System.out.println("\t" +m1);
	}

}
