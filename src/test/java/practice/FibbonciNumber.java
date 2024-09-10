package practice;

public class FibbonciNumber {

	public static void main(String args[]) throws InterruptedException {	
		
		fibNumber(5);
		}
	
	public static void fibNumber(int number) {
		int previousNumber=0;
		int currentNumber=1;
		int nextNumber=0;
		
		System.out.println(0);
		System.out.println(1);
	for(int i=0;i<number;i++) {
		  
		nextNumber=previousNumber+currentNumber;
		previousNumber=currentNumber;
		currentNumber=nextNumber;
				
		System.out.println(currentNumber);		
		}
	}
}
