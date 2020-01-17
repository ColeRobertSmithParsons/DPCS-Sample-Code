
public class Circle {
	
	
//Attributes
	private double radius;
	private int x;
	private int y;
	private final double PI = Math.PI;

//Constructors
	public Circle() { }
	public Circle(int r) { radius = r; }
	
	public Circle (int r, int x, int y) {
		radius = r;
		this.x = x;
		this.y = y;
	}
	

	
//Behaviors
	
	public double getRadius() { return radius;}
	
	public int getX() { return x; }
	
	public int getY() { return y; }
	
	public void setRadius (double r) {
		if (r>=0) {
			radius = r;
		}else{
			radius = 0;
		}
	}
	
	public void setX(int x) { this.x = x; }
	public void setY(int y) { this.y = y; }
	
	public void shrink (int scale) {
		radius = radius / scale;
	}
	
	public double getCircumference() {
		return 2*PI*radius;
	}
	
	public double getDiameter() {
		return 2*radius;
	}
	
}
