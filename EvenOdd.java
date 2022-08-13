import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Type a number");
		int number = in.nextInt();
				
				if(number % 2 == 0) {
					System.out.println("even");
				}
				
				else {
					System.out.println("odd");
				}
				

	}

}
