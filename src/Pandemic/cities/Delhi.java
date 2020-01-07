package Pandemic.cities;

import java.util.ArrayList;

import Pandemic.variables.Variables;

public class Delhi extends City {

	/**
	 * The constructor for Delhi.
	 * @param infectionLevel
	 *     the default infection level of this city.
	 */
	

	/**
	 * Initialize specifically for Delhi.
	 */
	public Delhi (int  redCubes, int blueCubes, int blackCubes,int  yellowCubes, int infectionLevel) {
		super(redCubes,blueCubes,blackCubes,yellowCubes,infectionLevel);
		this.name = "DELHI";
		this.colour = "Black";
		
	}
	public ArrayList<City> getNeighbors() {return this.neighbors;}
	public void setNeighbors(boolean action) {
		if (action) {
			// build the geographical neighbors
			this.neighbors = new ArrayList<City>();
			this.neighbors.add(Variables.tehran);
			this.neighbors.add(Variables.karachi);
			this.neighbors.add(Variables.mumbai);
			this.neighbors.add(Variables.chennai);
			this.neighbors.add(Variables.kolkata);
		}	
	}
}
