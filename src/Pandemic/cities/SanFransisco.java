package Pandemic.cities;

import java.util.ArrayList;

import Pandemic.variables.Variables;

public class SanFransisco extends City {


	/**
	 * The constructor for SanFransisco. 
	 * @param infectionLevel
	 *            the default infection level of this city.
	 */
	public SanFransisco(int  redCubes, int blueCubes, int blackCubes,int  yellowCubes, int infectionLevel) {
		super(redCubes,blueCubes,blackCubes,yellowCubes,infectionLevel);
		this.name = "SAN_FRANSISCO";
		this.colour = "Blue";		
	}
	public ArrayList<City> getNeighbors() {return this.neighbors;}
	public void setNeighbors(boolean action) {
		if (action) {
			// build the geographical neighbors
			this.neighbors = new ArrayList<City>();
			this.neighbors.add(Variables.tokyo);
			this.neighbors.add(Variables.manila);
			this.neighbors.add(Variables.losangeles);
			this.neighbors.add(Variables.chicago);
		}	
	}
}
