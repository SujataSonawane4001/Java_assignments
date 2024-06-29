import java.util.Scanner;

public class Loop6{
  public static void main(String[] args){
	   for(int line=1;line<=4;line++){
		   for(int space=3;space>=line;space--){
			   System.out.print(" ");
		   }
		   for(int ast=1;ast<=line;ast++){
			   System.out.print("* ");
		   }
		   System.out.println();
		   
	   }
	   for(int line1=1;line1<=4;line1++){
		   for(int space1=1;space1<=line1;space1++){
			   System.out.print(" ");
		   }
		   for(int ast1=3;ast1>=line1;ast1--){
			   System.out.print("* ");
		   }
		   System.out.println();
		   
	   }
	 
    }
}
		
  