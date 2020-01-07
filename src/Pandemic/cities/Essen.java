package Pandemic.cities;

import java.util.ArrayList;

import Pandemic.variables.Variables;

public class Essen extends City {

	
	/**
	 * The constructor for Essen. 
	 * @param infectionLevel
	 *    the default infection level of this city.
	 */
	
	/**
	 * Initialize specifically for Essen.
	 */
	public Essen (int  redCubes, int blueCubes, int blackCubes,int  yellowCubes, int infectionLevel) {
		super(redCubes,blueCubes,blackCubes,yellowCubes,infectionLevel);
		this.name = "ESSEN"; 
		this.colour = "Blue";
		
	}
	public ArrayList<City> getNeighbors() {return this.neighbors;}
	public void setNeighbors(boolean action) {
		if (action) {
			// build the geographical neighbors
			this.neighbors = new ArrayList<City>();
			this.neighbors.add(Variables.london);
			this.neighbors.add(Variables.paris);
			this.neighbors.add(Variables.milan);
			this.neighbors.add(Variables.stpeterburg);
		}	
	}
}
