import java.util.Scanner;

public class reverseTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("put string: ");
		String s = in.nextLine();
		int j = s.length()-1;
		while(j>=0) {
			System.out.print(s.charAt(j));
			j--;
		}

	}

}
