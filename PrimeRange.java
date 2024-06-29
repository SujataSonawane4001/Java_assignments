import java.util.Scanner;
public class PrimeRange{
   public static void main(String[] args){
       System.out.println("Enter a number");
	   Scanner sc=new Scanner(System.in);
	   int i=sc.nextInt();
	   int num=1;
	    while(num <= i){
			if(num%2 != 0){
				System.out.println(""+num);
			}
			num++;
		}
	   
   }
}