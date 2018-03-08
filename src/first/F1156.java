package first;

import java.util.Scanner;

public class F1156 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.nextLine();
		for(int i = 0; i < n; i++) {
			String line = input.nextLine();
			int numCount = 0;
			for(int j = 0; j < line.length(); j++) {
				if(line.charAt(j) >= '0' && line.charAt(j) <= '9')
					numCount++;
			}
			System.out.println(numCount);
		}
		input.close();
	}
}
