package invitation;

import java.util.Timer;

public class Programme {
	private String description;
	private Timer heure;

	public Programme() {

	}

	public Programme(String description, Timer heure) {
		this.description = description;
		this.heure = heure;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timer getHeure() {
		return heure;
	}

	public void setHeure(Timer heure) {
		this.heure = heure;
	}
	
}
