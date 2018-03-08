package first;

import java.util.Scanner;

public class F1283 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int l = 1; l <= n; l++) {
			int number = in.nextInt();
			int rate = 1;
			while(number > 0) {
				if(number % 2 == 0) {
					number /= 2;
					rate *= 2;
				}else 
					break;
			}
			System.out.println("Case #" + l + ": " + rate);
		}
		in.close();
	}

}
