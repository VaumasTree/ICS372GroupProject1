/**
 * This is a class to represent an Item
 * Item includes:
 * siteID
 * readingType
 * readingID
 * readingValue
 * readingDate
 * 
 * @author Sashi Raj Amatya
 */
package edu.metrostate.ics372groupproject1.scientificDataCollectionApp;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Generated;


public class Item {
	
	//codes starting with @ is needed to link JSON input to corresponding attributes.
	
	@SerializedName("site_id")
	@Expose
	private String siteID;
	
	@SerializedName("reading_type")
	@Expose
	private String readingType;
	
	@SerializedName("reading_id")
	@Expose
	private String readingID;
	
	@SerializedName("reaading_value")
	@Expose
	private double readingValue;
	
	@SerializedName("reading_date")
	@Expose
	private long readingDate;
	
	
	/**
	 * Constructor
	 * @param siteID - Id of a site
	 * @param readingType - One of the 4 types: humidity, temperature, barometric pressure, or particulate counts
	 * @param readingID - reading id
	 * @param readingValue - value of one of the 4 types
	 * @param readingDate - date the reading is taken
	 */
	public Item(String siteID, String readingType, String readingID, double readingValue, long readingDate) {		
		this.siteID=siteID;
		this.readingType=readingType;		
		this.readingID=readingID;		
		this.readingValue=readingValue;		
		this.readingDate=readingDate;		
	}

	public String getSiteID() {
		return siteID;
	}

	public void setSiteID(String siteID) {
		this.siteID = siteID;
	}

	public String getReadingType() {
		return readingType;
	}

	public void setReadingType(String readingType) {
		this.readingType = readingType;
	}

	public String getReadingID() {
		return readingID;
	}

	public void setReadingID(String readingID) {
		this.readingID = readingID;
	}

	public double getReadingValue() {
		return readingValue;
	}

	public void setReadingValue(double readingValue) {
		this.readingValue = readingValue;
	}

	public long getReadingDate() {
		return readingDate;
	}

	public void setReadingDate(long readingDate) {
		this.readingDate = readingDate;
	}
}
