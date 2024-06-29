import java.util.Scanner;

public class Loop3{
  public static void main(String[] args){
	 
	 for(int line=1;line<=4;line++){
	 
	 for(int space=3;space>=line;space--){
	      System.out.print(" ");
	 }
		  if(line % 2 == 0){
			  char character='a';
			  for(int ch=1;ch<=line;ch++){
				  System.out.print(character);
				  character++;
				  System.out.print(" ");
			  }
			  
			  
		    }
		   else{
			  for(int num=1;num<=line;num++){
	          System.out.print(num);
	            System.out.print(" ");
	         }
			  
			  
		   }
		   System.out.println();
	 }
	 
	 
	
       }
    }
		
  
  
  

