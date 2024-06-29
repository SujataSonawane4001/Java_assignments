import java.util.Scanner;
public class DynamicHollowTriangle{
  
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any number");
	int num=sc.nextInt();
		// TODO Auto-generated method stub
        for(int line=1;line<=num;line++){
			for(int space=num-line;space>=0;space--){
				System.out.print(" ");
			}
  			for(int ast=1;ast<=line;ast++){
  				  if(line == 1 || ast == 1 || line == num || ast == num)
					  {
  					  System.out.print("* ");
  				  }
  				  else{
  					  System.out.print("  ");
  				  }
  	          
  		      
  		    }
  			System.out.println();
  			  
  		  }
			
			
			
		}
	

   }