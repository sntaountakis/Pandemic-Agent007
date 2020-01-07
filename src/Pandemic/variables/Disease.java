package Pandemic.variables;

import java.util.ArrayList;

import Pandemic.Gameboard.GameBoard;
import Pandemic.cities.City;
import Pandemic.player.Player;

/**
 * Write a description of class Disease here.
 */
public class Disease implements Cloneable
{
    public String colour;
    public boolean cured;
    public boolean eliminated;


    /**
     * Constructor for objects of class Disease
     */
    public Disease(String diseaseColour)
    {
        colour = diseaseColour;
        cured = false;
        eliminated = false;
        
    }
    
    //GET-SET METHODS
    public boolean getCured()
    {
        return cured;
    }
    
    public void setCured(boolean toSet)
    {
        cured = toSet;
    }

    public void setColour(String newColour)
    {
        colour = newColour;
    }
    
    public String getColour()
    {
        return colour;
    }
    
	public Object clone() throws CloneNotSupportedException {
		Disease cloned = (Disease) super.clone();
		cloned.colour = String.valueOf(this.colour);	
		
		return cloned;
	}

	public boolean isEliminated() {
		return eliminated;
	}

	public void setEliminated(boolean eliminated) {
		this.eliminated = eliminated;
	}  
}
