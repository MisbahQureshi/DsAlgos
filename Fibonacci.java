
public class Fibonacci {

	public static void main(String[] args) {
		int number = 13;
		// TODO Auto-generated method stub
		int a = 0;
		int b = 1;
		System.out.print(a + " " + b);
		for(int i = 0; i<number-2;i++ ) {
			int temp = b;
			b= a + b;
			a=temp;
			
			System.out.print(" " + b);
		}
	}
	

}
