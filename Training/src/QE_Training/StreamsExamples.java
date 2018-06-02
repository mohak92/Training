package QE_Training;
import java.util.*;

public class StreamsExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<PersonStreams> people = Arrays.asList(
				new PersonStreams("Mohak", "Tamhane", 25),
				new PersonStreams("Steve", "Jobs", 55));
		Iterator<PersonStreams> itr = people.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().Fname);
		}
		System.out.println("\n");
		people.stream()
		.filter(p -> p.Fname.startsWith("M"))
		.forEach(p -> System.out.println(p.Fname));
		
	}

}
