import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		
	}
	
	public static int tournamentSelection() {
		Scanner s = new Scanner(System.in);
		String game1 = s.next();
		String game2 = s.next();
		String game3 = s.next();
		String game4 = s.next();
		String game5 = s.next();
		String game6 = s.next();
		int count = 0;
	
		if (game1 == "W") {
			count++;
		}
		if (game2 == "W") {
			count++;
		}
		if (game3 == "W") {
			count++;
		}
		if (game4 == "W") {
			count++;
		}
		if (game5 == "W") {
			count++;
		}
		if (game6 == "W") {
			count++;
		}
		if (count == 5 || count == 6) {
			return 3;
		}else if (count == 4 || count == 3) {
			return 2;
		}else if (count == 1 || count == 2) {
			return 1;
		}else {
			return -1;
		}
	
	
	
	}
	
	
	
}
