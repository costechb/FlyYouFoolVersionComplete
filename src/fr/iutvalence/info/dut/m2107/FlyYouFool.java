package fr.iutvalence.info.dut.m2107;

import java.util.Scanner;

public class FlyYouFool {
	
	
	public static void main(String[] args) throws InterruptedException  {			
		String name="Jarjar";
		
		@SuppressWarnings("unused")
		Scanner scPseudo = new Scanner(System.in);
		
//		do{
//			ok=true;
//			System.out.printf("\n Please enter the name of player");
//			name = scPseudo.nextLine();
//			if (name.contains(" ")) {
//				System.out.println("\n No space in name please. Try Again");
//				ok=false;
//			}
//		}while (!ok);
		
		System.out.println("Hello " + name + " !");
		Game game = new Game();
		game.run();
		}
}
