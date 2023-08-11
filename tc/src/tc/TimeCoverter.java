package tc;
import java.util.Scanner;

public class TimeCoverter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the time in minites");
		int min=scan.nextInt();
		TimeCoverter t1=new TimeCoverter();
		System.out.println(t1.convToH(min));
		
		
	}
	public static double convToH(int min) {
	 double c= min/60;
	return c;
	}
	

}
