
public class LinearSearchRec {

	public static void main(String[] args) {
		int[]arr= {1,5,67 ,7,8,9,23,56};
		int target=67;
		int i=0;
		System.out.println(fun(arr,target,i));
	}
	
	static int fun(int[]arr, int target, int i) {
		if(i==arr.length)return -1;
		if(arr[i]== target) return i;
		else return fun(arr,target,i+1);
	}


}
