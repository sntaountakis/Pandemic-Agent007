package Pandemic.cities;

import java.util.ArrayList;

import Pandemic.variables.Variables;

public class Riyadh extends City {

	/**
	 * The constructor for Riyadh.
	 * @param infectionLevel
	 *    the default infection level of this city.
	 */
	public Riyadh(int  redCubes, int blueCubes, int blackCubes,int  yellowCubes, int infectionLevel) {
		super(redCubes,blueCubes,blackCubes,yellowCubes,infectionLevel);
		this.name = "RIYADH";	
		this.colour = "Black";		
	}
	public ArrayList<City> getNeighbors() {return this.neighbors;}
	public void setNeighbors(boolean action) {
		if (action) {
			// build the geographical neighbors
			this.neighbors = new ArrayList<City>();
			this.neighbors.add(Variables.cairo);
			this.neighbors.add(Variables.baghdad);
			this.neighbors.add(Variables.karachi);
		}	
	}
}
