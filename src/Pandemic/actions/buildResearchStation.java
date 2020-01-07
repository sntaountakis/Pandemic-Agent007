package Pandemic.actions;

import Pandemic.variables.Variables;
import java.util.ArrayList;
import Pandemic.cities.*;


public class buildResearchStation extends Action{
	
	private City cityToResearchStation;
	private ArrayList<City> hand_cards;
	
	
	public buildResearchStation(City location, ArrayList<City> hand_cards) {
		this.cityToResearchStation = location;
		this.hand_cards = hand_cards;
	}
	
	public buildResearchStation() {	}
	
	public boolean isaLegalMove() {
		this.setCityToResearchStation(cityToResearchStation);
		this.setHand_cards(hand_cards);	 
		for (City c : hand_cards) {
			if (c.getName().equals(cityToResearchStation.getName()) && !Variables.CITY_WITH_RESEARCH_STATION.contains(c))
				//System.out.println("building a research station in " + cityToResearchStation.getName());
				return true;
		}
		return false;		
	}
	

	public City getCityToResearchStation() {return cityToResearchStation;}

	public void setCityToResearchStation(City cityToResearchStation) {this.cityToResearchStation = cityToResearchStation;}

	public ArrayList<City> getHand_cards() {return hand_cards;	}

	public void setHand_cards(ArrayList<City> hand_cards) {	this.hand_cards = hand_cards;}
	
}
