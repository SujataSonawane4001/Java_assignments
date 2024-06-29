import java.util.Scanner;
 public class ArrayIndexeven{
	 
	int[] x= {1,2,6,8,9};
    public static void main(String[] args){
	   ArrayIndexeven f = new ArrayIndexeven();
	   int temp=0;
	   for(int index=0;index<=f.x.length-1;index++){
		   int var1= f.x[index];
		   temp = var1+temp;
	   }
	   System.out.println(temp);
	
	}
}