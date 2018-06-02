package QE_Training;
import java.util.*;
public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<BookList> set = new HashSet<BookList>();
		
		BookList b1 = new BookList(101," Let us C", " Yashwant Kanetkar", " BPB ", 8);
		BookList b2 = new BookList(102, " Data communication & Networking", " Forouzan", " Mc Graw Hill ", 4);
		BookList b3 = new BookList(103, " Operating System", " Galvin", " Wiley ", 6);
		BookList b4 = new BookList(103, " Operating System", " Galvin", " Wiley ", 6);
		
		set.add(b1);
		set.add(b2);
		set.add(b3);
		set.add(b4);
		
		for(BookList b:set) {
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
		
		System.out.println();
		
		Iterator<BookList> itr = set.iterator();
		
		while (itr.hasNext()) {
		System.out.println(itr.next().toString());
		
		}

	}

}
