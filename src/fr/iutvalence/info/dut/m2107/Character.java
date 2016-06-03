package fr.iutvalence.info.dut.m2107;

import java.awt.Image;


public class Character {

	private Tile pos;
	private Grid grid;
	/**
	 * The image of the character
	 */
	private Image image;

	
	public Character(Tile pos,Grid grid) {
		this.pos=pos;
		this.grid=grid;
	}

	/**
	 * 
	 * @return
	 * The tile where the hero is on the grid
	 */
	public Tile getPos() {
		for (int i=0;i<grid.MAX_LENGTH_DEFAULT;i++){
			for (int j=0;j<grid.MAX_WIDTH_DEFAULT;i++){
				if(grid.map[i][j].occupant instanceof Character){
					pos=grid.map[i][j];
				}
				
			}
			
		}
		return pos;
		
	}
	
	
	
	


	/**
	 * 
	 * @param pos
	 * set the position of the character
	 */
	public void setPos(int newAbs,int newOrd) {
		if(!grid.map[newAbs][newOrd].isSolid() && !grid.map[newAbs][newOrd].isOccuped()) {
			
			grid.map[newAbs][newOrd]=getPos();
			
			for (int oldAbs=0;oldAbs<grid.MAX_LENGTH_DEFAULT;oldAbs++){
				for (int oldOrd=0;oldOrd<grid.MAX_WIDTH_DEFAULT;oldAbs++){
					if(grid.map[oldAbs][oldOrd].occupant instanceof Character && (newAbs != oldAbs) && (newOrd != oldOrd)){
						grid.map[oldAbs][oldOrd]=new Tile(false);
					}
				}
			}
		}
		
	}

	/**
	 * To get the image of the character
	 */
	public Image getImage() {
        return this.image;
    }
	/**
	 * To set the image of the character
	 * @param img
	 */
    public void setImage(Image img) {
        image = img;
    }
    
}


	

