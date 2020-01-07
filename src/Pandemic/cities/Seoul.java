package Pandemic.cities;

import java.util.ArrayList;

import Pandemic.variables.Variables;


public class Seoul extends City {

	/**
	 * The constructor for Seoul. 
	 * @param infectionLevel
	 *     the default infection level of this city.
	 */
	public Seoul(int  redCubes, int blueCubes, int blackCubes,int  yellowCubes, int infectionLevel) {
		super(redCubes,blueCubes,blackCubes,yellowCubes,infectionLevel);
		this.name = "SEOUL";
		this.colour = "Red";		
	}
	public ArrayList<City> getNeighbors() {return this.neighbors;}
	public void setNeighbors(boolean action) {
		if (action) {
			// build the geographical neighbors
			this.neighbors = new ArrayList<City>();
			this.neighbors.add(Variables.beijing);
			this.neighbors.add(Variables.shanghai);
			this.neighbors.add(Variables.tokyo);
		}	
	}
}
