package modele;

import java.awt.Image;

import com.sun.javafx.scene.traversal.Direction;

public interface IMobile {

	
	
	public Direction getDirection();
	public void setDirection(Direction direction);
	public Position getPosition();
	public Dimension getDimension();
	public int getWidth();
	public int getHeight();
	public int getSpeed();
	public Image getImage();
	public void move();
	public void placeInArea(IArea area);
	public boolean isPlayer(int player);
	public void setDogfightModel(DogfightModel dogfightModel);
	public boolean hit();
	public boolean isWeapon();
	
   
	
}