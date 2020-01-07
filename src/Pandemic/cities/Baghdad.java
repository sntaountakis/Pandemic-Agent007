package Pandemic.cities;

import java.util.ArrayList;

import Pandemic.variables.Variables;


public class Baghdad extends City {

	
	/**
	 * The constructor for Baghdad. 
	 * @param infectionLevel
	 *      the default infection level of this city.
	 */
	
	/**
	 * Initialize specifically for Baghdad.
	 */
	public Baghdad (int  redCubes, int blueCubes, int blackCubes,int  yellowCubes, int infectionLevel) {		
		super(redCubes,blueCubes,blackCubes,yellowCubes,infectionLevel);
		this.colour = "Black";
		this.name = "BAGHDAD";		
	}
	public ArrayList<City> getNeighbors() {return this.neighbors;}
	public void setNeighbors(boolean action) {
		if (action) {
			// build the geographical neighbors
			this.neighbors = new ArrayList<City>();
			this.neighbors.add(0,Variables.cairo);
			this.neighbors.add(1,Variables.istanbul);
			this.neighbors.add(2,Variables.tehran);
			this.neighbors.add(3,Variables.karachi);
			this.neighbors.add(4,Variables.riyadh);
		}	
	}
}
