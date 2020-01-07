package Pandemic.actions;

import Pandemic.cities.City;

public class treatDisease extends Action{
	
	private City location;
	private String colour;
	
	public treatDisease(City location, String colour) {
		this.location = location;
		this.colour = colour;
	}
	
	public boolean isaLegalMove () {
		this.setColour(colour);
		this.setLocation(location);
		if (location.getCubeColour(colour)>0) {
			System.out.println("There are some cubes of that colour");
			return true;
		}
		else {
			System.out.println("No cubes of that colour");
			return false;
		}
	}
	
	public City getLocation() {	return location;	}
	public void setLocation(City location) {this.location = location;	}
	public String getColour() {	return colour;	}
	public void setColour(String colour) {	this.colour = colour;}
	
	
	
}
