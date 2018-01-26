
public class LinkedList {

	private Node headNode=null;
	private Node tailNode=null;
	private int numberOfElemntsInList = 0;
	
	public void insertData(int data)
	{
		Node newNode = new Node();
		newNode.setData(data);
		newNode.setNextNode(null);
		if(headNode==null) {
			headNode=newNode;
			tailNode=newNode;
			numberOfElemntsInList ++;
		}else {
			tailNode.setNextNode(newNode);
			tailNode=newNode;	
			numberOfElemntsInList ++;
	}
		
	}
	public int getnumberOfElements()
	{
		return numberOfElemntsInList;
	}
	
	public void showAll() {
		Node d= headNode;
		while(d!=null) {
			System.out.println("the result is"+d.getData());
			d=d.getNextNode();
		}
	}
	
	public void deleteLastElement()
	{
		int i = 0;
		Node node = headNode;
		while(i < numberOfElemntsInList - 2)
		{
			node = node.getNextNode();
			i++;
		}
		node.setNextNode(null);
		showAll();
	}
	
	
	public void DeleteGraterElement(int Value)
	{
		Node node = headNode;
		
		Node previousNode = null;
		while(node != null)
		{
			if (node.getData() > Value)
			{
				Node tempNode = node.getNextNode();
				node.setNextNode(null);
				previousNode.setNextNode(tempNode);
				node = previousNode;
			}
			previousNode = node;
			node = node.getNextNode();
		}
		showAll();
	}
	
}
