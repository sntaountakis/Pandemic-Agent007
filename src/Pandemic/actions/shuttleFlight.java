package Pandemic.actions;
 
import Pandemic.cities.*;
import Pandemic.variables.Variables;
 
public class shuttleFlight extends Action {
 
    private City moveTo;
    private City moveFrom;
 
    /**
     * The constructor of a MoveAction.
     * This defines the city in which
     * the player is to move.
     */
 
    public shuttleFlight(City moveFrom, City moveTo) {
        this.moveFrom = moveFrom;
        this.moveTo = moveTo;
    }
   
 
    public boolean isaLegalMove(){
        this.setMoveFrom(moveFrom);
        this.setMoveTo(moveTo);
        if (Variables.CITY_WITH_RESEARCH_STATION.contains(moveFrom) && Variables.CITY_WITH_RESEARCH_STATION.contains(moveTo)) {
        	return true;
        }
        return false;
    }



	public City getMoveTo() {return moveTo;	}

	public void setMoveTo(City moveTo) {this.moveTo = moveTo;	}

	public City getMoveFrom() {	return moveFrom;}

	public void setMoveFrom(City moveFrom) {this.moveFrom = moveFrom;}
	
}