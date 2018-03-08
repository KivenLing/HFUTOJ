package first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
//wrong
public class F1262 {

	public static void main(String[] args) {
		Set<List<Integer>> numSet = new HashSet<>();
		numSet.add(new ArrayList<>(Arrays.asList(1, 2, 3, 0)));
		numSet.add(new ArrayList<>(Arrays.asList(1, 2, 0, 3)));
		numSet.add(new ArrayList<>(Arrays.asList(0, 2, 1, 3)));
		numSet.add(new ArrayList<>(Arrays.asList(2, 0, 1, 3)));
		numSet.add(new ArrayList<>(Arrays.asList(2, 3, 1, 0)));
		numSet.add(new ArrayList<>(Arrays.asList(2, 3, 0, 1)));
		numSet.add(new ArrayList<>(Arrays.asList(0, 3, 2, 1)));
		numSet.add(new ArrayList<>(Arrays.asList(3, 0, 2, 1)));
		numSet.add(new ArrayList<>(Arrays.asList(3, 1, 2, 0)));
		numSet.add(new ArrayList<>(Arrays.asList(3, 1, 0, 2)));
		numSet.add(new ArrayList<>(Arrays.asList(0, 1, 3, 2)));
		numSet.add(new ArrayList<>(Arrays.asList(1, 0, 3, 2)));
		Scanner in = new Scanner(System.in);
		int times = in.nextInt();
		for (int i = 0; i < times; i++) {
			List<Integer> arr = new ArrayList<>();
			for(int j = 0; j < 4; j++)
				arr.add(in.nextInt());
			if (numSet.contains(arr))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		in.close();

	}

}
