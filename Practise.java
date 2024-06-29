import java.util.Scanner;
public class Practise{

    // //int x=100;
   // {
	   // {
		    // System.out.println("I am local block in method");
	   // }
		
   // }
   
   // static{
     // {
	    // System.out.println("I am static method");
      // }
    // }
   
    public static void main(String[] args){
	 
	     
   
   
   
       Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number");
         double num=sc.nextDouble();
         System.out.println("Enter the Exponent");
         double exponent=sc.nextDouble();
         double result=1;
         for(int i=0;i<=exponent;i++) 
         {
        	 result = result*num;
         }
        
         System.out.println("The power of : "+num+" raised to "+exponent+" is :"+result);
   
}


}