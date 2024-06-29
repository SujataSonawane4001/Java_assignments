import java.util.Scanner;
public class DynamicHollowReact{
  
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any number");
	int num=sc.nextInt();
		// TODO Auto-generated method stub
        for(int line=1;line<=num;line++){
			
  			  for(int ast=1;ast<=num;ast++){
  				  if(line == 1 || ast == 6 || ast == 1 || 
				  line==2 || ast == 2 || line==num-1 ||
				  ast==num-1 || line == 6)
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