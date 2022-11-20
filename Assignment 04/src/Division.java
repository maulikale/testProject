 /*
	*Assignment No - 4
	*Problem No - 4
 	*Write the java program to design method for division of two number 
which returns int value to that method and result should be print into main method.
*/
public class Division {
	int TwoNoDivision(int c,int d) {
	int division=c/d;
	return division;
	}
	
	public static void main(String[] args) {
		Division division=new Division();
		int sum = division.TwoNoDivision(100, 10);
		System.out.println("Division of two numbers: "+sum);
		
	}
}
