package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.TouristPlace;

public class ListOperations {
	static List<TouristPlace> bucketList = new ArrayList<TouristPlace>();
	
	public List<TouristPlace> add(TouristPlace places) {
		System.out.println("Add list method");
		bucketList.add(places);
		System.out.println(bucketList);
		return bucketList; 
	}

	public List<TouristPlace> remove(TouristPlace places) {
		bucketList.remove(places);
		System.out.println(bucketList);
		return bucketList; 
	}

//	public Object ascending(List<TouristPlace> places) {
//		Collections.sort(places);		
//		return bucketList; 
//	}
//
//	public Object descending(List<TouristPlace> places) {
//		Collections.sort(places);
//		Collections.reverse(places);
//		return bucketList; 
//	}

	public Object clear(List<TouristPlace> places) {
		bucketList.clear();
		return bucketList; 
	}

}