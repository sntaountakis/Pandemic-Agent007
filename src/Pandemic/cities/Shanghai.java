package Pandemic.cities;

import java.util.ArrayList;

import Pandemic.variables.Variables;


public class Shanghai extends City {
	/**
	 * The constructor for Shanghai.
	 * @param infectionLevel
	 *    the default infection level of this city.
	 */
	public Shanghai(int  redCubes, int blueCubes, int blackCubes,int  yellowCubes, int infectionLevel) {
		super(redCubes,blueCubes,blackCubes,yellowCubes,infectionLevel);
		this.name = "SHANGHAI";
		this.colour = "Red";		
	}
	public ArrayList<City> getNeighbors() {return this.neighbors;}
	public void setNeighbors(boolean action) {
		if (action) {
			// build the geographical neighbors
			this.neighbors = new ArrayList<City>();
			this.neighbors.add(Variables.beijing);
			this.neighbors.add(Variables.seoul);
			this.neighbors.add(Variables.tokyo);
			this.neighbors.add(Variables.hongkong);
			this.neighbors.add(Variables.taipei);
		}	
	}
}
