import java.util.Scanner;
//simple interest
public class PTR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("enter ptr");
		int p = in.nextInt();
		int t = in.nextInt();
		int r = in.nextInt();
		
		int a = p*(1 + (r*t));
		
		System.out.println(a);
	}

}
