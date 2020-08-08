package service;

import java.util.*;
import model.TouristPlace;

public class MapOperations{
		public Map<String,TouristPlace> add(TouristPlace places) {	
		Map<String, TouristPlace> add=new HashMap<>();
		add.put( null, places);
		return add;
	}
	
	public Map<String,TouristPlace> sortRandomly(Map<String,TouristPlace> places) {
		Map<String,TouristPlace> rm=new HashMap<>();
		rm.put( null, (TouristPlace) places);
		return rm;
	}
	
	public Map<String, TouristPlace> sortInEntryOrder(TouristPlace places) {
		Map<String,TouristPlace> se=new LinkedHashMap<>();
		se.put( null, places);
		return se;
	}
	
	public Map<String, TouristPlace> sortAlphabetically(TouristPlace places) {
		Map<String,TouristPlace> sa=new TreeMap<>();
		sa.put( null, places);
		return sa;
	}
	
	public Object reset(HashMap<String,TouristPlace> places) {
		Map<String,TouristPlace> reset=new HashMap<>();
		reset.clear();
		return reset;
		
	}
	
	public Map<String, TouristPlace> remove(TouristPlace places){
		Map<String,TouristPlace> removePlace=new HashMap<>();
		removePlace.remove( null, places);
		return removePlace;
	}
}

