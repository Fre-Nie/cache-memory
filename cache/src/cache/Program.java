package cache;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {		
		boolean k�r = true; 
		Model model1 = new Model(); 
		while (k�r) {
			Scanner input = new Scanner (System.in); 
			System.out.println("V�lkommen, skriv in ett tal eller -1 f�r att rensa minnet och -2 f�r att avsluta.");
			int val = input.nextInt(); 
			if (val == -2) {
				model1.clearMemory(); 
				System.out.println("Program quits.");
				System.exit(0); 
			}
			else if (val == -1) {
				model1.clearMemory(); 
			}
			else{
				try {	
					System.out.println(model1.compute2Power(val));
				}catch (IllegalArgumentException e) {
					System.out.println("Invalid Input");
					continue;
				}
			}
			
		}
	}

}
