package model;
public class TouristPlace{
	public String name;
	public String destination;
	public String rank;
	
	public TouristPlace(String name,String destination,String rank) {
		this.name = name;
		this.destination = destination;
		this.rank = rank;
	}
	
	public String getName() {
		return name;
	}
	public void setNme(String name) {
		this.name = name;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getRank() {
		return rank;
	}
	public void getRank(String rank) {
		this.rank = rank;
	}
	
}

