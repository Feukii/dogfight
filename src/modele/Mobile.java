package modele;

import java.awt.Color;
import java.awt.Image;

public class Mobile implements IMobile{

	
	private int speed;
	private final Position position;
	private final Dimension dimension;
	
	
 public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image) {
}
 
	 
	 
 

@Override
 public  Direction getDirection() {
	return null;
}


@Override
 public void  setDirection(Direction direction) {
}

@Override
 public Position getPosition() {
	return null;
}

@Override
 public Dimension getDimension() {
	return null;
}

@Override
 public int getSpeed() {
	return 0;
}

@Override
 public int getWidth() {
	return 0;
}

@Override
 public int getHeight() {
	return 0;
}

@Override
 public void move() {
}

@Override
 public void placeInArea(IArea area) {
}

@Override
 public boolean isPlayer(int player) {
	return false;
}
 private void  moveUp() {
}
 private void moveRight() {
}
 private void moveDown() {
}
 private void moveLeft() {
}
 public  Color getColor() {
	return null;
}
 public IDogfightModel getDogfightModel() {
	return null;
}
 public void setDogfightModel( IDogfightModel dogfightModel) {
}

@Override
 public boolean hit() {
	return false;
}

@Override
 public boolean  isWeapon() {
	return false;
}
 public Image getImage() {
	return null;
}





@Override
public void setDogfightModel(DogfightModel dogfightModel) {
	// TODO Auto-generated method stub
	
}
 
 
 
 
 
}
