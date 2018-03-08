package first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class F1267 {

	public static final int N = 10000007;
	public static void main(String[] args) {
		Map<List<Integer>, Integer> map = new HashMap<>();
		Scanner in = new Scanner(System.in);
		while(in.hasNextLine()) {
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			int y = f(a , b, c, map);
			System.out.println(y);
		}
		in.close();
	}
	
	private static int f(int a, int b, int c, Map<List<Integer>, Integer> map) {
		if(a < 0 || b < 0 || c < 0)
			return 2;
		if(a > 50 || b > 50 || c > 50)
			return 1;
		List<Integer> l1 = new ArrayList<>(Arrays.asList(a + 1, b + 2, c + 3));
		List<Integer> l2 = new ArrayList<>(Arrays.asList(a - 3, b - 2, c - 1));
		int ans1, ans2;
		if(map.containsKey(l1)) {
			ans1 = map.get(l1);
		}else {
			ans1 = f(a + 1, b + 2, c + 3, map);
			map.put(l1, ans1);
		}
		
		if(map.containsKey(l2)) {
			ans2 = map.get(l2);
		}else {
			ans2 = f(a - 3, b - 2, c - 1, map);
			map.put(l2, ans2);
		}
		
		return (ans1 + ans2) % N;
	}
}
