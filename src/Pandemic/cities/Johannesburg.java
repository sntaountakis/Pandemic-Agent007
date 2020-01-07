package Pandemic.cities;

import java.util.ArrayList;

import Pandemic.variables.Variables;

public class Johannesburg extends City {

	/**
	 * The constructor for {@code Johannesburg}. 
	 * @param infectionLevel
	 *     the default infection level of this city.
	 */
	
	/**
	 * Initialize specifically for Johannesburg.
	 */
	public Johannesburg(int  redCubes, int blueCubes, int blackCubes,int  yellowCubes, int infectionLevel) {
		super(redCubes,blueCubes,blackCubes,yellowCubes,infectionLevel);
		this.name = "JOHANNESBURG";
		this.colour = "Yellow";		
	}
	public ArrayList<City> getNeighbors() {return this.neighbors;}
	public void setNeighbors(boolean action) {
		if (action) {
			// build the geographical neighbors
			this.neighbors = new ArrayList<City>();
			this.neighbors.add(Variables.kinshasa);
			this.neighbors.add(Variables.khartoum);
		}	
	}
}
