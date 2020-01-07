package Pandemic.deck;

import java.util.ArrayList;

import Pandemic.cities.City;
//import Pandemic.cities.*;
import Pandemic.variables.Variables;


public class PlayerDeck implements Cloneable{

	private ArrayList<Object> PlayerPile = new ArrayList<>();
	private ArrayList<Object> PlayerDiscardPile = new ArrayList<>();
	private boolean isEpidemic 			= true;
	

	
	
	//PlayerDeck with 48 cities and 4 epidemic cards
	public PlayerDeck(){		
		//add 4-6 epidemic cards and 5 event cards
		PlayerPile.add( Variables.sanfransisco);
		PlayerPile.add( Variables.chicago);
		PlayerPile.add( Variables.atlanta);
		PlayerPile.add( Variables.montreal);
		PlayerPile.add( Variables.newyork);
		PlayerPile.add( Variables.washington);
		PlayerPile.add( Variables.madrid) ;
		PlayerPile.add( Variables.london);
		PlayerPile.add( Variables.paris);
		PlayerPile.add( Variables.essen);
		PlayerPile.add( Variables.milan);
		PlayerPile.add( Variables.stpeterburg);		
		PlayerPile.add( Variables.losangeles);
		PlayerPile.add( Variables.mexicocity);
		PlayerPile.add( Variables.miami);
		PlayerPile.add( Variables.bogota);
		PlayerPile.add( Variables.lima);
		PlayerPile.add( Variables.santiago);
		PlayerPile.add( Variables.buenosaires);
		PlayerPile.add( Variables.saopaulo);
		PlayerPile.add( Variables.lagos);
		PlayerPile.add( Variables.isEpidemic);
		PlayerPile.add( Variables.kinshasa);
		PlayerPile.add( Variables.johannesburg);
		PlayerPile.add( Variables.khartoum);
		PlayerPile.add( Variables.algiers);
		PlayerPile.add( Variables.istanbul);
		PlayerPile.add( Variables.cairo);
		PlayerPile.add( Variables.moscow);
		PlayerPile.add( Variables.baghdad);
		PlayerPile.add( Variables.isEpidemic);
		PlayerPile.add( Variables.tehran);
		PlayerPile.add( Variables.riyadh);
		PlayerPile.add( Variables.karachi);
		PlayerPile.add( Variables.mumbai);
		PlayerPile.add( Variables.delhi);
		PlayerPile.add( Variables.isEpidemic);
		PlayerPile.add( Variables.chennai);
		PlayerPile.add( Variables.kolkata);
		PlayerPile.add( Variables.bangkok);
		PlayerPile.add( Variables.jakarta);
		PlayerPile.add( Variables.hochiminhcity);
		PlayerPile.add( Variables.hongkong);
		PlayerPile.add( Variables.shanghai);
		PlayerPile.add( Variables.beijing);
		PlayerPile.add( Variables.seoul);
		PlayerPile.add( Variables.tokyo);
		PlayerPile.add( Variables.osaka);
		PlayerPile.add( Variables.isEpidemic);
		PlayerPile.add( Variables.taipei);
		PlayerPile.add( Variables.manila);
		PlayerPile.add( Variables.sydney);		
	}


	//setters and getters
	public ArrayList<Object> getPlayerPile() {return PlayerPile;}

	public void setPlayerPile(ArrayList<Object> playerPile) {PlayerPile = playerPile;}

	public ArrayList<Object> getPlayerDiscardPile() {return PlayerDiscardPile;}

	public void setPlayerDiscardPile(ArrayList<Object> playerDiscardPile) {
		PlayerDiscardPile = playerDiscardPile;
	}
	
	public Object clone() throws CloneNotSupportedException {
		PlayerDeck Pl_deck = (PlayerDeck) super.clone();
		Pl_deck.PlayerDiscardPile = (ArrayList<Object>) Pl_deck.getPlayerDiscardPile();
		Pl_deck.PlayerPile		  = (ArrayList<Object>) Pl_deck.getPlayerPile();
		return Pl_deck;
	}
	
}
