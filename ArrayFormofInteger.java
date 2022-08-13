import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//989. Add to Array-Form of Integer
public class ArrayFormofInteger {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {2,1,5};
		int k=806;
		System.out.println(addToArrayForm(num,k));
	}
	
	public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        
        int i = num.length;
        while(--i >= 0 || k > 0) {
            if(i >= 0)
                k += num[i];
            
            list.add(k % 10);
            k /= 10;
        }
        Collections.reverse(list);
        
        return list;
        
    }

}
