import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadingTextFiles {

	public static void print(double[] s) {
		
		String mid = "";
		for (double a : s) {
			mid += a + ", ";
			
		}
		System.out.println("[" + mid.substring(0, mid.length() - 2) + "]");
	}
	
	public static void main (String [] args)  {
		
		
	/*	double[] a = readToArray("randomDataExtract1.txt");
		for (int i = 0; i < a.length; i = i + 1) {
			System.out.println(a[i]);
		}
		
		
		double sum = findSum(a);
		System.out.println("Sum is "+sum);
		
		*/
		
		System.out.println(euler1(1000));
		//System.out.println(euler2(4000000));
		
		ArrayList<Double> l = readToList("randomDataExtract1.txt");
		System.out.println(l);
		
		System.out.println(findAS(l));
		
		//Weird reference befcause it is returning a double[]
		print(findMaxMin(l));
		
		//System.out.println(findMin(l));
	
	}
	
/*	public static double findSum(ArrayList<Double> l) {
		
		double sum = 0;
		
		for (int i = 0; i < l.size(); i = i + 1) {
			sum = sum + l.get(i);
		}
		
		return sum;
	}
	
	
	
	public static double findSum(double[] a) {
		
		double sum = 0;
		
		for (int i =0; i < a.length; i = i + 1) {
			sum = sum + a[i];
		}
		return sum;
	}
	
	*/
	
	public static void euler2(int n) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		
		int nTerm = list.get(0) + list.get(1);
		list.add(nTerm);
		
		while (nTerm < n) {
			int length = list.size();
			nTerm = list.get(length-2) + list.get(length-1);
			list.add(nTerm);
		}
		list.remove(list.size() -1);
			
			
	}
	
	
	public static int euler1(int n) {
		int count = 0;
		for (int i = 0; i < n; i = i + 1) {
			if (i % 3 == 0) {
				count = count + i;
			}else if (i % 5 == 0) {
				count = count + i;
			}
		}
		return count;
	}
	
	/**
	 * 
	 * @param str
	 * @return
	 */
	public static double[] readToArray(String str) {
		
		
		try {
			
		
			//A file is COLLECTION. 
			//		Do we know the size of a collection before reading through it?
			//		We want to copy this into an array.  Do we need to know the size of an array before using it?
			
			//Step 1: Create a File object that uses teh passing string as the file name
			File file = new File (str);
			//Step 2: Create a scanner object that uses the file object
			Scanner s = new Scanner(file);
			//Step 3: Create a counter and set it to zero
			int counter = 0;
			//Step 4: Use a while has next loop to count each line
			while (s.hasNext()) {
				s.nextDouble();
				counter = counter + 1;
			}
			//Step 5: Outside the loop create your array and set the size to counter
			double[] arr = new double[counter];
			//Step 6: Create a new scanner object using file
			Scanner ss = new Scanner(file);
			//Step 7: Use a while has next loop but this time read each line into the array
			int i = 0;
			//FYI - YOu could equally use a for loop here because you know it runs for (int i = 0; i < counter; i = i + 1) 
			while (ss.hasNext()) {
				arr[i] = ss.nextDouble();
				i = i + 1;		
			}
			//Step 8: Return array
			
			return arr;
			
		}
		catch (Exception e) {
			System.out.println("File not found");
		}
		
		System.out.println("Goleafs");
		
		//Why does this need to be here?
		//If the file name is bad the program jumps to catch and then won't return anything.  This returns
		//null if the file name is bad
		return null;
		
		
	}
	
	
	//Problem: With readto Array we had to loop through the file twice.  Once to find the number of numbers and 
	//a second time to read it.  This is really inefficient. 
	//Question:  Arrays are static data structures meaning you have to know the size in advance and fix that size
	//			 What other group of data structure might be useful here? 
	//Answer: 	ArrayLists are dynamic data structures meaning I don't need to know the size in advance.  Read the file
	//			and add the elements
	
	public static ArrayList<Double> readToList(String str) {
		
		try {
			
			File file = new File (str);
			
			Scanner s = new Scanner(file);
			
			ArrayList<Double> list = new ArrayList<Double>();
			
			while (s.hasNext()) {
				list.add(s.nextDouble());
			}
			return list;
		
		}
		catch (Exception e) {
			System.out.println("file not found");
		}
		
		return null;
	}
	
	public static String findAS(ArrayList<Double> l) {
		double sum = 0;
		
		for (int i = 0; i < l.size(); i = i + 1) {
			sum = sum + l.get(i);
		}
		double average = sum / l.size();
		
		return ("This is the average " + average + " ------" + " This is the sum " + sum) ;
	}
		
	public static double[] findMaxMin(ArrayList<Double> l) {
		double max = l.get(0);
		double min = l.get(0);
	
		
		for (int i = 0; i < l.size(); i = i + 1) {
			if (l.get(i) > max) {
				max = l.get(i);
			}
			if (l.get(i) < min) {
				min = l.get(i);
			}
		}
		
	
		double[] result = {max,min};
		result[0] = max;
		result[1] = min;
		
		return result;
		
	}
	
	public static double findMin(ArrayList<Double> l) {
		double min = l.get(0);
		
		for (int i = 0; i < l.size(); i = i + 1) {
		
			if (l.get(i) < min) {
				min = l.get(i);
			}
		}
		
		return min;
	}
	
	public static double findMax(ArrayList<Double> l) {
		double max = l.get(0);
		
		for (int i = 0; i < l.size(); i = i + 1) {
		
			if (l.get(i) < max) {
				max = l.get(i);
			}
		}
		
		return max;
	}
	
		
}
 