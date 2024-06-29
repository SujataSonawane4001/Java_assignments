import java.util.Scanner;

public class Loop1{
   public static void main(String[] args){
    for(int line=1;line<=4;line++){
	
	     for(int space=0;space<=line;space++){
			 System.out.print(" ");
		 }
		 for(int ast=4;ast>=line;ast--){
			 System.out.print("* ");
		 }
		 
		 System.out.println();
	}
   
   }





}