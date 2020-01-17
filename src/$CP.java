import java.util.ArrayList;
import java.util.Arrays;

public class $CP {


	public static void main(String[] args) {
		//Variables
		//int x,y,z = 0;
		//String str1,str2,str3 = "";
		
		//Test Code
		//Test Base10toBase2
		//System.out.println(base2To10B(111011001));
		//System.out.println(base10toBase2(567));
		
		//int[] a = {12,2,4,5,8,5,2,5,1,8,2,4,1,4,3,2};
		//int[] b = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		//System.out.println(magicSquares(b));
		
		//String[] arr = {"cat", "dog", "fish", "apple"};
		//String min = findAlphaSmallest(arr);
		//System.out.println(min);
		
		//System.out.println("cat".compareToIgnoreCase("dog"));
		//System.out.println("dog".compareToIgnoreCase("cat"));
		//System.out.println(printMatrix(4,3));
		
		//int [] result = lengthMinMax(400,2,5);
		//System.out.println(Arrays.toString(result));
		
		//int[] a = {12,2,3,4,5,6,7,8,9,1,3,4,2};
		//int b = 5;
		//System.out.println(includedOrNot(a, b));
		
		//Reference type = object type (constructing the array list)
		
	
	}
	
	public static boolean isVowel(char c) {
		System.out.println("char");
		return c == 'A' ||c == 'a' ||c == 'e' ||c == 'i' ||c == 'o' ||c == 'u' ||c == 'y' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'Y';	
	}
	
	public static boolean isVowel(String s) { // Overlaoded with previous function
		String v = "aeiou";
		System.out.println("String");
		s=s.toLowerCase();
		if (v.indexOf(s) == -1) {
			return false;
		}
		return true;
	}
	
	
	
	//Class November 20
	public static int[][] HLPNOV201714() {
		int [] values = {7,-3,9,1,-6,-5,1};
		int [] rowc = {1,1,3,3,4,7};
		int [] col = {0,2,4,2,1,4,5};
		
		//when run should return the 6 by 6  array given in the question
		
		
		return null;
	}
	
	//Class of November 18
	public static int[] lengthMinMax(int a, int b, int c) {
		int[] arr = new int[a];
		for (int i = 0; i < arr.length; i = i +1) {
			arr[i] = (int)(Math.random()*(c + 1 - b)+ b);
		}
		return arr;				
	}
	
	public static boolean includedOrNot(int a[], int b) {
		boolean g = false;
		for (int n = 0; n < a.length; n = n + 1) {
			if (a[n] == b) {
				g = true;
			}
		}
		return g;
	}
	
	
	public static int printMatrix(int r, int c) {
		
		for (int i = 0; i < r; i = i + 1) {
			System.out.println("");
			int count = 1;
			for (int cole = 0; cole < c; cole++) {
				if (count > cole) {
					count = 1;
				}
				System.out.print(count + " ");
				count++;
			}
		}
		
return 0;
		
	}
	
	/*public static int printMatrixTwo(int r, int c) {
		for (int j = 1; j <= r; j++) {
			int count = 0;
			for (int k = 1; k<= c; k++) {
				count = count + 1;
			}
			System.out.print(count);
		}
	}
	
	*/
	
	
	/**
	 * 
	 * @param s
	 */
	
	//Class of Oct 15 2019
	
	/**
	 * This function tkes an array of strings and finds the largest value alphebetically. 
	 * If the array is empty the array returns null
	 * @param s
	 * @return
	 * 
	 * precondition: the array can be any length, but must exist
	 * postcondition: The array is left unchanged
	 */
	public static String findAlphaSmallest(String[] s) {
		
		//Works but violates postcondition
		//Arrays.sort(s);
		//return s[0];
		
		String min = s[0];
		for (int i=0; i < s.length; i = i + 1) {
			if (s[i].compareToIgnoreCase(min) < 0) {
				min = s[i];
			}
		}
		return min;
	}
	
	
	//Class of Oct 4 2019 (Practice onstest questions
	
	public static String magicSquares(int[] nums) {
		if (nums.length != 16) {
			return "not magic";
		}
		
		int x = nums[0] + nums[1] + nums[2] + nums[3];
		int y = nums[4] + nums[5] + nums[6] + nums[7];
		int z = nums[8] + nums[9] + nums[10] + nums[11];
		int a = nums[12] + nums[13] + nums[14] + nums[15];
		
		int b = nums[0] + nums[4] + nums[8] + nums[12];
		int c = nums[1] + nums[5] + nums[6] + nums[7];
		int d = nums[2] + nums[6] + nums[10] + nums[14];
		int e = nums[3] + nums[7] + nums[11] + nums[15];
		
		if (a==b && a==c && a==d && a==e && a==x && a==y && a==z) {
			return "magic";
		}else {
			return "not magic";
		}
	}
	
	
	
	
	//Class of Sept 20 2019
	
	public static int base10toBaseN(int n, int base) {
	
		String r = "";
		
		while (n>0) {
			int x=n%base;
			n = n/base;
			r = r + x;
		}
		return Integer.parseInt(r);
		
	}
	
	public static int base10toBase2(int n) {
		
		String r = "";
		
		while (n>0) {
			int x=n%2;
			n = n/2;
			r = r + x;
		}
		return Integer.parseInt(r);
		
	}
	
	
	
	
	
	//Class of Sept 23
	
	public static void print(String s) {
		System.out.println(s);
	}
	
	/**
	 * 
	 * @param str
	 * @param strtwo
	 * @return
	 */
	
	public static String addStrings(String str, String strtwo) {		
		return str + strtwo; 	
	}

	/**
	 * 
	 * @param str
	 * @return
	 */
	
	
	public static String isEvenString(String str) {
		if (str.length()% 2 == 0) {
			return "true";
		}else {
			return "false";
		}
	}
	
	/**
	 * 
	 * @param str
	 * @param n
	 * @return
	 */
	public static String pullN(String str, int n) {
		int a = str.length();
		if (n>=a) {
			return str;
		}else {
			return str.substring(0,n);
		}
	}
	
	/**
	 * 
	 * @param str
	 * @return
	 */
	public static String findMiddleOdd(String str) {
		int a = str.length()/2;
		return str.substring(a,a+1);
}
	/**
	 * 
	 * @param str
	 * @return
	 */
	public static String findMiddle(String str) {
		int a = str.length();
		if (a % 2 == 0) {
			return str.substring(a,a+1);
		}else{
			return str.substring(a+1,a+1);
		}
	}
	
	/**
	 * 
	 * @param str
	 * @param strtwo
	 * @return
	 */
	public static String findLonger(String str, String strtwo) {
		int a=str.length();
		int b=strtwo.length();
		if (a>b) {
			return str;
		}else {
			return strtwo;
		}
	}
	
	/**
	 * 
	 * @param str
	 * @param strtwo
	 * @return
	 */
	public static String addStringsSmallLarge(String str, String strtwo) {
		int a =str.length();
		int b =strtwo.length();
		if(a==b) {
			return str+strtwo;
		}else if(a>b){
			return str+strtwo;
		}else {
			return strtwo+str;
		}
	}
	/**
	 * 
	 * @param str
	 * @return
	 */
	public static String swapFirstAndLast(String str) {
		int a=str.length();
		return str.substring(a-1,a) + str.substring(1,a-1) + str.substring(0,1);
	}
	
	public static boolean checkFront(String str, String strtwo) {
		int a =strtwo.length();
		if (str.substring(0,a)==strtwo.substring(0, a)) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean checkEnd(String str, String strtwo) {
		int a = strtwo.length();
		int b = str.length();
		if(str.substring(b-a,b)==strtwo.substring(0,a)) {
			return true;
		}else {
			return false;
		}
	}

	//Class of Sept 26 2019
	
	/**
	 * This method takes a base 2 value and returns a base 10 value
	 * @param n
	 * @return
	 * 
	 * pre-condition n can only contain 1 and 0 values
	 */
	public static int base2to10A(int n) {
		int pwr = 0;
		int r = 0;
		
		while(n>0){
			
			int x = n % 10;
			n /= 10;
			
			//cast Math.pow(2,pwr) to an int
			//Casting is the process of changing type
			//When we cast a double to an int we chop off decimal
			r += x * Math.pow(2,pwr);
			pwr++;
		}
		
		return r;
		
	}
	
	public static int base2To10B(int n) {
		
		/*
		 * Convert to a string instead of using the mod int dov process
		 */
		//Convert n into a string?
		
		String value = "" + n;
		int pwr = 0;
		int r =0;
		
		//Bread and Butter algorithm: looping through a string and accessing each element
		
		for (int i= value.length() - 1; i >= 0; i = i +1) {
			
			//Step one: Access the right most digit cast to int
			
			int x = Integer.parseInt(value.substring(i,i+1));
			
			r=r+ x*(int)Math.pow(2,pwr);
			pwr = pwr +1;
			
			//r=r + x * (int)Math.pow(2,pwr);
			
		}
		return r;
	}
	
	
}



	

