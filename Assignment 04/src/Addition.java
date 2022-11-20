	
	/*
	*Assignment No - 4
	*Problem No - 1
	*Write the java program to design method for addition of two number which returns int results to 
	that method and result should be print into main method.
	*/
public class Addition {
	public int twoNoAddition(int a, int b) {
		int c=a+b;
		return c;
		
	}
	public static void main (String[] args) {
		Addition addition = new Addition();
		int sum=addition.twoNoAddition(15, 20);
		System.out.println("Addition of two numbers: "+sum);
		
	}

}
