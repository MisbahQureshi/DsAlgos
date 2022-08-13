import java.util.Scanner;

public class PKRinUSD {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("input rs to convert: ");
		int num1 = in.nextInt();
		float ans = num1/225.50f;
		System.out.println(ans);
	}

}



