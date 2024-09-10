package practice;



public class Interview {

	
	public static void main(String args[]) {
		
		// abcdefgh
		// habcdefg
		// ghabcdef
		// fghabcde
		// efghabcd
		// defghabc
		// cdefghab
		// bcdefgha
		
		String s="abcdefgh";
		System.out.println(s);
		int count =s.length();
		for(int i=count-2;i>=0;i--) {
			
			String rev="";
			for(int j=count-1;j>=0;j--) {
				char ch=s.charAt(j);
				rev= rev+ch;
			}
			System.out.println(rev);
			//s.charAt(count-1)
			//s=s.replace(s.charAt(count-1), s.charAt(i));
		}
	
}
}