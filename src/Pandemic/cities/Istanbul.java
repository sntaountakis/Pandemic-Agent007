package Pandemic.cities;

import java.util.ArrayList;

import Pandemic.variables.Variables;

public class Istanbul extends City {

	/**
	 * The constructor for Istanbul.
	 * @param infectionLevel
	 *    the default infection level of this city.
	 */
	

	/**
	 * Initialize  specifically for Istanbul.
	 */
	public Istanbul (int  redCubes, int blueCubes, int blackCubes,int  yellowCubes, int infectionLevel) {
		super(redCubes,blueCubes,blackCubes,yellowCubes,infectionLevel);
		this.name = "ISTANBUL";
		this.colour = "Black";		
	}
	public ArrayList<City> getNeighbors() {return this.neighbors;}
	public void setNeighbors(boolean action) {
		if (action) {
			// build the geographical neighbors
			this.neighbors = new ArrayList<City>();
			this.neighbors.add(Variables.algiers);
			this.neighbors.add(Variables.milan);
			this.neighbors.add(Variables.stpeterburg);
			this.neighbors.add(Variables.moscow);
			this.neighbors.add(Variables.cairo);
			this.neighbors.add(Variables.baghdad);
		}	
	}
}
