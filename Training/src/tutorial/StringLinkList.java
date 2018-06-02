package tutorial;

public class StringLinkList {
	
	private listNode head;
	
	public StringLinkList(){
		
		head = null;
		
	}
	
	public void showList() {
		listNode position = head;
		
		while(position != null){
			System.out.println(position.getData());
			position = position.getLink();
		}
	}
	
	public int getLength(){
		int cnt = 0;
		listNode position = head;
		
		while(position != null){
			cnt++;
			position = position.getLink();
		}
		
		return cnt;
	}

	public void addNodeStart(String data){
		head = new listNode(data, head); 
	}
	
	public void deleteHeadNode() {
		if (head != null){
			head = head.getLink();
		}
		else {
			System.out.println("Deleting from empty list");
			System.exit(0);
		}
		
	}
	
	public boolean onList(String target) {
		return find(target) != null;
	}
	
	public listNode find(String target){
		boolean found = false;
		
		listNode position = head;
		
		while ( (position != null) && (!found) ) {
			String currentData = position.getData();
			
			if(currentData.equals(target)){
				found = true;
			}
			else {
				position = position.getLink();
			}
		}
		return position;
	}
	
}
