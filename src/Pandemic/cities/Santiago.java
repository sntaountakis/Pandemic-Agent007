package Pandemic.cities;

import java.util.ArrayList;

import Pandemic.variables.Variables;

public class Santiago extends City {
	/**
	 * The constructor for Santiago.
	 * @param infectionLevel
	 *     the default infection level of this city.
	 */
	public Santiago(int  redCubes, int blueCubes, int blackCubes,int  yellowCubes, int infectionLevel) {
		super(redCubes,blueCubes,blackCubes,yellowCubes,infectionLevel);
		this.name = "SANTIAGO";
		this.colour = "Yellow";		
	}
	public ArrayList<City> getNeighbors() {return this.neighbors;}
	public void setNeighbors(boolean action) {
		if (action) {
			// build the geographical neighbors
			this.neighbors = new ArrayList<City>();
			this.neighbors.add(Variables.lima);
		}	
	}
}
