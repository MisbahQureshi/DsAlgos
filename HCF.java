import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("number: ");
		int num =  in.nextInt();
		int num2= in.nextInt();	
		int ans= 2;
		for(int i=2; i<=num; i++) {
			if(num%i==0 && num2%i==0) {
				ans = Math.max(ans, i);
//				
			} 
	}	System.out.println(ans);	

	}

}
