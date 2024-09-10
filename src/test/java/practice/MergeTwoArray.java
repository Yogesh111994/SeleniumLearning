package practice;

public class MergeTwoArray {

	public static void main(String args[]) {

		int arr1[] = { 1, 5, 2, 4 };

		int arr2[] = { 5, 3, 8, 7, 9 };

		int mergArray[] = new int[arr1.length + arr2.length];
		int index = 0;

		System.out.println(mergArray.length);

		for (int i : arr1) {
			mergArray[index++] = i;
		}

		for (int i : arr2) {
			mergArray[index++] = i;
		}

		for (int i : mergArray) {

			System.out.println(i);
		}
	}
}
