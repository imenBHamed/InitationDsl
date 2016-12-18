package invitation;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
 

public class Programme {
	private String description;
	private Time heure;

	public Programme() {

	}

	public Programme(String description, Time heure) {
		this.description = description;
		this.heure = heure;
	}

	public String description() {
		return description;
	}

	public void description(String description) {
		this.description = description;
	}

	public String heure() {
		DateFormat formatter = new SimpleDateFormat("hh:mm a");
		String formattedTime = formatter.format(heure);
		return formattedTime;
	}

	public void heure(String heure) {
		DateFormat formatter = new SimpleDateFormat("hh:mm a");
		 try {
			
			this.heure = new java.sql.Time(formatter.parse(heure).getTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
	
}
