
public class rs {

		public static int count = 0;
		
		public static void main(String[] args) {
			
			func(1,5,"");
			System.out.println("ways: " +count);
		}
		
		public static void func(int x, int y, String z) {
			if(x==y) {
			count++;
			System.out.println(z + x);
			return;
				}
			
			if(x>y) {return;}
		
			func(x+1,y, z+x);
			func(x+2,y, z+x);
			func(x+3,y, z+x);
			
			
		}

}
