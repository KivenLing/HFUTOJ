package first;

import java.util.Arrays;
import java.util.Scanner;

public class F1321 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int n = in.nextInt();
			int[] numbers = new int[n];
			for (int i = 0; i < numbers.length; i++) {
				numbers[i] = in.nextInt();
			}
			Arrays.sort(numbers);
			int neg = 0;
			int act = n - 1;
			int count = 0;
			while (act > neg && numbers[neg] < 0 && numbers[act] > 0) {
				if (-numbers[neg] == numbers[act]) {
					count++;
					act--;
					neg++;
				} else if (-numbers[neg] > numbers[act]) {
					neg++;
				} else {
					act--;
				}
			}
			System.out.println(count);
		}
		in.close();
	}

}
