package Pandemic.actions;

import java.util.ArrayList;
import Pandemic.cities.City;

public class charterFlight extends Action{
	
	private City moveFrom;
	private ArrayList<City> hand_cards;
	private City moveTo;

	public charterFlight( City moveFrom, ArrayList<City> hand_cards,City moveTo) {
		
		this.moveFrom = moveFrom;
		this.hand_cards = hand_cards;
		this.moveTo = moveTo;
	}
	
	
	public City getMoveFrom() {	return moveFrom;	}
	public void setMoveFrom(City moveFrom) {this.moveFrom = moveFrom;	}
	public ArrayList<City> getHand_cards() {return hand_cards;	}
	public void setHand_cards(ArrayList<City> hand_cards) {	this.hand_cards = hand_cards;}
	public City getMoveTo() { return moveTo;}
	public void setMoveTo(City moveTo) { this.moveTo = moveTo;	}
	
	
	
	public boolean isaLegalMove() {
		this.setHand_cards(hand_cards);
		this.setMoveFrom(moveFrom);
		for (City c : hand_cards) {
			if (c.getName().equals(moveFrom.getName()))
				return true;
		}
		return false;
	}


	
	
	
}
