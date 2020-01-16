package Pandemic.cities;

import java.util.ArrayList;

import Pandemic.variables.Variables;

public class Khartoum extends City {

	/**
	 * The constructor for Khartoum. 
	 * @param infectionLevel
	 *      the default infection level of this city.
	 */
	
	/**
	 * Initialize specifically for Khartoum.
	 */
	public Khartoum(int  redCubes, int blueCubes, int blackCubes,int  yellowCubes, int infectionLevel) {
		super(redCubes,blueCubes,blackCubes,yellowCubes,infectionLevel);
		this.name = "KHARTOUM";
		this.colour = "Yellow";		
	}
	public ArrayList<City> getNeighbors() {return this.neighbors;}
	public void setNeighbors(boolean action) {
		if (action) {
			// build the geographical neighbors
			this.neighbors = new ArrayList<City>();
			this.neighbors.add(Variables.johannesburg);
			this.neighbors.add(Variables.lagos);
			this.neighbors.add(Variables.cairo);
			this.neighbors.add(Variables.kinshasa);
		}	
	}
}
