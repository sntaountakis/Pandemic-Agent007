package Pandemic.cities;

import java.util.ArrayList;

import Pandemic.variables.Variables;

public class Osaka extends City {
	/**
	 * The constructor for Osaka. 
	 * @param infectionLevel
	 *   the default infection level of this city.
	 */
	public Osaka(int  redCubes, int blueCubes, int blackCubes,int  yellowCubes, int infectionLevel) {
		super(redCubes,blueCubes,blackCubes,yellowCubes,infectionLevel);
		this.name = "OSAKA";
		this.colour = "Red";		
	}
	public ArrayList<City> getNeighbors() {return this.neighbors;}
	public void setNeighbors(boolean action) {
		if (action) {
			// build the geographical neighbors
			this.neighbors = new ArrayList<City>();
			this.neighbors.add(Variables.taipei);
			this.neighbors.add(Variables.tokyo);
		}	
	}
}
