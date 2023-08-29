package Inheritance;

public class Main {

	public static void main(String[] args) {
	//		Box box = new Box(4,6,6);
	//		System.out.println(box.l + " "+ box.w + " "+  box.h);
			BoxWeight box = new BoxWeight();
			BoxWeight box2 = new BoxWeight(1,4,5,7);
			System.out.println(box.h+ " "+ box.weight);
			System.out.println(box2.h+ " "+ box2.weight+" "+ box2.l + " " + box2.w);
	}

}
