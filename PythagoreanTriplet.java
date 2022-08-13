import java.util.Scanner;

public class PythagoreanTriplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		
		System.out.println(isPythagoreanTriplet(num1,num2,num3));

	}

	public static boolean isPythagoreanTriplet(int a, int b, int c) {
		int lhs = (int) (Math.pow(a, 2) + Math.pow(b, 2));
		int rhs = (int) Math.pow(c, 2);
		
		return lhs==rhs;
	}
}
