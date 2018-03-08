package first;

import java.util.Scanner;

public class F1249 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextLine()) {
			int n = in.nextInt();
			int mid = n / 2 + 1;
			for(int i = 1; i <= n; i++) {
				int pos = Math.abs(i - mid);
				int line = mid - pos;
				for(int j = 1; j <= n; j++) {
					 if(j == mid + (line - 1) || j == mid - (line - 1)) 
						 System.out.print("*");
					 else
						 System.out.print(" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		in.close();
	}
}
