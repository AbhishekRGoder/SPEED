package space;
import java.util.Scanner;


public class Thrust {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a number");
		int a=scan.nextInt();
		System.out.println(cT(a));
		
	}
	public static long cT(int a) {
		long c= (long)Math.pow(a,5);
		return c;
	}

}
