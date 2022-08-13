import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("number: ");
		int num =  in.nextInt();
		int ans = 1;
		
		for(int i=num; i>0; i--) {
			ans*=i; 
			
		}
		System.out.println(ans);
			
	}

}
