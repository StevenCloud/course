package lecture2;
import java.util.Scanner;

public class s26 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.printf("Please enter the radius: ");

		Double radius = in.nextDouble();
		double area = Math.PI * Math.pow(radius, 2);
		
		System.out.printf("The area is %f\n", area);
			
		
	}
	
}
