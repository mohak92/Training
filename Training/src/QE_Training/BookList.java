package QE_Training;

class BookList {

	int id;
	String name, author, publisher;
	int quantity;
	
	public BookList(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	
	@Override
	public int hashCode() {
		return id;
	}
	
	@Override
	public boolean equals(Object obj) {
		BookList booklist = (BookList) obj;
		return (id == booklist.id);
	}
	
	@Override
	public String toString()
	{
		String numberAsString = Integer.toString(id);
		String q = Integer.toString(quantity);
		return numberAsString+" "+name+" "+author+" "+publisher+" "+q;
	}
	
}
