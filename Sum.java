import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("number: ");
		int ans = 0, ans2 = 0, ans3 = 0;
		
		while(true) {
			
			int num =  in.nextInt();
			
			if(num%2!=0 && num>0) {
		    ans +=num;
			}
		    
		    if(num<0) {
		    	ans2 +=num;
		    }
		    
		    if(num%2==0 && num>0) {
		    	ans3+=num;
		    }
		    
		    if(num==0) {
		    System.out.println(ans); //odd
		    System.out.println(ans2); //negative
		    System.out.println(ans3); //even
		    }
		    
			} 

	}

}
