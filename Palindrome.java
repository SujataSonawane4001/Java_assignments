import java.util.Scanner;

 public class Palindrome{
    public static void main(String[] args){
	 System.out.println("Enter a number");
	 Scanner sc=new Scanner(System.in);
	 int num=sc.nextInt();
	 int rev=0;
	 int rem;
	 int temp=num;
	 
	 
	  while(num != 0)
	  {
	    rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	  }
	  if(temp == rev){
	  System.out.println("Number is palindrome number");
	  }
	  else{
	  System.out.println("Number is not palindrome number");
	  }
	  
	}
}