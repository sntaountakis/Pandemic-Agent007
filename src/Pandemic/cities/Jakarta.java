package Pandemic.cities;

import java.util.ArrayList;

import Pandemic.variables.Variables;


public class Jakarta extends City {

	/**
	 * The constructor for Jakarta.	 * 
	 * @param infectionLevel
	 *     the default infection level of this city.
	 */
	
	/**
	 * Initialize specifically for Jakarta.
	 */
	public Jakarta(int  redCubes, int blueCubes, int blackCubes,int  yellowCubes, int infectionLevel) {
		super(redCubes,blueCubes,blackCubes,yellowCubes,infectionLevel);
		this.name = "JAKARTA";
		this.colour = "Red";
		
	}
	public ArrayList<City> getNeighbors() {return this.neighbors;}
	public void setNeighbors(boolean action) {
		if (action) {
			// build the geographical neighbors
			this.neighbors = new ArrayList<City>();
			this.neighbors.add(Variables.chennai);
			this.neighbors.add(Variables.bangkok);
			this.neighbors.add(Variables.hochiminhcity);
			this.neighbors.add(Variables.sydney);
		}	
	}
}
