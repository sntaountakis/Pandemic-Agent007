package Pandemic.cities;

import java.util.ArrayList;

import Pandemic.variables.Variables;


public class Sydney extends City {
	/**
	 * The constructor for Sydney. 
	 * @param infectionLevel
	 *    the default infection level of this city.
	 */
	public Sydney(int  redCubes, int blueCubes, int blackCubes,int  yellowCubes, int infectionLevel) {
		super(redCubes,blueCubes,blackCubes,yellowCubes,infectionLevel);
		this.name = "SYDNEY";
		this.colour = "Red";		
	}
	public ArrayList<City> getNeighbors() {return this.neighbors;}
	public void setNeighbors(boolean action) {
		if (action) {
			// build the geographical neighbors
			this.neighbors = new ArrayList<City>();
			this.neighbors.add(Variables.jakarta);
			this.neighbors.add(Variables.manila);
			this.neighbors.add(Variables.losangeles);
		}	
	}
}
