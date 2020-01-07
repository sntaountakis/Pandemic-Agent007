package Pandemic.cities;

import java.util.ArrayList;

import Pandemic.variables.Variables;

public class HongKong extends City {

	/**
	 * The constructor for 
	 * @param infectionLevel
	 *   the default infection level of this city.
	 */
	
	/**
	 * Initialize specifically for HongKong.
	 */
	public HongKong (int  redCubes, int blueCubes, int blackCubes,int  yellowCubes, int infectionLevel) {
		super(redCubes,blueCubes,blackCubes,yellowCubes,infectionLevel);
		this.name = "HONG_KONG";
		this.colour = "Red";		
	}
	
	public ArrayList<City> getNeighbors() {return this.neighbors;}
	public void setNeighbors(boolean action) {
		if (action) {
			// build the geographical neighbors
			this.neighbors = new ArrayList<City>();
			this.neighbors.add(Variables.bangkok);
			this.neighbors.add(Variables.kolkata);
			this.neighbors.add(Variables.shanghai);
			this.neighbors.add(Variables.taipei);
			this.neighbors.add(Variables.manila);
			this.neighbors.add(Variables.hochiminhcity);
		}	
	}
}
