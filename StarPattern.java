import java.util.Scanner;
 public class StarPattern{
    public static void main(String[] args){
		for(int line=1;line<=4;line++){
			// for(int space=;space>=line;space--){
				
				// System.out.print(" ");
				
				
			// }
			// int num=1;
			for(int ast=1;ast<=4;ast++){
				if(line==4 || ast==1 || ast==4){
				System.out.print("* ");
				
				}
				
				 else{
					
					// System.out.print(num);
					// num++;
					 System.out.print(" ");
				 }
				
				
				
			}
			
			System.out.println();
		}
		
		
		
	}
 
 }