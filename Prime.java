import java.util.Scanner;
 public class Prime{
	public static void main(String[] args){
		System.out.println("Eneter a number");
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		boolean IsPrime=true;
		int i = 2;
		    while(num > i){
			if(num % i == 0){
				
				
				IsPrime = false;
				
			}
			i++;
			
		}
		if(IsPrime)
		{
			System.out.println("number is prime");
		}
		else
		{
			System.out.println("number is not prime");
		}
		
		
	}
}