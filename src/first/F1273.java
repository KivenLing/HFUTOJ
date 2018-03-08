package first;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class F1273 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			int number = in.nextInt();
			TreeMap<Integer, Integer> map = 
					new TreeMap<Integer, Integer>();
			int begin = 2;
			while(number > 1) {
				if(number % begin == 0) {
					if(map.containsKey(begin)) {
						map.put(begin, map.get(begin) + 1);
					}else
						map.put(begin, 1);
					number /= begin;
				}else
					begin = getNextPrime(begin);
			}
			Map.Entry<Integer, Integer> entry = map.firstEntry();
			System.out.print(entry.getKey() + "^" + entry.getValue());
			for(Map.Entry<Integer, Integer> entry2 : 
				map.entrySet()) {
				if(!entry2.equals(entry)) {
					System.out.print("X" + entry2.getKey() +
							"^" + entry2.getValue());
				}else
					continue;
			}
			System.out.println();
		}
		in.close();
	}
	
	private static boolean isPrime(int number) {
		int k = (int) Math.sqrt(number);
		int i;
		for(i = 2; i <= k; i++) {
			if(number % i == 0)
				break;
		}
		if(i <= k)
			return false;
		return true;
	}
	
	private static int getNextPrime(int begin) {
		for(int i = begin + 1; i <= 10007; i++)
			if(isPrime(i))
				return i;
		return -1;
	}
}
