package invitation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Invitation {
	private String nomInvite;
	private String lieu;
	private List<Programme> programmes;
	private Date date;

	public Invitation() {
		programmes = new ArrayList<Programme>();
	}

	@Override
	public String toString() {
		String programmes = "\n programme : ";
		for (Programme p : this.programmes) {
			programmes = programmes + "\n" + p.heure() + "  " + p.description();
		}

		return "---------------Invitation---------------"
		+ "\n Nom de l'invite : " + this.nomInvite + programmes
		+ "\n Date de la conference : " + this.date
		+ "\n Lieu de la conference : " + this.lieu;
	}

	public String getNomInvite() {
		return nomInvite;
	}

	public void setNomInvite(String nomInvite) {
		this.nomInvite = nomInvite;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public List<Programme> getProgrammes() {
		return programmes;
	}

	public void addProgramme(Programme prog) {
		programmes.add(prog);
	}

	public Date Date() {
		return date;
	}

	public void Date(Date date) {
		this.date = date;
	}

}
