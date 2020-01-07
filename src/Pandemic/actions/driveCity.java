package Pandemic.actions;

import Pandemic.cities.*;


public class driveCity extends Action{
	private City moveTo;
	private City moveFrom;
	
	public driveCity(City moveFrom,City moveTo) {
		this.moveFrom = moveFrom;
		this.moveTo = moveTo;
	}

	public driveCity() {
		// TODO Auto-generated constructor stub
	}

	public City getMoveTo() {return moveTo; }

	public void setMoveTo(City moveTo) {this.moveTo = moveTo; 	}

	public City getMoveFrom() {	return moveFrom;	}

	public void setMoveFrom(City moveFrom) { this.moveFrom = moveFrom;	}
	
	public boolean isaLegalMove() {
		this.setMoveTo(moveTo);
		this.setMoveFrom(moveFrom);	  
		int numberConnections = moveFrom.getNeighbors().size();
		for (int i = 0; i < numberConnections; i++)
	    {
	        if (moveTo == (moveFrom.getNeighbors().get(i)))
	    	{
	          //System.out.println("found a match");
	          return true;
	        }
	        else { //System.out.println("not connected city");
	        	
	        }
	    }
	    return false;
	}
	
}