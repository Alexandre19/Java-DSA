import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<String>();
		
		queue.offer("Alexandre");
		queue.offer("Pedro");
		queue.offer("José");
		queue.offer("Maria");
		queue.offer("João");
		
		System.out.println(queue.peek());
		
		System.out.println(queue);
	}

}
