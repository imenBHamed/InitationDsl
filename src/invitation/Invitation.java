package invitation;


import java.util.Date;
import java.util.List;


public class Invitation {
	private String nomInvite;
	private String lieu;
	private List<Programme> programmes; 
	private Date date;
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
 
		
	
}

