package lecture2;
import java.util.Scanner;

public class s70 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.printf("Please a number: ");
		double one = in.nextDouble();
		
		System.out.printf("Please a number: ");
		double two = in.nextDouble();
		
		System.out.printf("Please a number: ");
		double three = in.nextDouble();
		
		double average = (three + two + one)/3;
		
		System.out.printf("The average of your inputted numbers is %f", average);
	}

}
