import java.util.ArrayList;

	


public class ListDemo {

	
	
	public static void main(String [] args) { 
		// Class of Nov 29 practice using arrays
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.remove(1);
		list.set(2, 4);
		list.remove(new Integer(3));
		list.add(list.indexOf(4));
		
		for (int i = 0; i < list.size(); i=i+1) {
			if (list.get(i) == 2) {
				list.remove(i);      //List collapses when an element is taken away, for example if (1,2,3,4) is the array, if two is taken away, the function skips over 3, as it is in two spot
				i = i -1; 			// This means that when the list collapses, the counter will move back one, so it does not skip a number in the array
			}
		}
		int sum = 0;
		
		for (int i = list.size() - 1; i >= 0; i = i - 1) {
			if (list.get(i) == 2) {
				sum = sum + list.remove(i);
				list.remove(i);             //This for loop fixes the issue seen above by starting from the end of the array, and moving towards the beginning, menaing nothing will get skipped over
			}
		}
		
		ArrayList<Character> list1 = new ArrayList<Character>();
		list1.add('A');
		list1.add('B');
		list1.add('C');
		list1.add('D');
		list1.add('E');
		list1.add('a');
		list1.add('e');
		
		String vowels = "";
		//Arrays list is populated with random characters
		
		for (int i = list1.size() - 1; i >=0; i = i -1) {
			if ($CP.isVowel("" + list1.get(i))) {
				vowels = vowels + list1.get(i);
				
				list1.remove(i);
			}
		}
		
		System.out.println(list1);
	} //end main
	
	
} //end class
