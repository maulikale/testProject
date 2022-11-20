 /*
	*Assignment No - 4
	*Problem No - 5

	*Write the Java Program to calculate total of five subject marks and average of it.
	*/
 
public class TotalMarks {
	public static void main (String[] args) {
		int physics = 78;
		int chemistry = 80;
		int maths = 85;
		int marathi = 92;
		int hindi = 65;
		
		int total = physics + chemistry + maths + marathi + hindi;
		int avrg = total/5;
		
		System.out.println("Total of five subjects Marks = "+total);
		System.out.println("Average of five subject Marks = "+avrg);
		
	}

}