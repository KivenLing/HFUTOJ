package first;

import java.util.Scanner;
//ÎÄ¼þ½áÊø·û
public class F1240 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextLine()) {
			int num = in.nextInt();
			int sum = 0;
			int temp = num;
			while(temp > 0) {
				sum += temp % 10;
				temp /= 10;
			}
			if(num % sum == 0)
				System.out.println("yes");
			else
				System.out.println("no");
		}
		in.close();
	}

}
