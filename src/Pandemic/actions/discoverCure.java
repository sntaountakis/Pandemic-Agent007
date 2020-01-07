package Pandemic.actions;

import java.util.ArrayList;
import Pandemic.cities.City;
import Pandemic.variables.Variables;

public class discoverCure extends Action{
	
	private City current_city;
	private ArrayList<City> hand_cards;
	private String colorOfDisease;
	
	public discoverCure(City current_city, ArrayList<City> hand_cards, String colorOfDisease) {
		this.current_city = current_city;
		this.hand_cards = hand_cards;
		this.colorOfDisease = colorOfDisease;
	}

	public City getCurrent_city() {return current_city;	}

	public void setCurrent_city(City current_city) {this.current_city = current_city;}

	public ArrayList<City> getHand_cards() {return hand_cards;	}

	public void setHand_cards(ArrayList<City> hand_cards) {	this.hand_cards = hand_cards;	}

	public String getColorOfDisease() {	return colorOfDisease;	}

	public void setColorOfDisease(String colorOfDisease) {this.colorOfDisease = colorOfDisease;	}
	
	public boolean isaLegalMove(int i) {
		this.setColorOfDisease(colorOfDisease);
		this.setCurrent_city(current_city);
		this.setHand_cards(hand_cards);
		if (Variables.CITY_WITH_RESEARCH_STATION.contains(this.current_city)) {
			int red=0;
			int black=0;
			int yellow=0;
			int blue=0;
			
			for (City c : hand_cards) {
				String tmp = c.getColour();
				if (tmp.equals("Blue"))
					blue+=1;
				if (tmp.equals("Red"))
					red+=1;
				if (tmp.equals("Black"))
					black+=1;
				if (tmp.equals("Yellow"))
					yellow+=1;
			}
			switch(this.colorOfDisease) {
				case "Blue"  : return (blue>=4-i);
				case "Black" : return (black>=4-i);
				case "Yellow": return (yellow>=4-i);
				case "Red"   : return (red>=4-i);
				
			}
			
		}
		return false;
		
	}
}
