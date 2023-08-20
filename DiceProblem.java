import java.util.ArrayList;
			 
public class DiceProblem {

	public static void main(String[] args) {
		int target =4;
		dice("",target);
		System.out.println();
		System.out.println(diceRoll("",target));
	}
	
	static void dice(String p, int target) {
		if(target==0) {
			System.out.print(p+" ");
			return;
		}
		for (int i = 1; i <= 6 && i<=target; i++) {
			dice(p+i,target-i);
		}
	}
	
	static ArrayList<String> diceRoll(String p, int target) {
		if(target==0) {
			ArrayList<String> list = new ArrayList<>();
			 list.add(p);
			 return list ;
		}
		ArrayList<String> list = new ArrayList<>();
		for (int i = 1; i <= 6 && i<=target; i++) {
			list.addAll(diceRoll(p+i,target-i));
		}
		return list;
	}

}
