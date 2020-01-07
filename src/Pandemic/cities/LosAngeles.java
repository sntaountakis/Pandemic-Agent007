package Pandemic.cities;

import java.util.ArrayList;

import Pandemic.variables.Variables;


public class LosAngeles extends City {

	/**
	 * The constructor for LosAngeles. 
	 * @param infectionLevel
	 *       the default infection level of this city.
	 */
	

	/**
	 * Initialize specifically for LosAngeles.
	 */
	public LosAngeles(int  redCubes, int blueCubes, int blackCubes,int  yellowCubes, int infectionLevel) {
		super(redCubes,blueCubes,blackCubes,yellowCubes,infectionLevel);
		this.name = "LOS_ANGELES";
		this.colour = "Yellow";		
	}
	public ArrayList<City> getNeighbors() {return this.neighbors;}
	public void setNeighbors(boolean action) {
		if (action) {
			// build the geographical neighbors
			this.neighbors = new ArrayList<City>();
			this.neighbors.add(Variables.sydney);
			this.neighbors.add(Variables.sanfransisco);
			this.neighbors.add(Variables.chicago);
			this.neighbors.add(Variables.mexicocity);
		}	
	}
}
