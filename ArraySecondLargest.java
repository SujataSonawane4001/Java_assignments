import java.util.Scanner;
 public class ArraySecondLargest{
	 
	
    public static void main(String[] args){
	   Scanner sc= new Scanner(System.in);
	   int[] arr= new int[5];
	   
	   System.out.println("Enter 5 Elements");
	   for(int index=0;index<=4;index++){
		   arr[index]=sc.nextInt();
	   }
	   
	   int SecondMax=0;
	   
	   for(int index=0;index<arr.length;index++){
		   for(int j=index+1;j<arr.length;j++){
			   if(arr[index] > arr[j]){
			  SecondMax=arr[index];
			  arr[index]=arr[j];
			  arr[j]=SecondMax;
			  
		  }
		 }
		  
		  
	   }
	   System.out.println();
	   System.out.println("Sorted Array Element in Ascending : ");
	   for(int index=0;index<=4;index++){
		  
		 System.out.print(arr[index]+" ");
		 
		 System.out.print("Second Largest ELement"+arr[-2]);
	   }
	}
	   
	
}