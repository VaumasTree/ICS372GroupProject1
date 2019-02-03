package edu.metrostate.ics372groupproject1.scientificDataCollectionApp;

public class Reading {
	private String siteID;
	private String reading_id;
	private String readingType;
	private double readingValue;
	private long readingDate;
	
	
	public Reading(String sid, String rid, String rt, double rv, long rd) {
		siteID = sid;
		reading_id = rid;
		readingType = rt;
		readingValue = rv;
		readingDate = rd;
	}
	
	public String getSiteID() {return siteID;}
}
