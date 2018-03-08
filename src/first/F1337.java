package first;

import java.util.Scanner;

public class F1337 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		for (int i = 0; i < n; i++) {
			String expre = in.nextLine();
			int[] nums = new int[3];
			int indexEx = 0;
			for(int j = 0; j < 3 && indexEx < expre.length(); j++) {
				nums[j] = 0;
				char ch = expre.charAt(indexEx);
				while(Character.isDigit(ch)) {
					nums[j] = nums[j] * 10 + (ch - '0');
					indexEx++;
					if(indexEx >= expre.length())
						break;
					ch = expre.charAt(indexEx);
				}
				indexEx++;	
			}
			System.out.println(nums[0] + nums[1] - nums[2]);
		}
		in.close();

	}
}
