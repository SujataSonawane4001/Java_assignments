import java.util.Scanner;
 public class DigitSum{
   public static void main(String[] args){
	   
	   System.out.println("Enter a number");
	   Scanner sc=new Scanner(System.in);
	   int num=sc.nextInt();
	   int sum=0,temp;
	    while(num != 0){
			temp=num%10;
			sum=sum+temp;
			num=num/10;
			
		}
		System.out.println("The sum of digit is" +sum);
	   
   }
 
 }