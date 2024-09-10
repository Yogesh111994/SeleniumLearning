package practice;

import java.util.Arrays;

public class ReverseString {

	public static void main(String args[]) {

		String sentence = "Reverse the string through automation";
		reverseString(sentence);
		revSentenceWordByWord(sentence);
		
	}

	public static void reverseString(String revrese) {

		String rev = "";
		for (int i = revrese.length() - 1; i >= 0; i--) {
			char ch = revrese.charAt(i);
			rev = rev + ch;
		}
		System.out.println(rev);
	}
	
	public static void revSentenceWordByWord(String sentence) {
		
		String[] splitString = sentence.split(" ");
		System.out.println(Arrays.toString(splitString));
		String revstatement="";
		for(int i=0;i<splitString.length;i++) {
			
			String word = splitString[i];
			
			String revword="";
			for(int j=word.length()-1;j>=0;j--) {
				char ch=word.charAt(j);
				revword=revword+ch;
			}
			revstatement=revstatement+revword+" ";
		}
		System.out.println(revstatement);
		
	}
	
	
}
