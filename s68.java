package lecture2;
import java.util.Scanner;

public class s68 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.printf("Please enter a number of weeks: ");
		
		Double weeks = in.nextDouble();
		Double days = weeks * 7;
		
		System.out.printf("There are %f number of days in %f weeks", days, weeks);
	}
}
