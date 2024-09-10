package practice;

public class PalindromeNumber {

	public static void main(String args[]) {

		checkThenumberIsPalindrome(14541);

	}

	public static void checkThenumberIsPalindrome(int number) {

		int givenNumber = number;
		int temp = number;
		int sum = 0;

		while (temp > 0) {
			int rem = temp % 10;
			sum = sum * 10 + rem;
			temp = temp / 10;
		}
		if (givenNumber == sum) {
			System.out.println("Given number is palindrome number : " + number);
		} else {
			System.out.println("Not a palindrome number :" + number);
		}
	}
}