package Pandemic.cities;

import java.util.ArrayList;

import Pandemic.variables.Variables;

public class London extends City {

	/**
	 * The constructor for London. 
	 * @param infectionLevel
	 *    the default infection level of this city.
	 */
	
	/**
	 * Initialize specifically for London.
	 */
	public London (int redCubes, int blueCubes, int blackCubes,int  yellowCubes, int infectionLevel) {
		super(redCubes,blueCubes,blackCubes,yellowCubes,infectionLevel);
		this.name = "LONDON";
		this.colour = "Blue";
		
	}
	public ArrayList<City> getNeighbors() {return this.neighbors;}
	public void setNeighbors(boolean action) {
		if (action) {
			// build the geographical neighbors
			this.neighbors = new ArrayList<City>();
			this.neighbors.add(Variables.newyork);
			this.neighbors.add(Variables.madrid);
			this.neighbors.add(Variables.paris);
			this.neighbors.add(Variables.essen);
		}	
	}
}
