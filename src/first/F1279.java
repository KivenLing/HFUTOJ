package first;

import java.util.Scanner;

public class F1279 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		for(int line = 1; line <= n; line++) {
			String number = in.nextLine();
			int begin = 0;
			int next = 1;
			boolean like = true;
			for(; begin < number.length() - 1; begin++) {
				next = begin + 1;
				while(next < number.length()) {
					if(number.charAt(begin) == '1' && 
						number.charAt(next) == '3') {
					like = false;
					break;
					}
					next++;
				}
				if(!like)
					break;
			}
			System.out.print("Case #" + line + ": ");
			if (like) 
				System.out.println("Yes, I like it!");
			else
				System.out.println("No, it¡¯s terrible!");
		}
		in.close();

	}

}
