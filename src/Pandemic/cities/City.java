package Pandemic.cities;

import java.math.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import Pandemic.Gameboard.GameBoard;
import Pandemic.actions.Action;
import Pandemic.player.Player;
import Pandemic.variables.Piece;

import java.util.Collections;



/*
* Represent one of the 48 cities
* on the Pandemic board game
* world map.
*/

public  class City implements Cloneable{

  protected String name;
  protected int infectionLevel ;
  protected ArrayList<City> neighbors;
  protected String colour;
  protected int redCubes ;
  protected int blueCubes ;
  protected int blackCubes ;
  protected int yellowCubes ;
  protected int distance;
  protected boolean hasOutbreak ;
  
  
  public City() {  }
  /**
     * Constructor for objects of class City
     */
  public City(int  redCubes, int blueCubes, int blackCubes,int  yellowCubes, int infectionLevel)
  {
	  this.redCubes = redCubes;
      this.yellowCubes = yellowCubes;
	  this.blueCubes = blueCubes;
	  this.blackCubes = blackCubes;
	  this.infectionLevel = infectionLevel;
  }
  	
  //Gets and sets methods
  public String getName() { return name;}

  public void setName(String name) {this.name = name;}
 
  public String getColour() {return colour;}

  public void setColour(String name) {this.colour = colour;}
 
  public int getInfectionLevel() { return infectionLevel;}
  
  public void setInfectionLevel(int infectionLevel) {
		this.infectionLevel = infectionLevel;
  }
  
  public int getDistance(){ return distance;}
  
  public void setDistance(int newDistance){ distance = newDistance;}
  
  public ArrayList<City> getNeighbors() {return neighbors; }
  
  public void setNeighbors(boolean action) {}

  //returns the highest count of a cube of any colour
  public int getMaxCube()
  {
	  return Math.max(Math.max(this.redCubes,this.blueCubes),Math.max(this.blackCubes,this.yellowCubes));
  }
  

  // remove cube when player choose to cure a disease in specific city
  public void removeCube(String cubeColour){
        if (cubeColour.equals("Red") && redCubes > 0)
        {
            redCubes --;
        }
        else if (cubeColour.equals("Blue") && blueCubes > 0)
        {
            blueCubes --;
        }        
        else if (cubeColour.equals("Yellow") && yellowCubes > 0)
        {
            yellowCubes --;
        }   
        else if (cubeColour.equals("Black") && blackCubes > 0)
        {
            blackCubes --;
        }   
  }
  
  //add one cube when infection occur
  public boolean addCube(String cubeColour){
        if (cubeColour.equals("Red")){
            this.redCubes = this.redCubes + 1;
        }
        else if (cubeColour.equals("Blue"))
        {
        	this.blueCubes = this.blueCubes + 1;
        }        
        else if (cubeColour.equals("Yellow"))
        {
        	this.yellowCubes = this.yellowCubes + 1;
        }   
        else if (cubeColour.equals("Black"))
        {
        	this.blackCubes = this.blackCubes + 1;
        }   
        return checkOutBreaks();
  }
  
  //function for valid outbreak
  //if the infection level surpass the max limit
  //3 cubes , ignore it
  public boolean checkOutBreaks(){
        boolean toReturn = false;
        if (this.redCubes == 4)
        {
            toReturn = true;
            this.redCubes = 3;
        }
        else if (this.blueCubes == 4)
        {
            toReturn = true;
            this.blueCubes = 3;
        }
        else if (this.yellowCubes == 4)
        {
            toReturn = true;
            this.yellowCubes = 3;
        }
        else if (this.blackCubes == 4)
        {
            toReturn = true;
            this.blackCubes = 3;
        }        
        return toReturn;
        
  }
  

  
  public int getCubeColour (String cubeColour){
        if (cubeColour.equals("Red"))
        {
            return redCubes;
        }
        else if (cubeColour.equals("Blue"))
        {
            return blueCubes;
        }        
        else if (cubeColour.equals("Yellow"))
        {
            return yellowCubes;
        }   
        else if (cubeColour.equals("Black"))
        {
            return blackCubes;
        }     
        return 0;
  }

	public Object clone(/*GameBoard gb, Piece pc*/) throws CloneNotSupportedException {
		City cloned = (City) super.clone();
		cloned.name = String.valueOf(this.name);
		cloned.neighbors = this.neighbors; //shallow copy, possible error when outbreak happens
		cloned.colour = String.valueOf(this.colour);
		
	
	
		return cloned;
	}
	public int getRedCubes() {
		return redCubes;
	}
	public void setRedCubes(int redCubes) {
		this.redCubes = redCubes;
	}
	public int getBlueCubes() {
		return blueCubes;
	}
	public void setBlueCubes(int blueCubes) {
		this.blueCubes = blueCubes;
	}
	public int getBlackCubes() {
		return blackCubes;
	}
	public void setBlackCubes(int blackCubes) {
		this.blackCubes = blackCubes;
	}
	public int getYellowCubes() {
		return yellowCubes;
	}
	public void setYellowCubes(int yellowCubes) {
		this.yellowCubes = yellowCubes;
	}
	public boolean isHasOutbreak() {
		return hasOutbreak;
	}
	public void setHasOutbreak(boolean hasOutbreak) {
		this.hasOutbreak = hasOutbreak;
	}
	
}
