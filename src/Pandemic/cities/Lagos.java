package Pandemic.cities;

import java.util.ArrayList;

import Pandemic.variables.Variables;

public class Lagos extends City {


	/**
	 * The constructor for Lagos
	 * @param infectionLevel
	 *     the default infection level of this city.
	 */
	
	/**
	 * Initialize specifically for Lagos.
	 */
	public Lagos(int  redCubes, int blueCubes, int blackCubes,int  yellowCubes, int infectionLevel) {
		super(redCubes,blueCubes,blackCubes,yellowCubes,infectionLevel);
		this.name = "LAGOS";
		this.colour = "Yellow";		
	}
	public ArrayList<City> getNeighbors() {return this.neighbors;}
	public void setNeighbors(boolean action) {
		if (action) {
			// build the geographical neighbors
			this.neighbors = new ArrayList<City>();
			this.neighbors.add(Variables.saopaulo);
			this.neighbors.add(Variables.kinshasa);
			this.neighbors.add(Variables.khartoum);
		}	
	}
}
