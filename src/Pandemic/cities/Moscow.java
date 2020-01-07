package Pandemic.cities;

import java.util.ArrayList;

import Pandemic.variables.Variables;

public class Moscow extends City {

	/**
	 * The constructor for Moscow. 
	 * @param infectionLevel
	 *            the default infection level of this city.
	 */
	public Moscow(int  redCubes, int blueCubes, int blackCubes,int  yellowCubes, int infectionLevel) {
		super(redCubes,blueCubes,blackCubes,yellowCubes,infectionLevel);
		this.name = "MOSCOW";
		this.colour = "Black"; 
	}
	public ArrayList<City> getNeighbors() {return this.neighbors;}
	public void setNeighbors(boolean action) {
		if (action) {
			// build the geographical neighbors
			this.neighbors = new ArrayList<City>();
			this.neighbors.add(Variables.istanbul);
			this.neighbors.add(Variables.stpeterburg);
			this.neighbors.add(Variables.tehran);
			this.neighbors.add(Variables.baghdad);
		}	
	}
}
