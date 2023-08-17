
public class IfSortedArray {

	public static void main(String[] args) {
		int[]arr= {1,5,67 ,7,8,9,23,56};
		int index=0;
		System.out.println(fun(arr,index));
	}
	
	static boolean fun(int[]arr, int index) {
		if(index==arr.length-1)return true;
		return arr[index]<arr[index+1] && fun(arr,index+1);
		
	}

}
