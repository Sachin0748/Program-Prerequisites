import java.util.Scanner;

public class SimpleInterest{
	public static void main(String[] args){
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter principal : ");
		int p = scanner.nextInt();
		
		System.out.print("Enter rate : ");
		int r = scanner.nextInt();
		
		System.out.print("Enter time : ");
		int t = scanner.nextInt();
		
		int temp = p * r * t;
		float ans = temp / 100;
		
		System.out.println("Simple Interest is : " + ans);
		
		scanner.close();
	}
}