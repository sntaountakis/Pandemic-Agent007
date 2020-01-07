package Pandemic.cities;

import java.util.ArrayList;

import Pandemic.variables.Variables;

public class MexicoCity extends City {


	/**
	 * The constructor for MexicoCity.
	 * @param infectionLevel
	 *     the default infection level of this city.
	 */
	public MexicoCity(int  redCubes, int blueCubes, int blackCubes,int  yellowCubes, int infectionLevel) {
		super(redCubes,blueCubes,blackCubes,yellowCubes,infectionLevel);
		this.name = "MEXICO_CITY";
		this.colour = "Yellow"; 		
	}
	public ArrayList<City> getNeighbors() {return this.neighbors;}
	public void setNeighbors(boolean action) {
		if (action) {
			// build the geographical neighbors
			this.neighbors = new ArrayList<City>();
			this.neighbors.add(Variables.losangeles);
			this.neighbors.add(Variables.chicago);
			this.neighbors.add(Variables.miami);
			this.neighbors.add(Variables.bogota);
			this.neighbors.add(Variables.lima);
		}	
	}
}
