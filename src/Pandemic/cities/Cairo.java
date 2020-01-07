package Pandemic.cities;

import java.util.ArrayList;

import Pandemic.variables.Variables;


public class Cairo extends City {

	/**
	 * The constructor for Cairo. 
	 * @param infectionLevel
	 *    the default infection level of this city.
	 */
	

	/**
	 * Initialize specifically for  Cairo.
	 */
	public Cairo (int  redCubes, int blueCubes, int blackCubes,int  yellowCubes, int infectionLevel) {
		super(redCubes,blueCubes,blackCubes,yellowCubes,infectionLevel);
		this.name = "CAIRO";
		this.colour = "Black";
		
	}
	public void setNeighbors(boolean action) {
		if (action) {
			// build the geographical neighbors
			this.neighbors = new ArrayList<City>();
			neighbors.add(Variables.algiers);
			neighbors.add(Variables.istanbul);
			neighbors.add(Variables.baghdad);
			neighbors.add(Variables.riyadh);
			neighbors.add(Variables.khartoum);	
		}	
	}
	
	public ArrayList<City> getNeighbors() {return this.neighbors;}
}
