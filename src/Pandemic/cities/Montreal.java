package Pandemic.cities;

import java.util.ArrayList;

import Pandemic.variables.Variables;

public class Montreal extends City {

	
	/**
	 * The constructor for Montreal. 
	 * @param infectionLevel
	 *            the default infection level of this city.
	 */
	public Montreal(int  redCubes, int blueCubes, int blackCubes,int  yellowCubes, int infectionLevel) {
		super(redCubes,blueCubes,blackCubes,yellowCubes,infectionLevel);
		this.name = "MONTREAL";
		this.colour = "Blue";
	}
	public ArrayList<City> getNeighbors() {return this.neighbors;}
	public void setNeighbors(boolean action) {
		if (action) {
			// build the geographical neighbors
			this.neighbors = new ArrayList<City>();
			this.neighbors.add(Variables.chicago);
			this.neighbors.add(Variables.washington);
			this.neighbors.add(Variables.newyork);
		}	
	}
}
