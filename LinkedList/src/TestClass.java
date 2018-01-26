
public class TestClass {
	
	public static void main(String a[ ] )
	{
		LinkedList linklist = new LinkedList();
		
		for (int i = 0; i<10 ; i++)
		{
			linklist.insertData(i);
		}
		
		linklist.showAll();
		System.out.println(linklist.getnumberOfElements());
		linklist.deleteLastElement();
		linklist.DeleteGraterElement(4);
	}

}
