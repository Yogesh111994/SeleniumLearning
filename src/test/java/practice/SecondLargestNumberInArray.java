package practice;

public class SecondLargestNumberInArray {

	public static void main(String[] args) {

		int[] arr = { 11, 2, 3, 14, 5, 6 };

		int firstlargetNumber = 0;
		int secondLargestNumber = 0;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if(arr[i]> firstlargetNumber) {
			secondLargestNumber = firstlargetNumber;
			firstlargetNumber = arr[i];
			}
		}
		System.out.println("firstlargetNumber  :"+firstlargetNumber+"    secondLargestNumber: "+secondLargestNumber);
		
	}
}
