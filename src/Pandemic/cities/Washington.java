package Pandemic.cities;

import java.util.ArrayList;

import Pandemic.variables.Variables;

public class Washington extends City {

	
	/**
	 * Initialize specifically for Washington.
	 */
	public Washington(int  redCubes, int blueCubes, int blackCubes,int  yellowCubes, int infectionLevel) {
		super(redCubes,blueCubes,blackCubes,yellowCubes,infectionLevel);
		this.name = "WASHINGTON";
		this.colour = "Blue";
	}
	public ArrayList<City> getNeighbors() {return this.neighbors;}
	public void setNeighbors(boolean action) {
		// build the geographical neighbors
		this.neighbors = new ArrayList<City>();
		this.neighbors.add(Variables.miami);
		this.neighbors.add(Variables.atlanta);
		this.neighbors.add(Variables.montreal);
		this.neighbors.add(Variables.newyork);
	}
}
