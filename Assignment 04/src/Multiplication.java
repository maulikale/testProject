   /*
	*Assignment No - 4
	*Problem No - 3

	*Write the java program to design method for multiplication of two number 
which returns int value to that method and result should be print into main method.
*/

public class Multiplication {
	int TwoNoMultiplication(int y, int z) {
		int m=y*z;
		return m;
	}
	
	public static void main(String[] args) {
		Multiplication multiplication = new Multiplication();
		int sum = multiplication.TwoNoMultiplication(12, 8);
		System.out.println("Multiplication of two numbers: "+sum);
		
	}

}
