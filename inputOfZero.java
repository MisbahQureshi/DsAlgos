import java.util.Scanner;

public class inputOfZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number = 1;
		int sum =0; 
		while(number!=0) {
			number = in.nextInt();
			sum+= number;
		}
		System.out.println(sum);

	}

}
