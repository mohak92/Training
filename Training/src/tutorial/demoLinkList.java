package tutorial;

public class demoLinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringLinkList myList = new StringLinkList();
		myList.addNodeStart("one");
		myList.addNodeStart("two");
		myList.addNodeStart("three");
		
		myList.showList();
		myList.deleteHeadNode();
		if(myList.onList("three")){
			System.out.println("three is on list");
		}
		else{
			System.out.println("three is not on list");
		}
	}

}
