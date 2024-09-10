package practice;

public class PalindromeString {

	public static void main(String args[]) {

		palindromeString("mom");

	}

	public static void palindromeString(String text) {

		String s = text;
		s.toLowerCase();
		int count = s.length();
		String rev = "";
		for (int i = count - 1; i >= 0; i--) {

			char charAt = s.charAt(i);
			rev = rev + charAt;
		}

		if (s.equalsIgnoreCase(rev)) {
			System.out.println("Provided String is Palindrome String : " + s);
		} else {
			System.out.println("Provided String is NOT palindrome String : " + s);
		}
	}
}
