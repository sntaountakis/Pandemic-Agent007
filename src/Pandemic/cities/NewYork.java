package Pandemic.cities;

import java.util.ArrayList;

import Pandemic.variables.Variables;

public class NewYork extends City {

	

	/**
	 * The constructor for NewYork.
	 * @param infectionLevel
	 *   the default infection level of this city.
	 */
	public NewYork(int  redCubes, int blueCubes, int blackCubes,int  yellowCubes, int infectionLevel) {
		super(redCubes,blueCubes,blackCubes,yellowCubes,infectionLevel);
		this.name = "NEW_YORK";
		this.colour = "Blue";		
	}
	public ArrayList<City> getNeighbors() {return this.neighbors;}
	public void setNeighbors(boolean action) {
		if (action) {
			// build the geographical neighbors
			this.neighbors = new ArrayList<City>();
			this.neighbors.add(Variables.washington);
			this.neighbors.add(Variables.montreal);
			this.neighbors.add(Variables.london);
			this.neighbors.add(Variables.madrid);
		}	
	}
}
