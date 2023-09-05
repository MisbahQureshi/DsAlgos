package TreesLec;
import java.util.Scanner;

public class BinaryTrees {
	
	public BinaryTrees() {
		
	}

	private static class Node{
		int value;
		Node left;
		Node right;
		
		public Node(int value) {
			this.value=value;
		}
	}
	
	private Node root;
	
	//insert elements
	public void populate(Scanner scanner) {
		System.out.println("enter the root node value:");
		int value = scanner.nextInt();
		root = new Node(value);
		populate(scanner, root);
	}

	private void populate(Scanner scanner, Node node) {
		System.out.println("do you want to enter left Node of " + node.value);
		boolean left = scanner.nextBoolean();
		if(left) {
			System.out.println("value:");
			int value = scanner.nextInt();
			node.left = new Node(value);
			populate(scanner, node.left);
		}
		
		System.out.println("do you want to enter right Node of " + node.value);
		boolean right = scanner.nextBoolean();
		if(right) {
			System.out.println("value:");
			int value = scanner.nextInt();
			node.right = new Node(value);
			populate(scanner, node.right);
		}
	}
	
	public void display() {
		display(root, " ");
	}

	private void display(Node node, String indent) {
		if(node==null) return;
		System.out.println(indent + node.value);
		display(node.left, indent + "\t");
		display(node.right, indent + "\t");
	}

}
