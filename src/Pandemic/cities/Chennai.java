package Pandemic.cities;

import java.util.ArrayList;

import Pandemic.variables.Variables;

public class Chennai extends City {

	/**
	 * The constructor for Chennai. 
	 * @param infectionLevel
	 *     the default infection level of this city.
	 */
	

	/**
	 * Initialize specifically for Chennai.
	 */
	public Chennai (int  redCubes, int blueCubes, int blackCubes,int  yellowCubes, int infectionLevel) {
		super(redCubes,blueCubes,blackCubes,yellowCubes,infectionLevel);
		this.name = "CHENNAI";
		this.colour = "Black";		
	}
	public ArrayList<City> getNeighbors() {return this.neighbors;}
	public void setNeighbors(boolean action) {
		if (action) {
			// build the geographical neighbors
			this.neighbors = new ArrayList<City>();
			this.neighbors.add(Variables.mumbai);
			this.neighbors.add(Variables.delhi);
			this.neighbors.add(Variables.kolkata);
			this.neighbors.add(Variables.bangkok);
			this.neighbors.add(Variables.jakarta);	
		}	
	}
}
