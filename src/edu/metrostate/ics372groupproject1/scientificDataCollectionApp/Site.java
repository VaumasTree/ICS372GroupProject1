package edu.metrostate.ics372groupproject1.scientificDataCollectionApp;

import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Site {

	private String site_ID;
	private boolean collecting;
	private List<Reading> readings;
	
	public Site(String ID) {
		site_ID = ID;
		collecting = true;
		readings = new ArrayList<Reading>();
	}
	
	public String getSiteID() {return site_ID;}
	
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
