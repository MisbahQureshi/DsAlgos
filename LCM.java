import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("number: ");
		int n1 =  in.nextInt();
		int n2= in.nextInt();	
		int  gcd = 1;

	    for(int i = 1; i <= n1 && i <= n2; i++) {
	      if(n1 % i == 0 && n2 % i == 0)
	        gcd = i;
	    }

	    int lcm = (n1 * n2) / gcd;
	    System.out.println(lcm);

}
}
