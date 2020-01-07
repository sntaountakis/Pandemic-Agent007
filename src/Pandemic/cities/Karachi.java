package Pandemic.cities;

import java.util.ArrayList;

import Pandemic.variables.Variables;

public class Karachi extends City {

	/**
	 * The constructor for Karachi. 
	 * @param infectionLevel
	 *     the default infection level of this city.
	 */
	

	/**
	 * Initialize specifically for Karachi.
	 */
	public Karachi(int  redCubes, int blueCubes, int blackCubes,int  yellowCubes, int infectionLevel) {
		super(redCubes,blueCubes,blackCubes,yellowCubes,infectionLevel);
		this.name = "KARACHI";
		this.colour = "Black";
		
	}
	public ArrayList<City> getNeighbors() {return this.neighbors;}
	public void setNeighbors(boolean action) {
		if (action) {
			// build the geographical neighbors
			this.neighbors = new ArrayList<City>();
			this.neighbors.add(Variables.riyadh);
			this.neighbors.add(Variables.baghdad);
			this.neighbors.add(Variables.tehran);
			this.neighbors.add(Variables.delhi);
			this.neighbors.add(Variables.mumbai);
		}	
	}
}
