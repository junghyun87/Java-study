package jhkwon.java.time;

import java.util.Date;

public class DateExample{
	public static void main(String... args){
		long start = new Date().getTime();
		long end = new Date().getTime();

		System.out.println((end-start)/1000f);		
	}
}

