//list of prime numbers between two numbers

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		primeList(num1,num2);
	}
	
	
	public static void primeList(int n, int n2) {
		for(int i=n; i<=n2; i++) {
			if(isPrime(i)==true) {
				System.out.println(i);
			}
		}
	}
	
	public static boolean isPrime(int a) {
		if(a<=1) {
			return false;
		}
		
		int c=2;
		while(c*c<=a) {
			if(a%c==0) {
				return false;
			} c++;
		} 
		
		return c*c>a;
	}
	

}
