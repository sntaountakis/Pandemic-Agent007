package Pandemic.cities;

import java.util.ArrayList;

import Pandemic.variables.Variables;

public class Chicago extends City {

	

	/**
	 * The constructor for Chicago.
	 * @param infectionLevel
	 *   the default infection level of this city.
	 */
	

	/**
	 * Initialize specifically for Chicago.
	 */
	public Chicago (int  redCubes, int blueCubes, int blackCubes,int  yellowCubes, int infectionLevel) {
		super(redCubes,blueCubes,blackCubes,yellowCubes,infectionLevel);
		this.name = "CHICAGO";
		this.colour = "Blue";
	}
	public ArrayList<City> getNeighbors() {return this.neighbors;}
	public void setNeighbors(boolean action) {
		if (action) {
			// build the geographical neighbors
			this.neighbors = new ArrayList<City>();
			this.neighbors.add(0,Variables.sanfransisco);
			this.neighbors.add(1,Variables.losangeles);
			this.neighbors.add(2,Variables.mexicocity);
			this.neighbors.add(3,Variables.atlanta);
			this.neighbors.add(4,Variables.montreal);
		}	
	}
}
