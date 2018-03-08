package first;

import java.util.Scanner;

public class F1268 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextLine()) {
			String time = in.nextLine();
			String[] times = time.split(":");
			int hour = Integer.parseInt(times[0]);
			int minute = Integer.parseInt(times[1]);
			int sum = hour + minute;
			int oneSum = 0;
			while(sum > 0) {
				oneSum += (sum % 2);
				sum /= 2;
			}
			if(oneSum % 2 == 0)
				System.out.println("Stay~~");
			else
				System.out.println("Run!");
		}
		in.close();
	}

}
