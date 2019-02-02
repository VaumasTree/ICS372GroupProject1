package edu.metrostate.ics372groupproject1.scientificDataCollectionApp;

import java.util.Set;
import java.util.HashSet;

public class Site {

	private int site_ID;
	private boolean collecting;
	private Set<Reading> readings;
	
	public Site(int ID) {
		site_ID = ID;
		collecting = true;
		readings = new HashSet<Reading>();
	}
	
	public int getSiteID() {return site_ID;}
	
	public void start_SiteCollection() { collecting = true;}
	public void end_SiteCollection() {collecting = false;}
	
	public boolean collectingStatus() { return collecting;}
	
	public boolean addReading(Reading r) {
		if(collecting == true && r.getSiteID() == site_ID) {
			readings.add(r);
			return true;
		}
		return false;
	}
	
	
	
	
}
