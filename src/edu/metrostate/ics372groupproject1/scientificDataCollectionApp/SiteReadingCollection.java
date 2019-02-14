package edu.metrostate.ics372groupproject1.scientificDataCollectionApp;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SiteReadingCollection{
	
	@SerializedName("site_readings")
	@Expose
	private List<Item> items;

	public SiteReadingCollection(){
		items =new ArrayList<Item>();
	}
	
	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
}
