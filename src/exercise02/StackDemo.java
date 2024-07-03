package exercise02;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();

		System.out.println("- API push:");
		stack.push(6);
		System.out.println(stack);
		System.out.println("\n");

		System.out.println("- API add:");
		stack.add(9);
		System.out.println(stack);
		System.out.println("\n");

		System.out.println("- API add (int, e):");
		stack.add(1, 69);
		System.out.println(stack);
		System.out.println("\n");

		System.out.println("- API set:");
		stack.set(1, 96);
		System.out.println(stack);
		System.out.println("\n");

		System.out.println("- API size:");
		System.out.println(stack.size());
		System.out.println("\n");

		System.out.println("- API empty:");
		System.out.println(stack.empty());
		System.out.println("\n");

		System.out.println("- API peek:");
		System.out.println(stack.peek());
		System.out.println("\n");

		System.out.println("- API pop:");
		stack.pop();
		System.out.println(stack);
		System.out.println("\n");

		System.out.println("- API search:");
		System.out.println(stack.search(96));
		System.out.println("\n");
	}
}