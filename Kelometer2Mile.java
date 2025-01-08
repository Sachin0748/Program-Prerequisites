import java.util.Scanner;

public class Kelometer2Mile{
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter distance in kilometers : ");
		double distance = scanner.nextInt();
		
		double ans = distance * 0.621371;
		System.out.println("Distance into miles is : " + ans);
		
		scanner.close();
	}
}