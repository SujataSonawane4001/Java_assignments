 import java.util.Scanner;
 public class ReverseTriangle{
	
   public static void main(String[] args){
	   System.out.print("Enter the number");
	   Scanner sc = new Scanner(System.in);
	   int num=sc.nextInt();
	   for(int line=1;line<=num;line++){
		   for(int space=1;space<line;space++){
			   System.out.print(" ");
			   
		   }
		   char ch='A';
		   int numb=1;
		   for(int ast=num;ast>=line;ast--){
			   if(line % 2 != 0){
				   System.out.print(ch+" ");
			       ch++;
			   }
			   else{
				   System.out.print(numb+" ");
				   numb++;
			   }
			   
			  
		   }
		   System.out.println();
	   }
   }
}

// A B C  D
//  1 2 3
//   A B
//    1