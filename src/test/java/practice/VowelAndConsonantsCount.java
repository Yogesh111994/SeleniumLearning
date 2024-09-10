package practice;

public class VowelAndConsonantsCount {

	public static void main(String args[]) {

		
		String text = "complete the automation project";
		int vowel = 0;
		int conso = 0;
		int count =text.length();
		System.out.println(count);
		for (int i = 0; i < text.length()-1; i++) {

			char ch = text.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowel++;
			} else {
				conso++;
			}
		}

		System.out.println(vowel);
		System.out.println(conso);
	}
	
	
	public static void countOfVowelAndConsonants(String s) {
		
		
		int vowel = 0;
		int conso = 0;
		for (int i = 0; i < s.length()-1; i++) {
			char ch = s.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowel++;
			} else {
				conso++;
			}
		}

		System.out.println("vowel count: "+vowel);
		System.out.println("Consonent count: "+conso);
	}
	
}
