import java.util.Scanner;
 public class AstNumMixPmd{
    public static void main(String[] args){
		for(int line=1;line<=6;line++){
			for(int space=5;space>=line;space--){
				
				System.out.print(" ");
				
				
			}
			int num=1;
			for(int ast=1;ast<=line;ast++){
				
				if(line==1 || line==2 || line==6 || ast==1 || line == ast ){
					System.out.print("* ");
					
				}
				else{
					
					 System.out.print(num);
					 num++;
					 System.out.print(" ");
				}
				
				
				
			}
			
			System.out.println();
		}
		
		
		
	}
 
 }