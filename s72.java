package lecture2;
import java.util.Scanner;

public class s72 {
	public static void main(String[] args)	{
		Scanner in = new Scanner(System.in);
		
		System.out.printf("Please enter the mass of the first object:");
		double mass1 = in.nextDouble();
		
		System.out.printf("Please enter the mass of the second object:");
		double mass2 = in.nextDouble();
		
		System.out.printf("Please enter the distance between the two objects:");
		double d = in.nextDouble();
		double distance = d * d;
		
		double G = 9.8;
		double force = G * mass1 * mass2/ distance;
		
		System.out.printf("The gravity force is %f", force);		
	}
}
