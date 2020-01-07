package Pandemic.cities;

import java.util.ArrayList;

import Pandemic.variables.Variables;


public class Manila extends City {

	
	/**
	 * The constructor for Manila. 
	 * @param infectionLevel
	 *     the default infection level of this city.
	 */
	public Manila(int  redCubes, int blueCubes, int blackCubes,int  yellowCubes, int infectionLevel) {
		super(redCubes,blueCubes,blackCubes,yellowCubes,infectionLevel);
		this.name = "MANILA";
		this.colour = "Red";		
	}
	public ArrayList<City> getNeighbors() {return this.neighbors;}
	public void setNeighbors(boolean action) {
		if (action) {
			// build the geographical neighbors
			this.neighbors = new ArrayList<City>();
			this.neighbors.add(Variables.hochiminhcity);
			this.neighbors.add(Variables.hongkong);
			this.neighbors.add(Variables.taipei);
			this.neighbors.add(Variables.sanfransisco);
			this.neighbors.add(Variables.sydney);
		}	
	}
}
