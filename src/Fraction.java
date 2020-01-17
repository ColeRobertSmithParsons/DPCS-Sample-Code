//A class is a 'blueprint' am object is an instance of the class
//The blueprint to build the bike is the class, a bike is an object
//You can make as many objects from a class as you want
public class Fraction {
	
	
	//Attributes/Fields
	//You should always make fields private
	//This means that they cannot be accessed without going through the class
	//private fields that must be modified or accessed need mutator (Set) and accessor (get) methods
	//Suggestion: Never use the same variable name that a field is named in your class
	
	private int num;
	private int den;
	private static int fractionCount = 0;
	
	//Constructors
	//if no constructor is written a default constructor exists - takes no parameters sets
	//Numeric = 0,
	//Booleans = false,
	//Reference types = null
	
	//Constructors are special instance methods that are only called once at time of construction
	//A constructor does not indicate a return type
	// A constructor is always named using the class name
	
	public Fraction() {
		
	}
	
	public Fraction(int n, int d) {
		num = n;
		if (d !=0) {
			den = d;
		}else {
			den = 1;
		}
		fractionCount = fractionCount + 1;
	}
	
	//Behaviors
	
	
	//Accessor (Get) Methods
	public int getNum() { return num; }
	public int getDen() { return den; }
	public static int getFractionCount() {	return fractionCount;}
	
	//Mutator (set) Methods
	public void setNum(int n) {
		num = n;
	}
	 
	public void setDen(int d) {
		if (d != 0) {
		den = d;
		}
	}
	 
	public void reduce() {     //Instance Method 
		//Step 1. Find Greatest Common Factor (GCF)
		int gcf = 1;
		
		for (int i = 2; i < Math.min(this.num, this.den); i = i + 1) {
			
			if (this.num % i == 0 && this.den % i == 0) {
				
				gcf =i;
			}
		}
		
		//Step 2. Reduce the num and den by the gcf
		num = num/gcf;
		den = den/gcf;
		
		System.out.println(this.num + "/" + this.den);
	}
	
	public void scale(int a) {
		//num = num * a;
	}
	
	public void multiplyFractions(int a, int b) {
	
		int c = this.num;
		int d = this.den;

		
		System.out.println("here: " +  (a * c) + "/" + (b * d));
		
	}
	
	public void greaterOrSmallerThanOne() {
		int x = this.num;
		int y = this.den;
		
		if (x==y) {
			System.out.println("The fraction = 1");
		}else if (x>y) {
			System.out.println("The fraction is greater than 1");
		}else {
			System.out.println("The fraction is less than 1");
		}
	}
	
	
	
	
}
