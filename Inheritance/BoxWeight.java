package Inheritance;

public class BoxWeight extends Box{
	double weight;
	public BoxWeight() {
		this.weight=-1;
	}
	
	public BoxWeight(double w, double h,double weight, double l) {
		super(l,h,w);
		this.weight=weight;
		
	}
}
