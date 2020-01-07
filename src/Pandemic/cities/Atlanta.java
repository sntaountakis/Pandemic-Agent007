package Pandemic.cities;

import java.util.ArrayList;

import Pandemic.variables.Variables;


public class Atlanta extends City  {

	/**
	 * The constructor for Atlanta. 
	 * @param infectionLevel
	 *     the default infection level of this city.
	 */
	
	public Atlanta(int  redCubes, int blueCubes, int blackCubes,int  yellowCubes, int infectionLevel) {
		super(redCubes,blueCubes,blackCubes,yellowCubes,infectionLevel);	
		this.name = "ATLANTA";
		this.colour = "Blue";				
	}
	public ArrayList<City> getNeighbors() {return this.neighbors;}
	public void setNeighbors(boolean action) {
		if (action) {
			// build the geographical neighbors
			this.neighbors = new ArrayList<City>();
			this.neighbors.add(0,Variables.chicago);
			this.neighbors.add(1,Variables.washington);
			this.neighbors.add(2,Variables.miami);
		}	
	}
}
