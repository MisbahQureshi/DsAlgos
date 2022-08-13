/*A person is eligible to vote if his/her age is greater than or equal to 18. Define a method 
 * to find out if he/she is eligible to vote.
 */

import java.util.Scanner;

public class VoteEligiblity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter age: ");
		int num1 = in.nextInt(); 
		System.out.println(eligibleToVote(num1));
	}
	
	public static boolean eligibleToVote(int age) {
		
		return age>=18;
	}

}
