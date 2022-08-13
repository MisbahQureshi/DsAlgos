import java.util.Scanner;

//1672. Richest Customer Wealth
public class RichestCustomerWealth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int n2 = in.nextInt();
		int[][] arr = new int[n][n2];
		
		for(int i=0; i<arr.length;i++) {
			for(int j = 0; j<arr[0].length;j++) {
				arr[i][j]= in.nextInt();			
				}
		}
		
		System.out.println(maximumWealth(arr));
	}
	
	
	 public static int maximumWealth(int[][] accounts) {
		 int richestPerson = Integer.MIN_VALUE;
		 
		 for(int i=0; i<accounts.length;i++) {
			 int sum = 0;
				for(int j = 0; j<accounts[i].length;j++) {
					sum +=accounts[i][j];	
					
					}
				richestPerson = Math.max(richestPerson, sum);
				
			}
		 
		 return richestPerson;
	        
	    }
	
	

}
