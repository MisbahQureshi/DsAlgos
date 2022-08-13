import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("radius of circle: ");
		int r = in.nextInt();
		
		double result= 3.14*Math.pow(r, 2);
		System.out.println(result);

	}

}
