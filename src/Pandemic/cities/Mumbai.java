package Pandemic.cities;

import java.util.ArrayList;

import Pandemic.variables.Variables;


public class Mumbai extends City {

	/**
	 * The constructor for Mumbai. 
	 * @param infectionLevel
	 *            the default infection level of this city.
	 */
	public Mumbai(int  redCubes, int blueCubes, int blackCubes,int  yellowCubes, int infectionLevel) {
		super(redCubes,blueCubes,blackCubes,yellowCubes,infectionLevel);
		this.name = "MUMBAI";
		this.colour = "Black"; 
	}
	public ArrayList<City> getNeighbors() {return this.neighbors;}
	public void setNeighbors(boolean action) {
		if (action) {
			// build the geographical neighbors
			this.neighbors = new ArrayList<City>();
			this.neighbors.add(Variables.karachi);
			this.neighbors.add(Variables.delhi);
			this.neighbors.add(Variables.chennai);
		}	
	}
}
