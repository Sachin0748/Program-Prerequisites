import java.util.Scanner;

public class PerimeterOfRectangle{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter length : ");
		int l = scanner.nextInt();
		
		System.out.print("Enter width : ");
		int w = scanner.nextInt();
		
		int p = 2 * (l + w);
		System.out.println("Perimeterof rectangle is : " + p);
		
		scanner.close();
	}
}