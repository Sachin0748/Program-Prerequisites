import java.util.Scanner;

public class Celcious2Farenhite{
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter temperature : ");
		float temperature = scanner.nextInt();
		
		float temp = 9f/5;
		
		float ans = (temperature * temp) + 32;
		System.out.println("Temperature in farenhite is : " + ans);
	
		scanner.close();
	}
}