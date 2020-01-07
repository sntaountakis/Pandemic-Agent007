package Pandemic.cities;

import java.util.ArrayList;

import Pandemic.variables.Variables;


public class Algiers extends City {
	/**
	 * The constructor for Algiers. 
	 * @param infectionLevel
	 *     the default infection level of this city.
	 */
	public Algiers(int  redCubes, int blueCubes, int blackCubes,int  yellowCubes, int infectionLevel) {
		super(redCubes,blueCubes,blackCubes,yellowCubes,infectionLevel);
		this.colour = "Black";
		this.name = "ALGIERS";		
	}
	
	public void setNeighbors(boolean action) {
		if (action) {
			//build the geographical neighbors
			this.neighbors = new ArrayList<City>();
			this.neighbors.add(0,Variables.madrid);	
			this.neighbors.add(1,Variables.paris);
			this.neighbors.add(2,Variables.istanbul);
			this.neighbors.add(3,Variables.cairo);
		}	
	}
	
	public ArrayList<City> getNeighbors() {return this.neighbors;}
}
