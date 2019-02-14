package edu.metrostate.ics372groupproject1.scientificDataCollectionApp;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.awt.Component;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * @author Sachi A
 * @author Eric V
 * @version 1.0
 * The<code>IOinterface</code> class. There is no safeguard inherently built into 
 * the class to check if the file is, indeed, a JSON File. 	
 */
public class IOInterface{

	private FileWriter writer;
	private Gson gson;
	
	/**
	 * Constructor, throws an IOexception because of the <code>FileWriter</code> class trying to access a file
	 */
	public IOInterface() {
		gson=new GsonBuilder().setPrettyPrinting().create(); 
	}
	
	/**
	 * A method to read a JSON file
	 * @param parent 
	 * @return - returns a SiteCollection object that holds the Site Readings For that JSON File
	 */
	

	public String getFileName(File fp) {
		return fp.getPath();
	}
	
	
	public SiteReadingCollection readIn(File fp){
		
		SiteReadingCollection temp = new SiteReadingCollection();
		try {
			BufferedReader br =new BufferedReader(new FileReader(fp.getPath()));
			if (br != null) {
		    	try {
		    		br.close();
		    	}catch (IOException e) {
		    		e.printStackTrace();
		    	}
			}
		    temp = gson.fromJson(br,SiteReadingCollection.class);
		    try {
		    	br.close();
		    }catch(IOException e) {
		    	e.printStackTrace();
		    }
		}catch (FileNotFoundException e) {
		    e.printStackTrace();
		}
		return temp;
	}
	
	/**
	 * @param sc - The SiteReadingCollection to be written out to file
	 * @param output - The File object that contains the file to be written to.
	 * @throws IOException - writer.write(jsonString);
	 * 	
	 */
	public void writeOut(SiteReadingCollection sc, File output) throws IOException {
		String jsonString = gson.toJson(sc);
		writer = new FileWriter(output);
		writer.write(jsonString);
		writer.close();
	}
	
}
