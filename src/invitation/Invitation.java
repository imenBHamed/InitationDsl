package invitation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Invitation {
	private String nomInvite;
	private String lieu;
	private String theme;
	private List<Programme> programmes;
	private List<Conferencier> conferenciers;
	private Date date;
	private boolean ok = false;

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
				if (p.toString().equals("Programme à completer"))
					ok = true;
				else
					programmes = programmes + "\n" + p.toString();
			}

			confs = "\n Animée par : ";

			for (Conferencier c : this.conferenciers) {
				if (c.toString().equals("Conferencier incomplet"))
					ok = true;

				else
					confs = confs + "\n" + c.toString();
			}
		}
		if (nomInvite != "" && theme != "" && lieu != "" && date != null
				&& ok == false)
			return "---------------Invitation---------------"
			+ "\n Titre de l'invitation : " + this.nomInvite + "\n"
			+ "\n Thème :" + this.theme 
			+ confs 
			+ programmes
			+ "\n Date de la conference : " + this.date
			+ "\n Lieu de la conference : " + this.lieu;

		else

			return "Invitation incomplete";
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
		SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		try {
			this.date = format1.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
