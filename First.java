import java.util.Scanner;

public class First{
	
	public static void main(String[] args){
		System.out.println("Enter a digit");
		Scanner sc = new Scanner(System.in);
		int digit = sc.nextInt();
		System.out.println(digit);
		
		switch(digit)
		{
			case 0: System.out.println("Zero");
					break;
			case 1: System.out.println("one");
					break;
			case 2: System.out.println("two");
					break;
			case 3: System.out.println("three");
					break;
			case 4: System.out.println("four");
					break;
			case 5: System.out.println("five");
					break;
			default: System.out.println("Invalid Digit");
					break;
			
			
		}
		
	}
		
}