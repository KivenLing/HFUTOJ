package first;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class F1342 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		for(int i = 0; i < n; i++) {
			String numHex = in.nextLine();
			String res = toHexString(numHex);
			if(res.length() > 1 && res.charAt(0) == '0')
				res = res.substring(1);
			if(res.length() > 1 && res.charAt(0) == '0')
				res = res.substring(1);
			System.out.println(res);
		}
		in.close();
	}
	
	private static String toHexString(String numHex) {
		List<Character> binaryList = new ArrayList<>();
		int length = numHex.length();
		int toZeroByte = (4 - length % 4) % 4;
		for(int i = 0; i < toZeroByte * 3; i++) {
			binaryList.add('0');
		}
		Map<Character, String> hexMatchBin = new HashMap<>();
		Map<String, Character> binMatchOct = new HashMap<>();
		initHexTOBin(hexMatchBin);
		initBinTOOct(binMatchOct);
		for(char hex : numHex.toCharArray()) {
			char[] hexByte = hexMatchBin.get(hex).toCharArray();
			for (char c : hexByte) {
				binaryList.add(c);
			}
		}
		char[] hexByte = new char[binaryList.size() / 4];
		for(int i = 0; i < binaryList.size(); i += 4) {
			char[] byteToOct = new char[4];
			for(int j = i; j < i + 4; j++) {
				byteToOct[j - i] = binaryList.get(j);
			}
			hexByte[i / 4] = binMatchOct.get(String.valueOf(byteToOct));
		}
		return String.valueOf(hexByte);
	}
	
	private static void initHexTOBin(Map<Character, String> hexMatchBin) {
		String[] hexBinByte = {"000", "001", "010", "011",
				"100", "101", "110", "111"
		};
		for(int i = 0; i < hexBinByte.length; i++) {
			hexMatchBin.put((char)(i + '0'), hexBinByte[i]);
		}
	}
	
	private static void initBinTOOct(Map<String, Character> match) {
		String[] octBinByte = {"0000", "0001", "0010", "0011",
				"0100", "0101", "0110", "0111",
				"1000", "1001", "1010", "1011",
				"1100", "1101", "1110", "1111",};
		for (int i = 0; i < octBinByte.length; i++) {
			if(i < 10)
				match.put(octBinByte[i], (char)(i + '0'));
			else
				match.put(octBinByte[i], (char)(i - 10 + 'A'));
		}
	}
}
