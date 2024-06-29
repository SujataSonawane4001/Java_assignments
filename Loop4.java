import java.util.Scanner;

 public class Loop4{
 
   public static void main(String[] args){
    for(int line=1;line<=4;line++){
		
		for(int space=3;space>=line;space--){
			
		System.out.print(" ");
			
		}
		char character='a';
		for(int ch=1;ch<=line;ch++){
			System.out.print(character);
		    character++;
			System.out.print(" ");
			
		}
		System.out.println();
		
	}
   
   }
 
 
 
 }