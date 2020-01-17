
public class FractionRunner {

	public static void main(String[] args) {
		
		Fraction f1 = new Fraction();
		Fraction f2 = new Fraction();
		
		f1.setNum(2);
		f1.setDen(4);
//		int a = f1.num;
//		int b = f1.den;
		System.out.println(Fraction.getFractionCount());
		f2.setNum(3);
		f2.setDen(4);
		System.out.println(Fraction.getFractionCount());
		//f2.scale(2);
		
		Fraction f3 = new Fraction();
		
		f3.setNum(6);;
		f3.setDen(5);
		System.out.println(Fraction.getFractionCount());
		//System.out.println(f1.num+"/"+f1.den);
 //Help???
		//System.out.println(f2.num+"/"+f2.den);
		
		f3.multiplyFractions(4,4);
		
		f3.reduce();
	
		f3.greaterOrSmallerThanOne();
	}
	
}
