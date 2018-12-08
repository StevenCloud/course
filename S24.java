package lecture2;
import java.util.Scanner;

public class S24 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.printf("Please enter the radius: ");

		Double radius = in.nextDouble();
		Double circumference = 2 * Math.PI * radius;
		
		System.out.printf("The circumference is %f\n", circumference);
	}
}
