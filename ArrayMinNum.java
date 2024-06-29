import java.util.Scanner;
 public class ArrayMinNum{
	 
	
    public static void main(String[] args){
	   Scanner sc= new Scanner(System.in);
	   int[] arr= new int[5];
	   
	   System.out.println("Enter 5 Elements");
	   for(int index=0;index<arr.length;index++){
		   arr[index]=sc.nextInt();
	   }
	   
	   int var1 = arr[0];
	   System.out.println("Minimum Element :");
	   for(int index=0;index<arr.length;index++){
		  if(arr[index] < var1){
			  var1 = arr[index];
			  
		  }
		  
	   }
	   System.out.println(var1);
	}
}