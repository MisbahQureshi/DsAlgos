import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("enter two numbers: ");
		int number= in.nextInt();
		int number2=in.nextInt();
		
		isArmstrong(number);
		isArmstrong(number2);
	}
	
	public static void isArmstrong(int number) {
		int num1 = number;
		int ans=0;
		while(num1>0) {
			int rem = num1 % 10;
			ans += Math.pow(rem, 3);
			num1/=10;
			}
		
		if(ans == number)
            System.out.println(number + " is an Armstrong number.");
//        else
//            System.out.println(number + " is not an Armstrong number.");
	}

	}

