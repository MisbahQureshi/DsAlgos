import java.util.Scanner;

public class FactorialofAnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		System.out.println(fact(number));
		
	}
	
	static int fact(int n) {
		if(n==1 || n==0) {
			return 1;
		}
		int fact = 1;
	for(int i=1; i<=n ; i++) {
			fact*=i;
		}
	return fact;
	}

}
