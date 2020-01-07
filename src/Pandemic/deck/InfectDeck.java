package Pandemic.deck;

import java.util.ArrayList;
import Pandemic.cities.*;
import Pandemic.variables.Variables;


public class InfectDeck implements Cloneable{

	private ArrayList<City> InfectPile = new ArrayList<City>();
	private ArrayList<City> InfectDiscardPile = new ArrayList<City>();
	private ArrayList<City> InfectDiscardPileBeforeEpidemic = new ArrayList<City>();
	
	//CREATE A Infect Deck with 48 cities
	//each one of 48 cities in table graph
	public InfectDeck(){				
		InfectPile.add( Variables.sanfransisco);
		InfectPile.add( Variables.chicago);
		InfectPile.add( Variables.atlanta);
		InfectPile.add( Variables.montreal);
		InfectPile.add( Variables.newyork);
		InfectPile.add( Variables.washington);
		InfectPile.add( Variables.madrid) ;
		InfectPile.add( Variables.london);
		InfectPile.add( Variables.paris);
		InfectPile.add( Variables.essen);
		InfectPile.add( Variables.milan);
		InfectPile.add( Variables.stpeterburg);
		InfectPile.add( Variables.losangeles);
		InfectPile.add( Variables.mexicocity);
		InfectPile.add( Variables.miami);
		InfectPile.add( Variables.bogota);
		InfectPile.add( Variables.lima);
		InfectPile.add( Variables.santiago);
		InfectPile.add( Variables.buenosaires);
		InfectPile.add( Variables.saopaulo);
		InfectPile.add( Variables.lagos);
		InfectPile.add( Variables.kinshasa);
		InfectPile.add( Variables.johannesburg);
		InfectPile.add( Variables.khartoum);
		InfectPile.add( Variables.algiers);
		InfectPile.add( Variables.istanbul);
		InfectPile.add( Variables.cairo);
		InfectPile.add( Variables.moscow);
		InfectPile.add( Variables.baghdad);
		InfectPile.add( Variables.tehran);
		InfectPile.add( Variables.riyadh);
		InfectPile.add( Variables.karachi);
		InfectPile.add( Variables.mumbai);
		InfectPile.add( Variables.delhi);
		InfectPile.add( Variables.chennai);
		InfectPile.add( Variables.kolkata);
		InfectPile.add( Variables.bangkok);
		InfectPile.add( Variables.jakarta);
		InfectPile.add( Variables.hochiminhcity);
		InfectPile.add( Variables.hongkong);
		InfectPile.add( Variables.shanghai);
		InfectPile.add( Variables.beijing);
		InfectPile.add( Variables.seoul);
		InfectPile.add( Variables.tokyo);
		InfectPile.add( Variables.osaka);
		InfectPile.add( Variables.taipei);
		InfectPile.add( Variables.manila);
		InfectPile.add( Variables.sydney);
	}

	//getters and setters
	public ArrayList<City> getInfectPile() {return InfectPile;	}
	public void setInfectPile(ArrayList<City> infectPile) {InfectPile = infectPile;}
	public ArrayList<City> getInfectDiscardPile() {	return InfectDiscardPile;}
	public void setInfectDiscardPile(ArrayList<City> infectDiscardPile) {		InfectDiscardPile = infectDiscardPile;
	}
	public ArrayList<City> getInfectDiscardPileBeforeEpidemic() {	return InfectDiscardPileBeforeEpidemic;
	}
	public void setInfectDiscardPileBeforeEpidemic(ArrayList<City> infectDiscardPileBeforeEpidemic) {
		InfectDiscardPileBeforeEpidemic = infectDiscardPileBeforeEpidemic;
	}

	public Object clone() throws CloneNotSupportedException {
	    InfectDeck Inf_deck = (InfectDeck) super.clone();
	    Inf_deck.InfectDiscardPile				 = (ArrayList<City>) Inf_deck.getInfectDiscardPile();
	    Inf_deck.InfectDiscardPileBeforeEpidemic = (ArrayList<City>) Inf_deck.getInfectDiscardPileBeforeEpidemic();
	    Inf_deck.InfectPile		   				 = (ArrayList<City>) Inf_deck.getInfectPile();
		return Inf_deck;
	}
}
