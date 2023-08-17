
public class RotatedBSRec {

	public static void main(String[] args) {
		int[]arr= {5,6,7,8,9,1,2,3};
		int target=2;
		System.out.println(fun(arr,target, 0, arr.length-1));
	}
	
	static int fun(int[]arr, int target, int s, int e) {
		if(s>e)return -1;
		int m = s+ (e-s)/2;
		if(arr[m]==target)return m;
		
		if(arr[s]<=arr[m]) {
			if(target>=arr[s]&&target<=arr[m]) return fun(arr,target,s,m-1);
			else return fun(arr,target,m+1,e);
		}
		if(target>=arr[m]&&target<=arr[e])return fun(arr,target,m+1,e);
		return fun(arr,target,s,m-1);
	}

}
