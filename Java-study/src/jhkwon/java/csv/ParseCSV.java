package jhkwon.java.csv;
import java.io.FileReader;
import java.net.URL;

import au.com.bytecode.opencsv.CSVReader;


public class ParseCSV {
	public static void main(String[] args) {
	    try {
	      //csv file containing data
	      String strFile = "coverageInfo.csv";
	      URL url = new ParseCSV().getClass().getClassLoader().getResource(strFile);
	      CSVReader reader = new CSVReader(new FileReader(url.getPath()));
	      String [] nextLine;
	      int lineNumber = 0;
	      while ((nextLine = reader.readNext()) != null) {
	        lineNumber++;
	        System.out.println("Line # " + lineNumber);

	        // nextLine[] is an array of values from the line
	        System.out.println(nextLine[3]);
	      }
	      reader.close();
	    } catch (Exception e){
	    	
	    }
	  }
}
//http://sourceforge.net/projects/opencsv/
//http://stackoverflow.com/questions/12169038/read-csv-file-column-by-column-java