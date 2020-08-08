package service;
import java.util.*;
import model.TouristPlace;

public class SetOperations{
	
	public HashSet<TouristPlace> add(TouristPlace places) {
		HashSet<TouristPlace> add=new HashSet<>();
		return add;
	}
	
	public HashSet<TouristPlace> remove(TouristPlace places) {
		HashSet<TouristPlace> remove=new HashSet<>();
		return remove;
	}
	
	public Object sortByDestination(Set<TouristPlace> set) {
		TreeSet<TouristPlace> sd=new TreeSet<>((d1,d2)->d1.getDestination().compareTo(d2.getDestination()));
		return sd;
	}
	
	public Object sortByRank(Set<TouristPlace> places) {
		
		TreeSet<TouristPlace> sr=new TreeSet<>((d1,d2)->d1.getRank().compareTo(d2.getRank()));
		return sr;
	}
	
	public Object reset(Set<TouristPlace> places) {
		HashSet<TouristPlace> cl=new HashSet<>();
		cl.clear();
		return cl;
		
	}
}