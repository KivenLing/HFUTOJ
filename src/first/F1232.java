package first;

import java.util.Scanner;

public class F1232 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		while(!str.equals("#")) {
			if(str.equals("")) {
				System.out.println();
				break;
			}
			char[] letters = str.toCharArray();
			int maxLength = 0;
			int maxL = 0, maxR = 0;
			int l = 0;
			int r = 0;
			int length;
			for(; l < letters.length; l++) {
				for(r = l + maxLength; r < letters.length; r++) {
					length = r - l + 1;
					if(isReserve(letters, l, r)) {
						maxLength = length;
						maxL = l;
						maxR = r;
					}
				}
				if(maxLength >= letters.length - l)
					break;
			}
			String maxReserveStr = str.substring(maxL, maxR + 1);
			System.out.println(maxReserveStr);
			str = in.nextLine();
		}
		in.close();
	}

	private static boolean isReserve(char[] letters, int l, int r) {
		while(l <= r) {
			if(letters[l++] != letters[r--])
				return false;
		}
		return true;
	}
}
