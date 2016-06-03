package fr.iutvalence.info.dut.m2107;
import java.io.IOException;
import java.util.Scanner;

public class IHM_Keyboard {
	private Grid map;
	private Hero hero;
	private int i;
	private int j;
	
	

	/**
	 * 
	 * @param map
	 * @param hero
	 */
	public IHM_Keyboard(Grid map, Hero hero)  { 
		// TODO - implement IHM_Keyboard.IHM_Keyboard
		
		
		this.map = map;
		this.hero = hero;	
	}
	
	/**
	 * 
	 * @param letter
	 */
//	public void moveHero(char Move) throws IHM_KeyboardException {
//		// TODO - implement IHM_Keyboard.moveHero
//		
//		// R�cup�rer la position du h�ro
//		Tile tile = this.hero.getPos();
//		// Utiliser le scanner dans le main, r�cup�rer la touche saisi et la passer en param�tre de movehero
//		switch (Move) {
//		
//		case 'z':
//			// Avancer d'une case
//			// R�cup�rer la case sur laquelle on veut se d�placer
//			Tile tileToMoveForward = this.map.getTile( i+1 , j);
//			// On appelle la m�thode de la v�rification de la case
//			if (this.hero.checkMov(tileToMoveForward)) {
//				// On lance le d�placement du h�ro
//				this.hero.moveHero(tileToMoveForward);
//				
//			} else {
//				// La case n'est pas libre
//			}
//			break;
//		
//		case 'q': 
//			
//			// Aller � gauche d'une case
//			// R�cup�rer la case sur laquelle on veut se d�placer
//			Tile tileToMoveLeft = this.map.getTile( i , j+1 );
//			// On appelle la m�thode de la v�rification de la case
//			if (this.hero.checkMov(tileToMoveLeft)) {
//				// On lance le d�placement du h�ro
//				this.hero.moveHero(tileToMoveLeft);
//				
//			} else {
//				// La case n'est pas libre
//			}
//			break;
//			
//		case 's':
//			
//			//Reculer d'une case
//			// R�cup�rer la case sur laquelle on veut se d�placer
//			//TODO: utiliser Grid, les tile n'ont pas de coordonn�es
//			Tile tileToMoveBackward = this.map.getTile( i-1 , j );
//			// On appelle la m�thode de la v�rification de la case
//			if (this.hero.checkMov(tileToMoveBackward)) {
//				// On lance le d�placement du h�ro
//				this.hero.moveHero(tileToMoveBackward);
//				
//			} else {
//				// La case n'est pas libre
//			}
//			break;
//			
//		case 'd': 
//			
//			// Aller � droite d'une case
//			// R�cup�rer la case sur laquelle on veut se d�placer
//			//TODO: utiliser Grid, les tile n'ont pas de coordonn�es
//			Tile tileToMoveRight = this.map.getTile( i , j-1);
//			// On appelle la m�thode de la v�rification de la case
//			if (this.hero.checkMov(tileToMoveRight )) {
//				// On lance le d�placement du h�ro
//				this.hero.moveHero(tileToMoveRight );
//				
//			} else {
//				// La case n'est pas libre
//			}
//			
//			
//			break;
//
//		default: 
//			// Dans le cas ou la lettre re�u n'est pas valide, on l�ve une exception
//			throw new IHM_KeyboardException();	
//		}	
//	}
//	
	public char readkey(){
		char letter = 'a';
		try {
			letter = (char) System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return letter;
	}
	
	
	/**
	 * @return the map
	 */
	public Grid getMap() {
		return map;
	}
	
	/**
	 * @param map the map to set
	 */
	public void setMap(Grid map) {
		this.map = map;
	}
	
	/**
	 * @return the hero
	 */
	public Hero getHero() {
		return hero;
	}

	/**
	 * @param hero the hero to set
	 */
	public void setHero(Hero hero) {
		this.hero = hero;
	}
}