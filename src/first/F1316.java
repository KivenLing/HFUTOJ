package first;

import java.util.Scanner;

public class F1316 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			int n = in.nextInt();
			int[] numbers = new int[n];
			for(int i = 0; i < n; i++)
				numbers[i] = in.nextInt();
			int sign = n % 2 - 1;
			int midIndex = n / 2;
			double mid = (double)(numbers[midIndex] + 
					numbers[midIndex + sign]) / 2;
			System.out.printf("%.2f\n", mid);
		}
		in.close();
	}

}
