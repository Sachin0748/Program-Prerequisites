import java.util.Scanner;

public class Add2Numbers{
	public static void main(String[] args){
		int a,b;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter first number : ");
		a = scanner.nextInt();
		
		System.out.print("Enter second number : ");
		b = scanner.nextInt();
		
		int sum = a+b;
		System.out.println("Sum is : " + sum);
		
		scanner.close(); 
	}
}