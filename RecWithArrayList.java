import java.util.ArrayList;

public class RecWithArrayList {
	static ArrayList<Integer>list= new ArrayList<>();
	public static void main(String[] args) {
		int[]arr= {1,5,67 ,67,8,9,23,56};
		int target=67;
		int i=0;
		fun(arr,target,i);
		System.out.println(list);
	}
	
	static void fun(int[]arr, int target, int i) {
		if(i==arr.length)return;
		if(arr[i]== target) list.add(i);
		fun(arr,target,i+1);
	}

}
