import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter number: ");
		int num = in.nextInt();
		
		int a =0;
		int b= 1;
		System.out.print( a + " " + b);
		for(int i = 2; i<=num; i++ ) {
			int temp = b;
			b = a + b;
			a= temp;
			System.out.print(" " + b);
		}
		
		
	}

}
