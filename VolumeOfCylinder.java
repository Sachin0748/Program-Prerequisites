import java.util.Scanner;

public class VolumeOfCylinder{
	public static void main(String[] args){
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter radius : ");
		int r = scanner.nextInt();
		
		System.out.print("Enter height : ");
		int h = scanner.nextInt();
		
		float pi = 22f/7;
		float ans = pi * r * r * h;
		
		System.out.println("Volume of Cylinder is : " + ans);
		
		scanner.close();
	}
}