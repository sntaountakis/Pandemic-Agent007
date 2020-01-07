package Pandemic.cities;

import java.util.ArrayList;

import Pandemic.variables.Variables;


public class Kolkata extends City {

	/**
	 * The constructor for Kolkata. 
	 * @param infectionLevel
	 *     the default infection level of this city.
	 */
	
	/**
	 * Initialize specifically for Kolkata.
	 */
	public Kolkata(int  redCubes, int blueCubes, int blackCubes,int  yellowCubes, int infectionLevel) {
		super(redCubes,blueCubes,blackCubes,yellowCubes,infectionLevel);
		this.name = "KOLKATA";
		this.colour = "Black";
	}
	public ArrayList<City> getNeighbors() {return this.neighbors;}
	public void setNeighbors(boolean action) {
		if (action) {
			// build the geographical neighbors
			this.neighbors = new ArrayList<City>();
			this.neighbors.add(Variables.delhi);
			this.neighbors.add(Variables.chennai);
			this.neighbors.add(Variables.bangkok);
			this.neighbors.add(Variables.hongkong);
		}	
	}
}
