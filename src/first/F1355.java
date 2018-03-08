package first;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class F1355 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			int num = in.nextInt();
			Set<Integer> power = new TreeSet<>();
			for (int j = 0; j < num; j++) {
				power.add(in.nextInt());
			}
			int rank = power.size() - in.nextInt() + 1;
			int rIndex = 1;
			int ans = 0;
			for (int p : power) {
				if(rIndex == rank) {
					ans = p;
					break;
				}
				rIndex++;
			}
			System.out.println(ans);
		}
		in.close();
	}
}
