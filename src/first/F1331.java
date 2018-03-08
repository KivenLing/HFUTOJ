package first;

import java.util.Scanner;

public class F1331 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextLine()) {
			String initNum = in.nextLine();
			while(!isSame(initNum)) {
				System.out.print(initNum + "--->");
				long num = Long.parseLong(initNum);
				long negNum = Long.parseLong(changNum(initNum));
				initNum = Long.toString(num + negNum);
			}
			System.out.println(initNum);
		}
		in.close();

	}
	
	private static boolean isSame(String num) {
		int size = num.length();
		int begin = 0;
		int end = size - 1;
		while(begin < end) {
			if(num.charAt(begin) != num.charAt(end))
				return false;
			begin++;
			end--;
		}
		return true;
	}
	
	private static String changNum(String num) {
		char[] newNum = new char[num.length()];
		int tail = num.length() - 1;
		for (int i = 0; i < newNum.length && tail >= 0; i++, tail--) {
			newNum[i] = num.charAt(tail);
		}
		return String.valueOf(newNum);
	}
}
