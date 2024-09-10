package practice;

import java.util.Arrays;

public class AnagramString {

	public static void main(String args[]) {

		String str1 = "evil";
		String str2 = "vile";

		boolean anagramString = anagramString(str1, str2);
		if (anagramString) {
			System.out.println("the string is anagram");
		} else {
			System.out.println("the string is not anagram");
		}

	}

	public static boolean anagramString(String str1, String str2) {

		boolean flag = true;
		String[] l1 = str1.split("");
		String[] l2 = str2.split("");

		if (l1.length != l2.length) {
			flag = false;

		}

		Arrays.sort(l1);
		Arrays.sort(l2);
		System.out.println(Arrays.toString(l1));
		System.out.println(Arrays.toString(l2));
		for (int i = 0; i < l2.length; i++) {
			try {
				if (!l1[i].equals(l2[i])) {

					flag = false;

				}
			} catch (Exception ArrayIndexOutOfBoundsException) {
				System.out.println("The length of string mismatch");
			}

		}
		return flag;
	}
}
