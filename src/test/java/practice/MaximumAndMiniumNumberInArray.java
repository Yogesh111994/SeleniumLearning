package practice;

public class MaximumAndMiniumNumberInArray {

	public static void main(String args[]) {
		int arr[] = { 10, 324, 45, 90, 9808 };
		miniumNumber(arr);
		maximumNumber(arr);
	}

	public static void miniumNumber(int min[]) {

		int miniumNumber = min[0];
		int n = min.length;

		for (int j = 1; j < n; j++) {

			if (min[j] < miniumNumber) {
				miniumNumber = min[j];
			}
		}

		System.out.println("Minimum number in array  :"+miniumNumber);
		
	}
	
	public static void maximumNumber(int max[]) {

		int maximumNumber = max[0];
		int n = max.length;

		for (int j = 1; j < n; j++) {

			if (max[j] > maximumNumber) {
				maximumNumber = max[j];
			}
		}

		System.out.println("Maximum Number in Array :"+maximumNumber);
		
	}
}
