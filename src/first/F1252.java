package first;

import java.util.Scanner;

public class F1252 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int times = in.nextInt();
		for(int i = 0; i < times; i++) {
			int n = in.nextInt();
			int k = in.nextInt();
			int[] arr = new int[n];
			for(int j = 0; j < n; j++) 
				arr[j] = in.nextInt();
			int absPos = k % n;
			int pos = (n - absPos) % n;
			for(int index = 0; index < n; index++)
				if (index == n - 1)
					System.out.print(arr[(pos + index) % n]);
				else
					System.out.print(arr[(pos + index) % n] + " ");
			System.out.println();
		}
		in.close();
	}

}
