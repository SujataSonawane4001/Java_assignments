import java.util.Scanner;
 public class SingleDigitSum{
   public static void main(String[] args){
	   
	   System.out.println("Enter a number");
	   Scanner sc=new Scanner(System.in);
	   int num=sc.nextInt();
	   int sum=0;
	    while(num > 0 || sum > 9){
			if(num == 0){
				num=sum;
				sum=0;
			}
			
			sum=sum+num%10;
			num=num/10;
			
		}
		System.out.println("The sum of digit is " +sum);
	   
   }
 
 }