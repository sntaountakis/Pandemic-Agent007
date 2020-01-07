package Pandemic.cities;

import java.util.ArrayList;

import Pandemic.variables.Variables;

public class HoChiMinhCity extends City {

	/**
	 * The constructor for HoChiMinhCity. 
	 * @param infectionLevel
	 *    the default infection level of this city.
	 */
	

	/**
	 * Initialize specifically for HoChiMinhCity.
	 */
	public HoChiMinhCity (int  redCubes, int blueCubes, int blackCubes,int  yellowCubes, int infectionLevel) {
		super(redCubes,blueCubes,blackCubes,yellowCubes,infectionLevel);
		this.name = "HO_CHI_MINH_CITY";
		this.colour = "Red";		
	}
	public ArrayList<City> getNeighbors() {return this.neighbors;}
	public void setNeighbors(boolean action) {
		if (action) {
			// build the geographical neighbors
			this.neighbors = new ArrayList<City>();
			this.neighbors.add(Variables.jakarta);
			this.neighbors.add(Variables.bangkok);
			this.neighbors.add(Variables.hongkong);
			this.neighbors.add(Variables.manila);
		}	
	}
}
