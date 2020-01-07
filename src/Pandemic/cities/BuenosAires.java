package Pandemic.cities;

import java.util.ArrayList;

import Pandemic.variables.Variables;

public class BuenosAires extends City {

	/**
	 * The constructor for BuenosAires. 
	 * @param infectionLevel
	 *    the default infection level of this city.
	 */
	
	/**
	 * Initialize specifically for BuenosAires.
	 */
	public BuenosAires (int  redCubes, int blueCubes, int blackCubes,int  yellowCubes, int infectionLevel) {
		super(redCubes,blueCubes,blackCubes,yellowCubes,infectionLevel);
		this.name = "BUENOS_AIRES";
		this.colour = "Yellow";
		
	}
	public ArrayList<City> getNeighbors() {return this.neighbors;}
	public void setNeighbors(boolean action) {
		if (action) {
			// build the geographical neighbors
			this.neighbors = new ArrayList<City>();
			this.neighbors.add(Variables.bogota);
			this.neighbors.add(Variables.saopaulo);	
		}	
	}
}
