package modele;

import java.util.ArrayList;

public interface IDogfightModel {
	
	
	public IArea getArea();
	public void  buildArea(Dimension dimension);
	public void addMobile(IMobile Mobile);
	public void removeMobile(IMobile Mobile);
	public IMobile getMobileByPlayer(int player);
	public void SetMobilesHavesMoved();
	
	public ArrayList<IMobile> getMobiles();
	
	
	

}
