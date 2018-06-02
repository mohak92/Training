package QE_Training;

import java.util.*;

public class BookListMain {

	public static void main(String[] args) {
		List<BookList> list = new ArrayList<BookList>();
		
		BookList b1 = new BookList(101, "Let us see", " Yashwant Kanetkar", " BPB ", 8);
		BookList b2 = new BookList(102, "Data Communication & Networking", " Forouzan", " Mc Graw Hill ", 4);
		BookList b3 = new BookList(103, "Operating System", " Galvin", " Wiley ", 6);
		
		list.add(b1);
		list.add(b2);
		list.add(b3);
		
		for(BookList b: list) {
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
		
		ListIterator<BookList> itr = list.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
