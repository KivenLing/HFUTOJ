package first;

import java.util.Scanner;

public class F1158 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNextLine()) {
			int start = in.nextInt();
			int end = in.nextInt();
			if(start > end) {
				int temp = start;
				start = end;
				end = temp;
			}
			int[] sum = new int[2];
			for(int i = start; i <= end; i++) {
				int sign = i % 2;
				sum[sign] += (int)Math.pow(i, 2 + sign);
			}
			System.out.println(sum[0] + " " + sum[1]);
		}
		in.close();
	}

}
