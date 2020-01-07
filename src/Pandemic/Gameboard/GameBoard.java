package Pandemic.Gameboard;

import java.util.ArrayList;
import java.util.Collections;
import Pandemic.cities.City;
import Pandemic.deck.InfectDeck;
import Pandemic.deck.PlayerDeck;
import Pandemic.variables.Disease;
import Pandemic.variables.Piece;
import Pandemic.variables.Variables;

/***
 * This is a attempt to construct a naive Pandemic Board game edition.*
 ***/

public class GameBoard implements Cloneable{
	
    
    // A city used for unused research centers
    //public City unplaced = new City();

    // the number of cards needed to discover a cure
    public int neededForCure;
    
    // the array of the infection rate indicator.
    public int infectionRate;
    
    // the position on the array of the marker.
    public int currentRate=1;
    
    // The number of outbreaks.
    public int outbreakCount;
    
    //----------------------------------------------------/////////
    // An array containing all the players pieces.
    public Piece[] playerPieces;    
    
    public PlayerDeck playerDeck ;
    public InfectDeck infectDeck ;
    public InfectDeck CitiesMap  ;
    
    // A ArrayList made up of player cards.
    public ArrayList<Object> playerPile = new ArrayList<Object>() ;    
    
    // A ArrayList made up of discarded player cards.
    public ArrayList<Object> playerDiscardPile  = new ArrayList<Object>();   
    
    // The same for the infect cards
    public ArrayList<City>   infectPile = new ArrayList<City>();
    
    // The same for the infect cards
    public ArrayList<City>   infectDiscardPile = new ArrayList<City>() ;
    
    // The same for the infect cards
    public ArrayList<City>   infectDiscardPileBeforeEpidemic = new ArrayList<City>() ;
        
    // An array containing all the city objects used in the game.
 	public ArrayList<City>   cities = new ArrayList<City>();
 	
 	//set and get for cities_list
 	public ArrayList<City> getCities() {return cities;}
	public void setCities(ArrayList<City> cities) { this.cities = cities;}
	
	
 	//an array use for special ability of QUARANTINE_SPECIALIST
 	public ArrayList<City>   checkCities = new ArrayList<City>(); 	
 	
    // counters for each of the pools of cubes.
    public int redCubes = 24;
    public int blueCubes = 24;
    public int yellowCubes = 24;
    public int blackCubes = 24;
    
    // An arraylist containing all the research centers
    public ArrayList<City> researchCentres;
    
    // An arraylist containing all the diseases used in the game.
    public ArrayList<Disease> diseases = new ArrayList<Disease>();
    
    public int numberColours;
        
    // This gives a list of all the colors which could be used.
    String[] possibleColour = {"Red","Blue","Yellow","Black"};
    
    public GameBoard()
    {
        infectionRate = Variables.INFECTION_RATE;
        setDiseases();
        System.out.println("Setting up the map");
        System.out.println("Setting up the decks");
        playerDeck = new PlayerDeck();
        infectDeck = new InfectDeck();
        CitiesMap  = new InfectDeck();
   
        playerPile = playerDeck.getPlayerPile();
        playerDiscardPile = playerDeck.getPlayerDiscardPile();  
        infectPile = infectDeck.getInfectPile();
        infectDiscardPile = infectDeck.getInfectDiscardPile();
        infectDiscardPileBeforeEpidemic = infectDeck.getInfectDiscardPileBeforeEpidemic();
        
        //list of all the cities keep it intact
        cities     = CitiesMap.getInfectPile(); 
        //construct the neighbors for every city
        setupNeighbors();
        Collections.shuffle(cities);
        //setup the ResearchCentres
        placeInitialResearchCentres();
        playerPieces = new Piece[4];
        //outbreakCount = 0;
        neededForCure = 4; 
        
        
    }
    
    //set-up neighbors cities for every city
    public void setupNeighbors() {
    	for(int i=0;i<cities.size();i++) {
    		cities.get(i).setNeighbors(true);
    	}  	    	
    }
    
    
    
    
    public int getNumberColours(){ return 4; }
    
    public int getNeededForCure() { return neededForCure;}
    
    // returns all the cities with 3 cubes
    @SuppressWarnings("unchecked")
	public ArrayList<City> get3CubeCities()
    {
    	//ArrayList<City> toReturn = new ArrayList<City>();
		ArrayList<City> toReturn = ((ArrayList<City>) cities.clone());
        for (int i = 0 ; i < cities.size() ; i ++)
        {
            if (cities.get(i).getMaxCube() !=3)
            {
                toReturn.remove(cities.get(i));                 
            }
            else{
            	//System.out.println("The:"+cities.get(i).getName() + " has 3 cubes");  
            }    	       
        }
        return toReturn;
    }

    // returns all the cities with 2 cubes
    @SuppressWarnings("unchecked")
	public ArrayList<City> get2CubeCities()
    {
    	//ArrayList<City> toReturn = new ArrayList<City>();
		ArrayList<City> toReturn = (ArrayList<City>) cities.clone();
    	for (int i = 0 ; i < cities.size() ; i ++)
        {

            if (cities.get(i).getMaxCube() !=2)
            {
                toReturn.remove(cities.get(i));                 
            }
            else{
            	//System.out.println("The:"+cities.get(i).getName() + " has 2 cubes");  
            }    	 
        }       
        return toReturn;
    }
    
    // returns all the cities with 1 cubes
    @SuppressWarnings("unchecked")
	public ArrayList<City> get1CubeCities()
    {
    	//ArrayList<City> toReturn = new ArrayList<City>();
		ArrayList<City> toReturn = (ArrayList<City>) cities.clone();
        for (int i = 0 ; i < cities.size() ; i ++)
        {

            if (cities.get(i).getMaxCube() !=1)
            {
                toReturn.remove(cities.get(i));                 
            }
            else{
            	//System.out.println("The:"+cities.get(i).getName() + " has 1 cubes");  
            }    	 
        }       
        return toReturn;
    }
	
    public ArrayList<City> getResearchLocations()
    {
    	ArrayList<City> toReturn = new ArrayList<City>();
        for (int i = 0 ; i < Variables.CITY_WITH_RESEARCH_STATION.size(); i++)
        {	        	
        	//get location of the city with Research_station
            toReturn.add(Variables.CITY_WITH_RESEARCH_STATION.get(i));
        } 
        return toReturn;
    }
    
    //returns an integer equal to the number of cities with X cubes in
    public int countXCubeCities(ArrayList<City> cityArray, int numberCubes)
    {
        int toReturn = 0;
        for (int i = 0; i < cities.size(); i++)
        {
            //System.out.println("looking for cities with" + numberCubes + "cubes");
            if (cities.get(i).getMaxCube() == numberCubes)
            {
                //System.out.println("found a city with" + numberCubes+ "cubes!");
                toReturn++;
            }            
        }
        return toReturn;
    }
	
    public int getInfectionRate(){return Variables.INFECTION_RATE; }
    
    public int getOutbreakCount(){return Variables.OUTBREAK_MARKER; }
    
    // Increments the outbreak counter
    public void incrementOutbreak(){ Variables.OUTBREAK_MARKER++;}
    
    //add a card to PlayerDiscardPile
    public void addPlayerCardDiscard(City toAdd){  playerDiscardPile.add(toAdd);}
    
    /*set the initial Infected cities
    *you may initialize this methods 
    *with any methods you created
    *this methods called from @SimulatePandemic class
    **/
    public void startGame() {  initialInfect(); }   
   
    
    // Sets up the initial outbreaks of disease for a given number of each city.
    //the 9 cities that will initially start with fix amount of infection
    public void initialInfect()
    {
        Collections.shuffle(infectPile);
        int x;
        for (int i = 0 ; i< Variables.NUM_INITIALLY_INFECTED; i++)
        {
        	if(i<3) {
        		// Draws a card to put 3 cubes placed on it
        		City toInfect=infectPile.get(0);
        		System.out.println("Placing " + 3 + " cube on " + toInfect.getName());      
        		for (x=0;x<cities.size();x++) { 
        			if (cities.get(x).getName().equals(toInfect.getName())) {
        				break;
        			}
        		}
        		//System.out.println("City infect City is: "+ cities.get(x));
        		//System.out.println("with colour: " +toInfect.getColour());
        		
        		//infect with 3 cubes
        		cities.get(x).addCube(toInfect.getColour());
        		cities.get(x).addCube(toInfect.getColour());
        		cities.get(x).addCube(toInfect.getColour());   
        		//System.out.println("maxCube:"+cities.get(x).getMaxCube());
        		
        		infectDiscardPile.add(toInfect);//discard the city to @infectDiscardPile
        		infectPile.remove(0);
        		//descrease the available cubes of this colour
        		removeCube(toInfect.getColour());
        		removeCube(toInfect.getColour());
        		removeCube(toInfect.getColour());
        		
        	}	
        	else if(i>=3 && i<6){
        		// Draws a card to have 2 cubes placed on it
          	  	City toInfect=infectPile.get(0);
                System.out.println("Placing " + 2 + " cube on " + toInfect.getName());
        		for (x=0;x<cities.size();x++) {    				
        			if (cities.get(x).getName().equals(toInfect.getName())) {
        				break;
        			}
        		}
        		//infect with 2 cubes
                cities.get(x).addCube(toInfect.getColour());
        		cities.get(x).addCube(toInfect.getColour());   
        		//System.out.println("maxCube:"+cities.get(x).getMaxCube());
        		
        		infectDiscardPile.add(toInfect);//discard the city to @infectDiscardPile
        		infectPile.remove(0);
        		
        		//descrease the available cubes of this colour
        		removeCube(toInfect.getColour());
        		removeCube(toInfect.getColour());
        	}
        	else {
        		// Draws a card to have 1 cubes placed on it
          	    City toInfect=infectPile.get(0);
                System.out.println("Placing " + 1 + " cube on " + toInfect.getName());
        		for (x=0;x<cities.size();x++) {    				
        			if (cities.get(x).getName().equals(toInfect.getName())) {
        				break;
        			}
        		}
        		//infect with 1 cubes
                cities.get(x).addCube(toInfect.getColour());
                //System.out.println("maxCube:"+cities.get(x).getMaxCube());
          	    
                infectDiscardPile.add(toInfect);//discard the city to @infectDiscardPile
          	    infectPile.remove(0);
          	    
          	    //descrease the available cubes of this colour
          	    removeCube(toInfect.getColour());
        	}
        }        
    }   
    
    
    // This method will infect a given number of cities based on the given infection rate.
	public void infectCityPhase(int infectionRate)
    {
        int i,z;        
        z=0;
        for (z=0;z<playerPieces.length;z++)//for finding pieces of QUARANTINE_SPECIALIST
        {
        	if (playerPieces[z].owner.getPlayerRole().equals("QUARANTINE_SPECIALIST")) 
        		break;        	
        }
        i = 0;
        while (i< infectionRate) {
            i = i + 1;
            City cityToInfect = infectPile.get(0);  
            checkCities = (ArrayList<City>) playerPieces[z].getLocationConnections().clone();           
            //check all connected city for QUARANTINE_SPECIALIST
            if (checkCities.contains(cityToInfect)) {
            	infectDiscardPile.add(cityToInfect);
   	     	 	infectPile.remove(0);             	
            }
            else
            {
            	System.out.println("INFECTING " + cityToInfect.getName() + " with 1 " + cityToInfect.getColour() + " cubes.");
            	infectCity(cityToInfect);  
            }
        }
        checkCities.clear();        
    }
    
    //Infects a given city with a cube of the given colour
    public void infectCity(City infectCity)
    {    	
    	if (checkCubesRemain(infectCity.getColour())) {	    	 
    		 int x;// Finds the position of the city to be infected in the cities array.
    		 for (x=0;x<cities.size();x++) {    				
    			 if (cities.get(x).getName().equals(infectCity.getName())) {
    				//System.out.println("I have found " + infectCity.getName() + " and it is at position " + x + " within the cities array");
     				break;
     			}
    		 }
	         if (cities.get(x).addCube(infectCity.getColour()))
	         {
	             System.out.println("OUTBREAK");
	             addCube(infectCity.getColour());
	             incrementOutbreak();
	             //infected the neighbors cities
	             int k;
	             for (k=0;k<playerPieces.length;k++)//for finding pieces of QUARANTINE_SPECIALIST
	             {
	             	if (playerPieces[k].owner.getPlayerRole().equals("QUARANTINE_SPECIALIST")) 
	             		break;	             	
	             }
	             checkCities = (ArrayList<City>) playerPieces[k].getLocationConnections().clone();
	             int e;
	             for ( e=0;e<infectCity.getNeighbors().size();e++)
		         {
	            	 int q;
	            	 for ( q=0;q<cities.size();q++) {	            		 
	        			 if (cities.get(q).getName().equals(infectCity.getNeighbors().get(e).getName()) && (!checkCities.contains(infectCity.getNeighbors().get(e)))) {
	        				//System.out.println("I have found " + infectCity.getName() + " and it is at position " + x + " within the cities array");
	        				 if (cities.get(q).addCube(infectCity.getColour())) {
	        					 System.out.println("OUTBREAK");
	        					 addCube(infectCity.getColour());
	        					 incrementOutbreak();
	        				 }
	        				 removeCube(infectCity.getColour());
	        				 break;
	         			}
	        		 }
		         }
	         }
	         
	         //removes a cube of the appropriate colour from the game boards pool.
	         removeCube(infectCity.getColour());
	         // System.out.println("Just removed a " + infectCity.getColour() + " from the pool");
	         infectDiscardPile.add(infectCity);
	     	 infectPile.remove(infectCity);  
    	}
    	else {    		NoMoreCubes();	}    	  	
    }
        
    public void resetDistances()
    {
        for (int i = 0 ; i < cities.size() ; i ++)
        {
            cities.get(i).setDistance(9999);
        }
    }
	
    // takes a cube away from the pool of cubes.
    public void removeCube(String Cubecolour)
    {
        if (Cubecolour.equals("Red"))
        {
            redCubes = redCubes - 1;
        }
        else if (Cubecolour.equals("Blue"))
        {
            blueCubes = blueCubes - 1;
        }
        else if (Cubecolour.equals("Yellow"))
        {
            yellowCubes = yellowCubes - 1;
        }
        else if (Cubecolour.equals("Black"))
        {
            blackCubes = blackCubes - 1;
        }        
    }
    
   // add a cube to the pool of cubes.
    public void addCube(String Cubecolour)
    {
        if (Cubecolour.equals("Red"))
        {
            redCubes = redCubes + 1;
        }
        else if (Cubecolour.equals("Blue"))
        {
            blueCubes = blueCubes + 1;
        }
        else if (Cubecolour.equals("Yellow"))
        {
            yellowCubes = yellowCubes + 1;
        }
        else if (Cubecolour.equals("Black"))
        {
            blackCubes = blackCubes + 1;
        }        
    }

    // checks the game isn't lost because disease cubes have run out 
    public boolean checkCubesRemain(String colour)
    {
    	boolean toReturn = false;
    	if (colour=="Blue" && blueCubes>0) {return toReturn=true;}
    	else if (colour=="Yellow" && yellowCubes>0) {return toReturn=true;}
    	else if (colour=="Black" && blackCubes>0) {return toReturn=true;}
    	else if (colour=="Red" && redCubes>0) {return toReturn=true;}
		return toReturn;
    }
    
    //check if the playerDeck is empty
    public boolean emptyDeck ()
    {
        int cardsLeft;
        cardsLeft = playerPile.size();
        if (cardsLeft == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    //check if cube pool is empty
    public void NoMoreCubes() {
    	System.out.println("Just a bunch of losers");
		System.out.println("You lost the game ");
		System.out.println("No more cubes to put on board");
		SimulatePandemic.gameLost = true;
		SimulatePandemic.gameOver = true; 
		SimulatePandemic.looserPrint();    
    	
    }
    	
    // moves the infection rate marker by 1.
    public void increaseEpidemic()
    {
    	switch(currentRate) {
	    	case 1:
	    		currentRate=2;
	    		break;
	    	case 2:
	    		currentRate=3;
	    		break;
	    	case 3:
	    		Variables.INFECTION_RATE++;
	    		currentRate=4;
	    		System.out.println("Increasing the rate of infection");
	    		break;
	    	case 4:
	    		currentRate=5;
	    		break;
	    	case 5:
	    		Variables.INFECTION_RATE++;
	    		currentRate=6;
	    		System.out.println("Increasing the rate of infection");
	    		break;
	    	case 6:
	    		currentRate=7;
	    		break;
	    	}        
    }
    
    //draws the bottom card of the infection deck, and places 3 cubes on it.
    public void infectEpidemic()
    {
        City toInfect;
        toInfect = infectPile.get(infectPile.size()-1);
        System.out.println(toInfect.getName() + " has now been infected with 3 cubes.");
        int x;
        for (x=0;x<cities.size();x++) {    				
			if (cities.get(x).getName().equals(toInfect.getName())) {
				break;
			}
		}      
		//infect with 3 cubes
        int i;
        for (i=0;i<3;i++) {
        	if ((cities.get(x).addCube(toInfect.getColour()))){
        		System.out.println("OUTBREAK");
        		addCube(toInfect.getColour());
        		incrementOutbreak();
        		//infected the neighbors cities
        		int k;
	            for (k=0;k<playerPieces.length;k++)//for finding pieces of QUARANTINE_SPECIALIST
	            {
	            	if (playerPieces[k].owner.getPlayerRole().equals("QUARANTINE_SPECIALIST")) 
	            		break;	             	
	            }
	            checkCities = (ArrayList<City>) playerPieces[k].getLocationConnections().clone();
        		int e;
  	            for (e=0;e<toInfect.getNeighbors().size();e++)
		         {
	            	 for (int z=0;z<cities.size();z++) {	            		 
	        			 if (cities.get(z).getName().equals(toInfect.getNeighbors().get(e).getName()) && (!checkCities.contains(toInfect.getNeighbors().get(e)))) {
	        				//System.out.println("I have found " + infectCity.getName() + " and it is at position " + x + " within the cities array");
	        				 if (cities.get(z).addCube(toInfect.getColour())) {
	        					 System.out.println("OUTBREAK");
	        					 addCube(toInfect.getColour());
	        					 incrementOutbreak();
	        				 }
	        				 removeCube(toInfect.getColour());
	        				 break;
	         			}
	        		 }
		         }
  	            break;
        	}
        	//descrease the available cubes of this colour
        	removeCube(toInfect.getColour());
        	
        }
  	    
  	    infectDiscardPile.add(toInfect);
  	    infectPile.remove(toInfect);
  	    
  	    //keep DiscardPile record after a epidemic occur
  	    infectDiscardPileBeforeEpidemic.clear();
  	    infectDiscardPileBeforeEpidemic.addAll(0,infectDiscardPile);
    }
    
    // shuffles the infection discard pile 
    // and put on top of the infection pile
    public void intensifyEpidemic()
    {
        Collections.shuffle(infectDiscardPile);
        infectPile.addAll(0, infectDiscardPile);
        infectDiscardPile.clear();//empty
    }
    
    public void resolveEpidemic()
    {
        // moves the infection rate marker by 1, and updates the rate.
        increaseEpidemic();
        // draws the bottom card of the infection deck, and places 3 cubes on it
        infectEpidemic();        
        // shuffles the infection discard pile onto the top of the infection deck
        intensifyEpidemic();        
    }
    
    /**
     * Constructor for objects of class GameBoard
     */
    public void setDiseases()
    {
       	diseases.add(new Disease("Red"));
       	diseases.add(new Disease("Black"));
       	diseases.add(new Disease("Yellow"));
       	diseases.add(new Disease("Blue"));
    }
    
    public ArrayList<Disease> getDiseases() {
		return diseases;
	}
    
    public boolean cureDisease(String colour)
    {
        Disease toCure = getDisease(colour);
        if (!toCure.getCured())
        {
            toCure.setCured(true);
            System.out.println(toCure.getColour() + " Disease Cured." );
            return true;
        }
        System.out.println("already cured!");
        return false;

    }
    
    public Disease getDisease(String colour)
    {
        for (int i = 0; i < diseases.size() ; i ++)
        {
            if (diseases.get(i).getColour().equals(colour))
            {
                return diseases.get(i);
            }
        }
        return null;
    }
    
   
    
    public void placeInitialResearchCentres()
    {
        System.out.println("Setting initial station in Atlanta");
        for (int i = 0 ; i < cities.size() ; i ++)
        {
        	if (cities.get(i).getName().equals(Variables.atlanta.getName())) {
        		Variables.CITY_WITH_RESEARCH_STATION.add(cities.get(i));
        		System.out.println("setting a new station in " + cities.get(i).getName());
        	}            
        }
        
    }
    
    public boolean checkResearchStation(City toCheck)
    {
    	return Variables.CITY_WITH_RESEARCH_STATION.contains(toCheck);
    	//if (Variables.CITY_WITH_RESEARCH_STATION.contains(toCheck)) {return true;}
    	//else {return false;}
    }
	      
    
    
	public void setPlayerPieces(Piece[] playerPieces) {		this.playerPieces = playerPieces;
	}
	public void setPlayerDeck(PlayerDeck playerDeck) {		this.playerDeck = playerDeck;
	}
	public void setInfectDeck(InfectDeck infectDeck) {		this.infectDeck = infectDeck;
	}
	public void setCitiesMap(InfectDeck citiesMap) {		CitiesMap = citiesMap;
	}
	public void setPlayerPile(ArrayList<Object> playerPile) {		this.playerPile = playerPile;
	}
	public void setPlayerDiscardPile(ArrayList<Object> playerDiscardPile) {		this.playerDiscardPile = playerDiscardPile;
	}
	public void setInfectPile(ArrayList<City> infectPile) {		this.infectPile = infectPile;
	}
	public void setInfectDiscardPile(ArrayList<City> infectDiscardPile) {		this.infectDiscardPile = infectDiscardPile;
	}
	public void setInfectDiscardPileBeforeEpidemic(ArrayList<City> infectDiscardPileBeforeEpidemic) {
		this.infectDiscardPileBeforeEpidemic = infectDiscardPileBeforeEpidemic;
	}
	public void setCheckCities(ArrayList<City> checkCities) {		this.checkCities = checkCities;
	}
	public void setResearchCentres(ArrayList<City> researchCentres) {	this.researchCentres = Variables.CITY_WITH_RESEARCH_STATION;
	}
	public void setDiseases(ArrayList<Disease> diseases) {		this.diseases = diseases;
	}
	public Piece[] getPlayerPieces() {		return playerPieces;
	}
	public PlayerDeck getPlayerDeck() {		return playerDeck;
	}
	public InfectDeck getInfectDeck() {		return infectDeck;
	}
	public InfectDeck getCitiesMap() {		return CitiesMap;
	}
	public ArrayList<Object> getPlayerPile() {		return playerPile;
	}
	public ArrayList<Object> getPlayerDiscardPile() {		return playerDiscardPile;
	}
	public ArrayList<City> getInfectPile() {		return infectPile;
	}
	public ArrayList<City> getInfectDiscardPile() {		return infectDiscardPile;
	}
	public ArrayList<City> getInfectDiscardPileBeforeEpidemic() {		return infectDiscardPileBeforeEpidemic;
	}
	public ArrayList<City> getCheckCities() {		return checkCities;
	}    
	public ArrayList<City> getResearchCentres() { 		return Variables.GET_CITIES_WITH_RESEARCH_STATION();
	}
	    
	 
	protected Object clone() throws CloneNotSupportedException {
    	GameBoard cloned = (GameBoard) super.clone();
    	Piece[] pieces = (Piece[]) this.getPlayerPieces();
    	Piece[] clonedpieces = new Piece[pieces.length];
    	
    	for (int i=0;i<pieces.length;i++){
    		clonedpieces[i] = (Piece) pieces[i].clone(cloned);
    	}
    	cloned.playerPieces    = clonedpieces;
    	
    	
    	cloned.playerDeck      = (PlayerDeck) this.getPlayerDeck();		//shallow copy, does not change
    	cloned.infectDeck      = (InfectDeck)  this.getInfectDeck();	//shallow copy, -//-
    	cloned.CitiesMap       = (InfectDeck)    this.getCitiesMap();	//shallow copy, -//-
    	
    	
    	ArrayList<Object> playerpile = this.getPlayerPile();
    	ArrayList<Object> clonedplayerpile = new ArrayList<Object>();
    	
    	for (int i=0;i<playerpile.size();i++) {
    		if (playerpile.get(i) instanceof City) {
    			clonedplayerpile.add( ((City) playerpile.get(i)).clone());
    		}
    		else if(playerpile.get(i) instanceof Boolean) {
    			clonedplayerpile.add( ((boolean) playerpile.get(i)));
    		}
    		else {
    			throw new CloneNotSupportedException("Player pile contains objects that are neither City nor boolean!");
    		}
    		
    	}
    	
    	cloned.playerPile = clonedplayerpile;
    	
    	//cloned.playerDiscardPile = (ArrayList<Object>)  this.getPlayerDiscardPile().clone();
    	ArrayList<Object> playerdispile = this.getPlayerDiscardPile();
    	ArrayList<Object> clonedplayerdispile = new ArrayList<Object>();
    	
    	for (int i=0;i<playerdispile.size();i++) {
    		if (playerdispile.get(i) instanceof City) {
    			clonedplayerdispile.add( ((City) playerdispile.get(i)).clone());
    		}
    		else if(playerpile.get(i) instanceof Boolean) {
    			clonedplayerdispile.add( ((boolean) playerdispile.get(i)));
    		}
    		else {
    			throw new CloneNotSupportedException("Player discard pile contains objects that are neither City nor boolean!");
    		}
    		
    	}
    	cloned.playerDiscardPile = clonedplayerdispile; 	
    	
    	//cloned.infectPile      = (ArrayList<City>)  this.getInfectPile().clone();
    	ArrayList<City> infectedpile = this.getInfectPile();
    	ArrayList<City> clonedinfectedpile = new ArrayList<City>();
    	
    	for (int i=0;i<infectedpile.size();i++) {    		
    		clonedinfectedpile.add( (City) infectedpile.get(i).clone());
    	}
    	cloned.infectPile = clonedinfectedpile;
    	
    	//cloned.infectDiscardPile = (ArrayList<City>)  this.getInfectDiscardPile().clone();
    	ArrayList<City> infecteddispile = this.getInfectDiscardPile();
    	ArrayList<City> clonedinfecteddispile = new ArrayList<City>();
    	
    	for (int i=0;i<infecteddispile.size();i++) {    		
    		clonedinfecteddispile.add( (City) infecteddispile.get(i).clone());
    	}
    	cloned.infectDiscardPile = clonedinfecteddispile;    	
    	
    	//cloned.infectDiscardPileBeforeEpidemic = (ArrayList<City>)  this.getInfectDiscardPileBeforeEpidemic().clone();
    	ArrayList<City> infecteddisbeforepile = this.getInfectDiscardPile();
    	ArrayList<City> clonedinfecteddisbeforepile = new ArrayList<City>();
    	
    	for (int i=0;i<infecteddisbeforepile.size();i++) {    		
    		clonedinfecteddisbeforepile.add( (City) infecteddisbeforepile.get(i).clone());
    	}
    	cloned.infectDiscardPileBeforeEpidemic = clonedinfecteddisbeforepile;    	
    	
    	cloned.checkCities     = (ArrayList<City>)  this.checkCities;	//shallow copy
    	
    	//cloned.researchCentres = (ArrayList<City>) this.getResearchCentres().clone();
    	ArrayList<City> researchCentres = this.getResearchCentres();
    	ArrayList<City> clonedresearchCentres = new ArrayList<City>();
    	
    	for (int i=0;i<researchCentres.size();i++) {    		
    		clonedresearchCentres.add( (City) researchCentres.get(i).clone());
    	}
    	cloned.researchCentres = clonedresearchCentres;   //REMINDER, City shallow clones for neighbors, deep clones for self
    	
    	//cloned.diseases        = (ArrayList<Disease>)  this.getDiseases().clone();
    	ArrayList<Disease> diseases = this.getDiseases();
    	ArrayList<Disease> cloneddiseases = new ArrayList<Disease>();
    	
    	for (int i=0;i<diseases.size();i++) {    		
    		cloneddiseases.add( (Disease) diseases.get(i).clone());
    	}
    	cloned.diseases = cloneddiseases;   //REMINDER, City shallow clones for neighbors, deep clones for self
    	    	  	
    	return cloned;
    }
	
	
	
}
