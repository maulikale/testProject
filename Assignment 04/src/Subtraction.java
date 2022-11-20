/*
	*Assignment No - 4
	*Problem No - 2
 	*Write the java program to design method for subtraction of two number 
 which returns int value to that method and result should be print into main method.
 */

public class Subtraction {
	int TwoNoSubtraction(int p, int q) {
		int c = p-q;
		return c;
	}
	public static void main (String[] args) {
		Subtraction subtraction=new Subtraction();
		int sum = subtraction.TwoNoSubtraction(50, 30);
		System.out.println("Subtraction of two numbers: "+sum);
	}

}
