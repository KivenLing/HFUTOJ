package first;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class F1345 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Set<Integer> primeSet = new TreeSet<>();
		primeSet.add(2);
		primeSet.add(3);
		int n = in.nextInt();
		for(int i = 0; i < n; i++) {
			int total = in.nextInt();
			int myID = in.nextInt();
			int startID = in.nextInt();
			int startNum = in.nextInt();
			int to = 1;
			while(startID != myID) {
				if(isPrime(startNum, primeSet)) {
					to = -to;
				}
				int tempId = (startID + to) % total;
				startID = tempId == 0 ? total : tempId;
				startNum++;
			}
			if(!isPrime(startNum, primeSet))
				System.out.println(startNum);
			else
				System.out.println("duang");
		}
		in.close();
	}
	
	private static boolean isPrime(int num, Set<Integer> primeSet) {
		if(primeSet.contains(num))
			return true;
		int end = (int) Math.sqrt(num);
		int lastPrime = 2;
		for (int tempPrime : primeSet) {
			if(tempPrime > end)
				break;
			if(num % tempPrime == 0)
				return false;
			lastPrime = tempPrime;
		}
		//update primeSet
		for(int i = lastPrime + 2; i <= end; i += 2) {
			if(isPrime(i, primeSet)) {
				if(num % i == 0)
					return false;
			}
		}
		primeSet.add(num);
		return true;
	}
}
