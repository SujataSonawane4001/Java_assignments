import java.util.Scanner;
 public class ArrayMissNumber{
	 
	
    public static void main(String[] args){
	   int[] x= {1,5,11,18,19,23};
	   
	   for(int index=0;index<= x.length-1;index++){
		   for(int num=1;num<=index;num++){
			    if(num != x[index]){
				  System.out.println(num);
				  System.out.println(x[index]);
			    }
				
		    }
		      
	    }
	   
	}
}