import java.util.Scanner;
 public class ArrayFindPalindrome{
	 
	
    public static void main(String[] args){
	   Scanner sc= new Scanner(System.in);
	   int[] arr= new int[5];
	   
	   System.out.println("Enter 5 Elements");
	   for(int index=0;index<arr.length;index++){
		   arr[index]=sc.nextInt();
	   }
	   
	   System.out.print("Palindrome Number in array : ");
	   for(int index=0;index<arr.length;index++){
		   int rev=0;
	       int rem;
	       int temp=arr[index];
		 while(arr[index] != 0)
	    {
	    rem=arr[index]%10;
		rev=rev*10+rem;  // Formula of reverse Number
		arr[index]=arr[index]/10;
	    }
		if(temp == rev){
	     System.out.print(temp+"");
	    }
      }
		  
		  
	   }
	   
	
}





