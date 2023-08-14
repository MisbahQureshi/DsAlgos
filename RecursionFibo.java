
public class RecursionFibo {

	public static void main(String[] args) {
		int number = 20;
		System.out.print(fib(number));
		}
	
	static int fib(int n) {
		if(n<2)return n;
		return fib(n-1)+fib(n-2);
		
	}

	}
