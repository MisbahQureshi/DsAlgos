
public class CountingPaths {

	public static void main(String[] args) {
		int[][]arr ={{9,2,3},{4,5,6},{7,8,9}};
		int i = arr.length;
		int j = arr[0].length;
		System.out.println(count(i,j));
		printThePath("",i,j);
		
		System.out.println();
		
		System.out.println(countD(i,j));
		printThePathD("",i,j);

	}
	static int count(int r, int c) {
		if(r==1 || c==1) {
			return 1;
		}
		int left=count (r-1,c);
		int right=count (r,c-1);
		
		return left + right;  
	}
	
	static void printThePath(String p,int r, int c) {
		if(r==1 && c==1) {
			System.out.print(p+" ");
			return;
		}
		if(r>1)printThePath (p+'D',r-1,c);
		if(c>1)printThePath (p+'R',r,c-1);
		
		
	}
	
	
	//diagonal
	static int countD(int r, int c) {
		if(r==1 || c==1) {
			return 1;
		}
		int left=countD (r-1,c);
		int right=countD (r,c-1);
		int diag=countD (r-1,c-1);
		
		return left + right + diag;  
	}
	
	static void printThePathD(String pd,int r, int c) {
		if(r==1 && c==1) {
			System.out.print(pd+" ");
			return;
		}
		if(r>1)printThePathD (pd+'V',r-1,c);
		if(c>1)printThePathD (pd+'H',r,c-1);
		if(r>1 && c>1)printThePathD (pd+'D',r-1,c-1);
				
	}

}
