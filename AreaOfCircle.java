import java.util.Scanner;

public class AreaOfCircle{
	public static void main(String[] args){
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Give radius : ");
		int r = scanner.nextInt();
		
		float pi = 22f/7;
		
		float ans = pi * r * r;
		
		System.out.println("Area of circlr is : " + ans);
		
		scanner.close();
	}
}