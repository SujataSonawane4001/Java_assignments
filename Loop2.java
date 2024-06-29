import java.util.Scanner;

public class Loop2{
  public static void main(String[] args){
     for(int line=1;line<=4;line++){
	 
	 for(int space=3;space>=line;space--){
	      System.out.print(" ");
	 }
	 for(int num=1;num<=line;num++){
	 System.out.print(num);
	 System.out.print(" ");
	 }
	 System.out.println();
	 
	 }
  
  
  }
}