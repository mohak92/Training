package tutorial;
import java.util.*;
public class moviesList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> movies = new LinkedList<String>();
		
		movies.add("3 idiots");
		movies.add("3 idiots");
		movies.add("batman");
		movies.add("spiderman");
		
		ListIterator<String> iter = movies.listIterator();
		while (iter.hasNext()){
			String movie = iter.next();
			
			ListIterator<String> inter2 = movies.listIterator(iter.nextIndex());
			while (inter2.hasNext()){
				String movie2 = inter2.next();
				if(movie.equals(movie2))
				{
					System.out.println("Duplicate name " +movie);
				}
			}
		}
	}

}
