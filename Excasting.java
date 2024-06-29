public class Excasting{
  

  public static void main(String[] args){
        char character='A';
		for(int line=1;line<=4;line++){
			
			for(int space=4;space>=line;space--) {
				System.out.print(" ");
			}
			
			
			for(int ch=1;ch<=line;ch++) {
				System.out.print(" "+character);
				
			}
			character++;
			System.out.println();
		}
	
  }
  

}