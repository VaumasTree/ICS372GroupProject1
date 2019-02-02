package edu.metrostate.ics372groupproject1.scientificDataCollectionApp;

public class Reading {
	private int site_id;
	private int reading_id;
	private int readingType;
	private int readingValue;
	private long readingDate;
	
	
	public Reading(int sid, int rid, int rt, int rv, long rd) {
		site_id = sid;
		reading_id = rid;
		readingType = rt;
		readingValue = rv;
		readingDate = rd;
	}
	
	public int getSiteID() {return site_id;}
}
