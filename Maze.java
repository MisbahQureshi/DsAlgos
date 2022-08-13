
public class Maze {
	
	static int count=0;

	public static void main(String[] args) {
		
		int arr[][] = {	{0, 0, 0, 1},
						{1, 0, 1, 0},
						{1, 0, 1, 0},
						{0, 1, 0, 0},
						{0, 0, 0, 0}
				};
		
		fun(0,0,arr);
		if(count>0) {
			System.out.println("Path possible");
			System.out.println("number of possible path(s): " +count);
		} else{
			System.out.println("not possible");
		}

	}
	
	public static void fun(int row, int col, int [][]arr) {
		
		if(row>arr.length-1 || col>arr[0].length-1) {return;}
		if(arr[row][col]==1) {return;}
		
		if(row==arr.length-1 && col==arr[0].length-1) {
			count++;
			
			return;
		}
		
		fun(row+1, col,arr);
		fun(row+1, col+1,arr);
		fun(row, col+1,arr);
	}

}
