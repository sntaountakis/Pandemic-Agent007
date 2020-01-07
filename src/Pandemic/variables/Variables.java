package Pandemic.variables;


import Pandemic.actions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import Pandemic.cities.*;


/**
 * A class define the variables of the game.
 */
public class Variables {
	/* FINAL VARIABLES REPRESENTING THE GAME */
	public static final int MAX_TURNS = 52;     //Player cards
	public static int INFECTION_RATE  = 2;      //Infection Rate
	public static int OUTBREAK_MARKER = 0;		//Outbreak_marker 
	public static int neededForCure   = 4;		//number of cards needed to discover a cure
	public static final int NUM_CITIES = 48;	//Infection cards
	public static final int MAX_INFECTION_OF_CITY = 3;  //if already 3 spread a infection
	public static final int NUM_INITIALLY_INFECTED = 9; //random initial infected cities
	public static final int NUM_ACTIONS_PER_TURN = 7;   //possible different actions per turn
	public static final int MAX_NUMBER_OF_OUTBREAK =8;  //max number of outbreaks
	public static final int RESEARCH_STATIONS = 6;     //Max number of research stations
	//96 Diseases cubes
	public static final int RED_CUBES = 24;     //Red disease Cubes
	public static final int YELLOW_CUBES = 24;  //Yellow disease Cubes
	public static final int BLUE_CUBES = 24;    //Blue disease Cubes
	public static final int BLACK_CUBES = 24;   //Black disease Cubes
	

	// 48 cities 
	// used as a lookup table for each Red Cities
	public static final ArrayList<CityList> CITY_RED_LIST =
			new ArrayList<CityList>(Arrays.asList(
				CityList.BANGKOK,
				CityList.BEIJING,
				CityList.HO_CHI_MINH_CITY,
				CityList.HONG_KONG,
				CityList.JAKARTA,
				CityList.MANILA,
				CityList.OSAKA,
				CityList.SEOUL,
				CityList.SHANGHAI,
				CityList.SYDNEY,
				CityList.TAIPEI,
				CityList.TOKYO));
	
	//used for each Black cities
	public static final ArrayList<CityList> CITY_BLACK_LIST =
			new ArrayList<CityList>(Arrays.asList(
				CityList.ALGIERS, 
				CityList.BAGHDAD,
				CityList.CAIRO,
				CityList.CHENNAI,
				CityList.DELHI,
				CityList.ISTANBUL,
				CityList.KARACHI,
				CityList.KOLKATA,
				CityList.MOSCOW,
				CityList.MUMBAI,
				CityList.RIYADH,
				CityList.TEHRAN));
	
	//used for each Yellow cities
	public static final ArrayList<CityList> CITY_YELLOW_LIST =
			new ArrayList<CityList>(Arrays.asList(
				CityList.BOGOTA, 
				CityList.BUENOS_AIRES,
				CityList.JOHANNESBURG,
				CityList.KHARTOUM,
				CityList.KINSHASA,
				CityList.LAGOS,
				CityList.LIMA,
				CityList.LOS_ANGELES,
				CityList.MEXICO_CITY,
				CityList.MIAMI,
				CityList.SANTIAGO,
				CityList.SAO_PAULO));
	
	//used for each Blue cities
	public static final ArrayList<CityList> CITY_BLUE_LIST =
			new ArrayList<CityList>(Arrays.asList(
				CityList.ATLANTA,
				CityList.CHICAGO,
				CityList.ESSEN,
				CityList.LONDON,
				CityList.MADRID,
				CityList.MILAN,
				CityList.MONTREAL,
				CityList.NEW_YORK,
				CityList.PARIS,
				CityList.SAN_FRANSISCO,
				CityList.ST_PETERSBURG,
				CityList.WASHINGTON));

	public static final ArrayList<CityList> CITY_ALPHA_ORDER_LIST =
			new ArrayList<CityList>(Arrays.asList(CityList.ALGIERS,
					CityList.ATLANTA, CityList.BAGHDAD, CityList.BANGKOK,
					CityList.BEIJING, CityList.BOGOTA, CityList.BUENOS_AIRES,
					CityList.CAIRO, CityList.CHENNAI, CityList.CHICAGO,
					CityList.DELHI, CityList.ESSEN, CityList.HO_CHI_MINH_CITY,
					CityList.HONG_KONG, CityList.ISTANBUL, CityList.JAKARTA,
					CityList.JOHANNESBURG, CityList.KARACHI, CityList.KHARTOUM,
					CityList.KINSHASA, CityList.KOLKATA, CityList.LAGOS,
					CityList.LIMA, CityList.LONDON, CityList.LOS_ANGELES,
					CityList.MADRID, CityList.MANILA, CityList.MEXICO_CITY,
					CityList.MIAMI, CityList.MILAN, CityList.MONTREAL,
					CityList.MOSCOW, CityList.MUMBAI, CityList.NEW_YORK,
					CityList.OSAKA, CityList.PARIS, CityList.RIYADH,
					CityList.SAN_FRANSISCO, CityList.SANTIAGO,
					CityList.SAO_PAULO, CityList.SEOUL, CityList.SHANGHAI,
					CityList.ST_PETERSBURG, CityList.SYDNEY, CityList.TAIPEI,
					CityList.TEHRAN, CityList.TOKYO, CityList.WASHINGTON));
	
	

	public static  ArrayList<City> CITY_WITH_RESEARCH_STATION = new ArrayList<City>();
		
	//return a list with research station
	public static ArrayList<City> GET_CITIES_WITH_RESEARCH_STATION(){return CITY_WITH_RESEARCH_STATION;}
	
	//function which implement the addition of research station if is a legal move
	public static boolean ADD_CITY_WITH_RESEARCH_STATION(City city){
		if(!CITY_WITH_RESEARCH_STATION.contains(city) && (CITY_WITH_RESEARCH_STATION.size()<RESEARCH_STATIONS)) {
			CITY_WITH_RESEARCH_STATION.add(city);
			return true;
        }
		return false;
			
		
	}
	
	//static 48 cities for any valid uses
	public static SanFransisco sanfransisco 	= new SanFransisco(0,0,0,0,0);
	public static Chicago chicago 				= new Chicago(0,0,0,0,0);
	public static Atlanta atlanta 				= new Atlanta(0,0,0,0,0);
	public static Montreal montreal 			= new Montreal(0,0,0,0,0);
	public static NewYork newyork 				= new NewYork(0,0,0,0,0);
	public static Washington washington 		= new Washington(0,0,0,0,0);
	public static Madrid madrid 				= new Madrid(0,0,0,0,0);
	public static London london 				= new London(0,0,0,0,0);
	public static Paris paris 					= new Paris(0,0,0,0,0);
	public static Essen essen 					= new Essen(0,0,0,0,0);
	public static Milan milan 					= new Milan(0,0,0,0,0);
	public static StPetersburg stpeterburg 		= new StPetersburg(0,0,0,0,0);
	public static LosAngeles losangeles 		= new LosAngeles(0,0,0,0,0);
	public static MexicoCity mexicocity 		= new MexicoCity(0,0,0,0,0);
	public static Miami miami 			 		= new Miami(0,0,0,0,0);
	public static Bogota bogota 				= new Bogota(0,0,0,0,0);
	public static Lima lima 		 			= new Lima(0,0,0,0,0);
	public static Santiago santiago 			= new Santiago(0,0,0,0,0);
	public static BuenosAires buenosaires		= new BuenosAires(0,0,0,0,0);
	public static SaoPaulo saopaulo 			= new SaoPaulo(0,0,0,0,0);
	public static Lagos lagos 					= new Lagos(0,0,0,0,0);
	public static Kinshasa kinshasa 			= new Kinshasa(0,0,0,0,0);
	public static Johannesburg johannesburg 	= new Johannesburg(0,0,0,0,0);
	public static Khartoum khartoum 			= new Khartoum(0,0,0,0,0);
	public static Algiers algiers 				= new Algiers(0,0,0,0,0);
	public static Istanbul istanbul 			= new Istanbul(0,0,0,0,0);
	public static Cairo cairo 					= new Cairo(0,0,0,0,0);
	public static Moscow moscow 				= new Moscow(0,0,0,0,0);
	public static Baghdad baghdad 				= new Baghdad(0,0,0,0,0);
	public static Tehran tehran 				= new Tehran(0,0,0,0,0);
	public static Riyadh riyadh 				= new Riyadh(0,0,0,0,0);
	public static Karachi karachi 				= new Karachi(0,0,0,0,0);
	public static Mumbai mumbai 				= new Mumbai(0,0,0,0,0);
	public static Delhi delhi 					= new Delhi(0,0,0,0,0);
	public static Chennai chennai 				= new Chennai(0,0,0,0,0);
	public static Kolkata kolkata 				= new Kolkata(0,0,0,0,0);
	public static Bangkok bangkok 				= new Bangkok(0,0,0,0,0);
	public static Jakarta jakarta 				= new Jakarta(0,0,0,0,0);
	public static HoChiMinhCity hochiminhcity 	= new HoChiMinhCity(0,0,0,0,0);
	public static HongKong hongkong 			= new HongKong(0,0,0,0,0);
	public static Shanghai shanghai 			= new Shanghai(0,0,0,0,0);
	public static Beijing beijing 				= new Beijing(0,0,0,0,0);
	public static Seoul seoul 					= new Seoul(0,0,0,0,0);
	public static Tokyo tokyo 					= new Tokyo(0,0,0,0,0);
	public static Osaka osaka 					= new Osaka(0,0,0,0,0);
	public static Taipei taipei 				= new Taipei(0,0,0,0,0);
	public static Manila manila 				= new Manila(0,0,0,0,0);
	public static Sydney sydney 				= new Sydney(0,0,0,0,0);
	public static boolean isEpidemic 			= true;
	//events cards
	
	
	public static  List<City> CITY_LIST = new ArrayList<City>(Arrays.asList(sydney,manila,osaka,
					tokyo,seoul,beijing,shanghai,hongkong,hochiminhcity,jakarta,bangkok,
					kolkata,chennai,delhi,mumbai,karachi,riyadh,tehran,baghdad,moscow,cairo,istanbul,
					algiers,khartoum,johannesburg,kinshasa,lagos,saopaulo,buenosaires,santiago,lima,
					bogota,miami,mexicocity,losangeles,stpeterburg,milan,essen,paris,london,madrid,
					washington,newyork,montreal,atlanta,chicago,sanfransisco));
	


	public static ArrayList<Action>[] Suggestions = new ArrayList[4];
	
}
