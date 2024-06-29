import java.util.Scanner;

public class Reverse{
  public static void main(String[] args){
   System.out.println("Enter a number");
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   //int temp=n;
   int rev=0,rem;
   while(n!=0)
   {
      rem=n%10;
	  rev=rev*10+rem;
	  n=n/10;
	  
   }
   System.out.println("reverse number is"+rev);
   
 }
 }