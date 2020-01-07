package Pandemic.cities;

import java.util.ArrayList;

import Pandemic.variables.Variables;

public class Lima extends City {

	/**
	 * The constructor for Lima. 
	 * @param infectionLevel
	 *    the default infection level of this city.
	 */
	

	/**
	 * Initialize specifically for Lima.
	 */
	public Lima(int  redCubes, int blueCubes, int blackCubes,int  yellowCubes, int infectionLevel) {
		super(redCubes,blueCubes,blackCubes,yellowCubes,infectionLevel);
		this.name = "LIMA";
		this.colour = "Yellow";		
	}
	public ArrayList<City> getNeighbors() {return this.neighbors;}
	public void setNeighbors(boolean action) {
		if (action) {
			// build the geographical neighbors
			this.neighbors = new ArrayList<City>();
			this.neighbors.add(Variables.santiago);
			this.neighbors.add(Variables.mexicocity);
			this.neighbors.add(Variables.bogota);
		}	
	}
}
