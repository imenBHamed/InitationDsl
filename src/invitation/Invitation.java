package invitation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;

public class Invitation {
	private String nomInvite;
	private String lieu;
	private String theme;
	private List<Programme> programmes;
	private List<Conferencier> conferenciers;
	private Date date;
	private boolean ok = false;
	SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");

	public Invitation() {
		programmes = new ArrayList<Programme>();
		conferenciers = new ArrayList<Conferencier>();
	}

	@Override
	public String toString() {

		String confs = "";
		String programmes = "\n programme : ";
		if (this.conferenciers.size() == 0 || this.programmes.size() == 0)
			ok = true;
		else {
			for (Programme p : this.programmes) {
				programmes = programmes + "\n" + p.toString();
			}

			confs = "\n Animée par : ";

			for (Conferencier c : this.conferenciers) {
				confs = confs + "\n" + c.toString();
			}
		}
		if (nomInvite == null || theme == null || lieu == null || date == null
				|| ok) {
			throw new IllegalArgumentException(
					"Il faut saisir toutes les informations d'une invitation");
		}
		if (validDate()) {
			throw new InputMismatchException(
					"Il faut les heures de programme en ordre chronologique");
		}
		return "---------------Invitation---------------"
				+ "\n Titre de l'invitation : " + this.nomInvite + "\n"
				+ "\n Thème :" + this.theme + confs + programmes
				+ "\n Date de la conference : " + formatter.format(this.date)
				+ "\n Lieu de la conference : " + this.lieu;

	}

	public Boolean validDate() {
		Date d1;
		Date d2;
		boolean ok = false;
		SimpleDateFormat format = new SimpleDateFormat("HH:mm");
		Iterator<Programme> it = this.programmes.iterator();
		Programme element = it.next();
		while (it.hasNext()) {
			Programme elementSuivant = it.next();
			try {
				d1 = format.parse(elementSuivant.heure());
				d2 = format.parse(element.heure());
				if (!(d1.getTime() > d2.getTime())) {
					ok = true;
					break;
				}
				element = elementSuivant;
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return ok;
	}

	public String nomInvite() {
		return nomInvite;
	}

	public void nomInvite(String nomInvite) {
		this.nomInvite = nomInvite;
	}

	public String lieu() {
		return lieu;
	}

	public void lieu(String lieu) {
		this.lieu = lieu;
	}

	public List<Programme> programmes() {
		return programmes;
	}

	public void addProgramme(Programme prog) {
		programmes.add(prog);
	}

	public List<Conferencier> conferenciers() {
		return conferenciers;
	}

	public void addConferencier(Conferencier conf) {
		conferenciers.add(conf);
	}

	public String theme() {
		return theme;
	}

	public void theme(String theme) {
		this.theme = theme;
	}

	public Date date() {
		return date;
	}

	public void date(String date) {

		try {
			this.date = formatter.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
