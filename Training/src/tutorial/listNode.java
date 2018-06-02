package tutorial;

public class listNode {
	
	private String data;
	private listNode link;
	
	public listNode (){
		data = null;
		link = null;
	}
	
	public listNode(String objData, listNode linkValue) {
		data = objData;
		link = linkValue;
	}
	
	public void setData(String objData) {
		data = objData;
	}
	
	public String getData(){
		return data;
	}
	
	public void setLink(listNode objLink){
		link = objLink;
	}
	
	public listNode getLink () {
		return link; 
	}
}
