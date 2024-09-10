package practice;

public class PrimeNumber {

	public static void main(String args[]) {

		// int primeNumber= 2,3,5,7,9,
		int number = 100;
		IsPrimeNumber(number);
		printPrimeNumber(10);
		
	}

	public static void IsPrimeNumber(int number) {

		int count = 0;
		for (int i = 2; i < number + 5; i++) {
			if (number % i == 0) {
				count++;
			}
		}
		if (count == 1) {
			System.out.println("This is prime number  : " + number);
		} else {
			System.out.println("This is not the prime number  : " + number);
		}
	}

	public static void printPrimeNumber(int number) {

		for (int i = 2; i < number; i++) {
			int count = 0;
			for (int j = 2; j < number; j++) {
				if (i % j == 0) {
					count++;
				}

			}

			if (count == 1) {
				System.out.println(i);

			}
		}
	}
}
