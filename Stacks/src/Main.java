import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		
		stack.push("Book");
		stack.push("Pencil");
		stack.push("Eraser");
		stack.push("Pencil sharpener");
		
		//stack.pop();
		
		System.out.println(stack.peek());
		
		System.out.println(stack);

	}

}
