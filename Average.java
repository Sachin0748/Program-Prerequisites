import java.util.Scanner;

public class Average{
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter first number : ");
		float num1 = scanner.nextInt();
		
		System.out.print("Enter second number : ");
		float num2 = scanner.nextInt();
		
		System.out.print("Enter third number : ");
		float num3 = scanner.nextInt();
		
		float ans = (num1 + num2 + num3)/3;
		System.out.println("Average of three numbers is : " + ans);
		
		scanner.close();
	}
}