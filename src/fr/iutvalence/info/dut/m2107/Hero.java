package fr.iutvalence.info.dut.m2107;

import java.util.ArrayList;

public class Hero extends Character {

	
	public Hero(Tile pos) {
		super(pos);
	}

	public void afficheHero() {
		
		//Character.getPos();
		throw new UnsupportedOperationException();
		
	}


	/**
	 * 
	 * @param letter
	 */
	public void stopHero(char letter) {
		// TODO - implement Hero.stopHero
		
		throw new UnsupportedOperationException();
	}

	public void moveHero(char direction) {
		// TODO Auto-generated method stub
		int i=0, j=0;
		
		switch(direction){
		
		case'z':
				// Avancer d'une case
				// R�cup�rer la case sur laquelle on veut se d�placer
				Tile tileToMoveForward = setPos( i+1 , j);	
				
				// On appelle la m�thode de la v�rification de la case
				if (checkMov(tileToMoveForward)==true) {
					// On lance le d�placement du h�ro
					moveHero(tileToMoveForward);
					
				} else {
					// La case n'est pas libre
				}
			
		case'q':
				// Avancer d'une case
				// R�cup�rer la case sur laquelle on veut se d�placer
				Tile tileToMoveLeft = setPos( i , j+1 );	
				
				// On appelle la m�thode de la v�rification de la case
				if (checkMov(tileToMoveLeft)==true) {
					// On lance le d�placement du h�ro
					moveHero(tileToMoveLeft);
					
				} else {
					// La case n'est pas libre
				}
	
		case's':
				// Avancer d'une case
				// R�cup�rer la case sur laquelle on veut se d�placer
				Tile tileToMoveBackward = setPos( i-1 , j );	
				
				// On appelle la m�thode de la v�rification de la case
				if (checkMov(tileToMoveBackward)==true) {
					// On lance le d�placement du h�ro
					moveHero(tileToMoveBackward);
					
				} else {
					// La case n'est pas libre
				}
			
		case'd':
				// Avancer d'une case
				// R�cup�rer la case sur laquelle on veut se d�placer
				Tile tileToMoveRight = setPos( i , j-1);	
				
				// On appelle la m�thode de la v�rification de la case
				if (checkMov(tileToMoveRight)==true) {
					// On lance le d�placement du h�ro
					moveHero(tileToMoveRight);
					
				} else {
					// La case n'est pas libre
				}
		
		}
		
	}

	public boolean isCaught(ArrayList<Enemy> enemies) {
		// TODO Auto-generated method stub
		// check chaque case pour chaque enemy
		enemies.forEach(enemies-> {
			for(){
				
			}
		});
		
		return false;
	}
}