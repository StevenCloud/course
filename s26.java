package lecture3;
import java.util.Scanner;

public class s26 {
	public static void main(String[] args)	{
		Scanner in = new Scanner(System.in);
		
		System.out.printf("Please enter a number:");
		double n = in.nextDouble();
		
		double ns = n * n;
		
		System.out.printf("The square of %.2f is %.2f.", n, ns);
	}

}
