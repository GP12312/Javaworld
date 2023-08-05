package PsU.Facade;

import java.io.BufferedReader;
import java.io.IOException;
import java .io.InputStreamReader;

public class Client {

	private static int choice;
	
	public static void main (String args[]) throws NumberFormatException, IOException {
		
		do {
			
	            System.out.print("========= Mobile Shop ============ \n");  
	            System.out.print("            1. IPHONE.              \n");  
	            System.out.print("            2. SAMSUNG.              \n");  
	            System.out.print("            3. BLACKBERRY.            \n");  
	            System.out.print("            4. Exit.                     \n");  
	            System.out.print("Enter your choice: ");  
	            
	            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
	            choice = Integer.parseInt(read.readLine());			
	            Shopekeeper Ram = new Shopekeeper();
			
				switch(choice) {
				
						case 1:{
							Ram.iphoneSale();
						}break;
						
						case 2:{
							Ram.samsungPhoneSale();
						}break;
						
						case 3:{
							Ram.bbPhoneSale();
						}break;
						
						default:
						{
							System.out.println("You have not bought anything");
						}
						return;
				}
			}while(choice != 4 );
		}			
	
}
