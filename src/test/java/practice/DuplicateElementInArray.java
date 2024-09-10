package practice;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementInArray {

	public static void main(String args[]) {
		
		String str = "findduplicateelementsinarray";
		int length =str.length();
		Set<Character> countedChars= new HashSet<>();
		int duplicateCount=0;
		for(int i=0;i<length;i++) {
			
			char ch=str.charAt(i);
			
			 if (countedChars.contains(ch)) {
	                continue;
	            }
			
			int count=0;
			for(int j=0;j<length;j++) {
					
				if(str.charAt(i)==str.charAt(j)) {
					count++;
					
				}
				
			}
			countedChars.add(ch);
			
			duplicateCount=count;
			if(duplicateCount>1 ) {
				System.out.println(str.charAt(i)+" : "+duplicateCount);
			}
		}
	}
}
