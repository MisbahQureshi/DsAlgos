import java.util.Scanner;

public class LargestNumberLoops {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("number: ");
		int ans = 0;
		
		while(true) {
			
			int num =  in.nextInt();
		    ans = Math.max(ans, num);
		    
		    if(num==0)
		    System.out.println(ans);
			} 

	}

}
