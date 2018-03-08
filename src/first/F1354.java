package first;

import java.util.Scanner;

public class F1354 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			int aWeight = in.nextInt();
			int aNum = in.nextInt();
			int bWeight = in.nextInt();
			int bNum = in.nextInt();
			int ans = Math.abs(aWeight * aNum - bWeight * bNum);
			System.out.println(ans);
		}
		in.close();
	}

}
