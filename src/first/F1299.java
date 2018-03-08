package first;

import java.util.Scanner;
import java.util.Stack;
//µ¥´Ê·´×ª
public class F1299 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNextLine()) {
			String sentence = in.nextLine();
			Stack<Character> wordStack = new Stack<>();
			wordStack.clear();
			int index = 0;
			while(index < sentence.length()) {
				while(index < sentence.length() && 
						Character.isLetter(sentence.charAt(index)))
					wordStack.push(sentence.charAt(index++));				
				while (!wordStack.isEmpty())
					System.out.print(wordStack.pop());
				wordStack.clear();
				while(index < sentence.length() && 
						!Character.isLetter(sentence.charAt(index)))
					System.out.print(sentence.charAt(index++));
			}
			System.out.println();
		}
		in.close();
	}
}
