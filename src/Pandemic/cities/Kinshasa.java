package Pandemic.cities;

import java.util.ArrayList;

import Pandemic.variables.Variables;


public class Kinshasa extends City {


	/**
	 * The constructor for Kinshasa.
	 * @param infectionLevel
	 *      the default infection level of this city.
	 */
	

	/**
	 * Initialize specifically for Kinshasa.
	 */
	public Kinshasa(int  redCubes, int blueCubes, int blackCubes,int  yellowCubes, int infectionLevel) {
		super(redCubes,blueCubes,blackCubes,yellowCubes,infectionLevel);
		this.name = "KINSHASA";
		this.colour = "Yellow";
		
	}
	public ArrayList<City> getNeighbors() {return this.neighbors;}
	public void setNeighbors(boolean action) {
		if (action) {
			// build the geographical neighbors
			this.neighbors = new ArrayList<City>();
			this.neighbors.add(Variables.lagos);
			this.neighbors.add(Variables.khartoum);
			this.neighbors.add(Variables.johannesburg);
		}	
	}
}
