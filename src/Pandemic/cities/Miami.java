package Pandemic.cities;

import java.util.ArrayList;

import Pandemic.variables.Variables;

public class Miami extends City {

	
	/**
	 * The constructor for Miami. 
	 * @param infectionLevel
	 *     the default infection level of this city.
	 */
	public Miami(int  redCubes, int blueCubes, int blackCubes,int  yellowCubes, int infectionLevel) {
		super(redCubes,blueCubes,blackCubes,yellowCubes,infectionLevel);
		this.name = "MIAMI";
		this.colour = "Yellow";
	}
	public ArrayList<City> getNeighbors() {return this.neighbors;}
	public void setNeighbors(boolean action) {
		if (action) {
			// build the geographical neighbors
			this.neighbors = new ArrayList<City>();
			this.neighbors.add(Variables.bogota);
			this.neighbors.add(Variables.mexicocity);
			this.neighbors.add(Variables.atlanta);
			this.neighbors.add(Variables.washington);
		}	
	}
}
