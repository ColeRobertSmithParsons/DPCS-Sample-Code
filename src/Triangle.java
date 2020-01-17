
public class Triangle {

	private int sideOne;
	private int sideTwo;
	private int sideThree;
	
	//Constructors
	public Triangle(){ }
	
	public Triangle (int a, int b, int c) {
		sideOne = a;
		sideTwo = b;
		sideThree = c;
		
		//System.out.println(a + b + c);
		
	}
	
	//Behaviors
	public int getSideOne() {return sideOne;}
	
	public int getSideTwo() {return sideTwo;}
	
	public int getSideThree() {return sideThree;}
	
	public void setSideOne(int a) {
		if (a>=1) {
			sideOne = a;
		}else {
			sideOne = 1;
		}
	}
		
	public void setSideTwo(int b) {
		if (b>=1) {
			sideTwo = b;
		}else {
			sideTwo = 1;
		}
	}
	
	public void setSideThree(int c) {
		if (c>=1) {
			sideThree = c;
		}else {
			sideThree = 1;
		}
	}
	
	//OtherMethods
	public void sideLengths() {
		System.out.println("Side Lengths: " + sideOne + " , " + sideTwo + " , " + sideThree);
	}
	
	public void typeOfTriangle() {
		if (sideOne == sideTwo && sideTwo == sideThree) {
			System.out.println("The tringale is equalateral");
		}
	}
}
