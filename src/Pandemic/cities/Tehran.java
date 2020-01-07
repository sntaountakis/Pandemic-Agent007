package Pandemic.cities;

import java.util.ArrayList;

import Pandemic.variables.Variables;

public class Tehran extends City {

	/**
	 * The constructor for Tehran. 
	 * @param infectionLevel
	 *     the default infection level of this city.
	 */
	public Tehran(int  redCubes, int blueCubes, int blackCubes,int  yellowCubes, int infectionLevel) {
		super(redCubes,blueCubes,blackCubes,yellowCubes,infectionLevel);
		this.name = "TEHRAN";
		this.colour = "Black";		
	}
	public ArrayList<City> getNeighbors() {return this.neighbors;}
	public void setNeighbors(boolean action) {
		if (action) {
			// build the geographical neighbors
			this.neighbors = new ArrayList<City>();
			this.neighbors.add(Variables.moscow);
			this.neighbors.add(Variables.baghdad);
			this.neighbors.add(Variables.karachi);
			this.neighbors.add(Variables.delhi);
		}	
	}
}
