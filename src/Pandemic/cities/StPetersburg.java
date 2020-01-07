package Pandemic.cities;

import java.util.ArrayList;

import Pandemic.variables.Variables;

public class StPetersburg extends City {

	/**
	 * The constructor for StPetersburg.
	 * @param infectionLevel
	 *     the default infection level of this city.
	 */
	public StPetersburg(int  redCubes, int blueCubes, int blackCubes,int  yellowCubes, int infectionLevel) {
		super(redCubes,blueCubes,blackCubes,yellowCubes,infectionLevel);
		this.name = "ST_PETERSBURG";
		this.colour = "Blue";		
	}
	public ArrayList<City> getNeighbors() {return this.neighbors;}
	public void setNeighbors(boolean action) {
		if (action) {
			// build the geographical neighbors
			this.neighbors = new ArrayList<City>();
			this.neighbors.add(Variables.essen);
			this.neighbors.add(Variables.istanbul);
			this.neighbors.add(Variables.moscow);
		}	
	}
}
