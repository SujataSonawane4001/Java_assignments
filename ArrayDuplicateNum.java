import java.util.Scanner;
 public class ArrayDuplicateNum{
	 
	
    public static void main(String[] args){
	   Scanner sc= new Scanner(System.in);
	   int[] arr= new int[10];
	   
	   System.out.println("Enter 10 Elements");
	   for(int index=0;index<arr.length;index++){
		   arr[index]=sc.nextInt();
	   }
	   
	   System.out.print("duplicate Array Element :");
	   for(int index=0;index<arr.length;index++){
		   for(int j=index+1;j<arr.length;j++){
			   if(arr[index] == arr[j]){
			  System.out.print(arr[index]+" ");
		  }
		 }
		  
		  
	   }
	   
	}
}