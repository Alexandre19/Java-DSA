import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<String>();
	/*	
		linkedList.push("A");
		linkedList.push("B");
		linkedList.push("C");
		linkedList.push("D");
		linkedList.push("F"); */
		
		linkedList.offer("A");
		linkedList.offer("B");
		linkedList.offer("C");
		linkedList.offer("D");
		linkedList.offer("F");
		
		
		
		System.out.println(linkedList);

	}

}
