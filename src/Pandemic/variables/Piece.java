package Pandemic.variables;


import java.util.ArrayList;

import Pandemic.Gameboard.GameBoard;
import Pandemic.cities.*;
import Pandemic.deck.InfectDeck;
import Pandemic.deck.PlayerDeck;
import Pandemic.player.Player;

public class Piece implements Cloneable
{
    public Player owner;
    //public GameBoard gameBoard;
    public City location;


    /**
     * Constructor of class piece
     */
    public Piece(Player newOwner,/*, GameBoard pieceBoard,*/ City curLocation)
    {
        owner = newOwner;
        //gameBoard = pieceBoard;
        location = curLocation;
    }
    
    
    public void setLocation(City newLocation) { location = newLocation;}
    
    public City getLocation() {   return location;  }
    
    public ArrayList<City> getLocationConnections()
    {
    	return location.getNeighbors();
    }   
    
    

    
    
	public Object clone(GameBoard gb) throws CloneNotSupportedException {
		Piece cloned = (Piece) super.clone();
		cloned.owner    = (Player) this.owner.clone(gb, cloned);
		cloned.location    = (City) this.location.clone();
		
		return cloned;
	}
}