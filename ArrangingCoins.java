import java.util.Scanner;

public class ArrangingCoins {

	public static void main(String[] args) {
		System.out.println("Number of coins");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(arrangeCoins(n));
	}
	static int arrangeCoins(int n) {
		int count =0;
		int i = 1;
		while(i<=n) {
			n=n-i;
			i++;
			count++;
		}
		return count;
        
    }

}
