package Pandemic.cities;

import java.util.ArrayList;

import Pandemic.variables.Variables;


public class Milan extends City {

	/**
	 * The constructor for Milan. 
	 * @param infectionLevel
	 *    the default infection level of this city.
	 */
	public Milan(int  redCubes, int blueCubes, int blackCubes,int  yellowCubes, int infectionLevel) {
		super(redCubes,blueCubes,blackCubes,yellowCubes,infectionLevel);
		this.name = "MILAN";
		this.colour = "Blue"; 
	}
	public ArrayList<City> getNeighbors() {return this.neighbors;}
	public void setNeighbors(boolean action) {
		if (action) {
			// build the geographical neighbors
			this.neighbors = new ArrayList<City>();
			this.neighbors.add(Variables.paris);
			this.neighbors.add(Variables.essen);
			this.neighbors.add(Variables.istanbul);
		}	
	}
}
