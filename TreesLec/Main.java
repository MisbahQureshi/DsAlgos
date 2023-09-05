package TreesLec;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			BinaryTrees tree = new BinaryTrees();
			tree.populate(scanner);
			tree.display();

	}

}
