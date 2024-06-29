import java.util.Scanner;
 public class ArrayFindPrime{
	 
	
    public static void main(String[] args){
	   Scanner sc= new Scanner(System.in);
	   int[] arr= new int[5];
	   
	   System.out.println("Enter 5 Elements");
	   for(int index=0;index<arr.length;index++){
		   arr[index]=sc.nextInt();
	   }
	   
	   System.out.print("Prime Number in array : ");
	   for(int index=0;index<arr.length;index++){
		boolean IsPrime=true;
		int i = 2;
		    while(arr[index] > i){
			if(arr[index] % i == 0){
				
				
				IsPrime = false;
				
			}
			i++;
			
		}
		if(IsPrime)
		{
			System.out.print(arr[index]+" ");
		}
      }
		  
		  
	   }
	   
	
}
