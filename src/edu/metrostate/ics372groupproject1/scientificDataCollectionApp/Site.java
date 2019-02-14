package edu.metrostate.ics372groupproject1.scientificDataCollectionApp;

import java.util.ArrayList;
import java.util.List;
//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Site {
	
	public Site() {
		
	}
	
	private String siteID;	
	
	/**
	 * Creating collection class to store objects read from JSON file.
	 */
	@SerializedName("site_readings")
	@Expose
	private List<Item> items=new ArrayList<Item>();

	public String getSiteID() {
		return siteID;
	}

	public void setSiteID(String siteID) {
		this.siteID = siteID;
	}

}
