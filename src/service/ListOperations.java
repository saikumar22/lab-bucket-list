package service;
import java.util.*;
import java.util.ArrayList;
import model.TouristPlace;

public class ListOperations{
	ArrayList<TouristPlace> myList=new ArrayList<>();
	
	public List<TouristPlace> add(TouristPlace places) {
		myList.add(places);	
		return myList;
	}
	public List<TouristPlace> remove(TouristPlace places) {
		myList.remove(places);
		return null;
	}
	public Object sortByDestination(List<TouristPlace> places) {
		myList.sort((d1,d2) -> d1.getDestination().compareTo(d2.getDestination()));
		return myList;
	}
	public Object sortByRank(List<TouristPlace> places) {
		myList.sort((tp1,tp2) -> tp1.getRank().compareTo(tp2.getRank()));
		return myList;
	}
	
	public Object reset(List<TouristPlace> places) {
		myList.clear();
		return myList;
	}
}