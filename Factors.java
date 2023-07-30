import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		for(int i=1; i<=number; i++) {
			if(number%i == 0) {
				System.out.println(i);
			}
		}

	}

}
