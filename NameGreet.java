import java.util.Scanner;

public class NameGreet {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("what is your name: ");
		String name= in.next();
		
		System.out.println("hello " + name );

	}

}
