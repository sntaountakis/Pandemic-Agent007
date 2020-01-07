package Pandemic.actions;

import java.util.ArrayList;

import Pandemic.cities.City;

public class directFlight extends Action{
	
	private City moveTo;
	private ArrayList<City> hand_cards;
	
	public directFlight (City moveTo, ArrayList<City> hand_cards) {
		this.moveTo = moveTo;
		this.hand_cards = hand_cards;
	}

	public City getMoveTo() {return moveTo;	}

	public void setMoveTo(City moveTo) {this.moveTo = moveTo;	}

	public ArrayList<City> getHand_cards() {return hand_cards;	}

	public void setHand_cards(ArrayList<City> hand_cards) {	this.hand_cards = hand_cards; }
	
	public boolean isaLegalMove() {
		this.setHand_cards(hand_cards);
		this.setMoveTo(moveTo);
		for (City c : hand_cards) {
			if (c.getName().equals(moveTo.getName()))
				return true;
		}
		return false;
	}

}
