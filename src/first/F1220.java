package first;

import java.util.ArrayList;
import java.util.Scanner;

public class F1220 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNextLine()) {
			String keyWord = in.nextLine().toLowerCase();
			int count = 0;
			char[] article = in.nextLine().toCharArray();
			ArrayList<String> words = spiltToWord(article);
			for(int i = 0; i < words.size(); i++) {
				String word = words.get(i);
				if(keyWord.equals(word))
					count++;
			}
			System.out.println(count);
		}
		in.close();
	}
	//½«article¼òµ¥·Ö´Ê
	private static ArrayList<String> spiltToWord(char[] article) {
		ArrayList<String> words = new ArrayList<String>();
		String word = "";
		for(char c : article) {
			if(isLetter(c)) {
				word += c;
			}else {
				words.add(word.toLowerCase());
				word = "";
			}
		}
		return words;
	}
	
	private static boolean isLetter(char c) {
		if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
			return true;
		return false;
	}
}
