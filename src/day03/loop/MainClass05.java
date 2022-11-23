package day03.loop;
/*
 
0   *
1  *** 
2 *****
3*******
4 *****
5  ***
6   *

*/
public class MainClass05 {
	public static void main(String[] args) {
		int num = 0;
		
		for(int i=0; i<7; i++) {
			System.out.print(num + ":");
			for(int j=0; j<7; j++) {
				if(i<4) {						
					if(j + i < 3) {
						System.out.print(" ");
				}else if(j - i > 3){
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			} else {
				if(i-j > 3) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
				
				
				
				
			}
			System.out.println();
			num++;
		
		
		
			}
			
		}
	}
}