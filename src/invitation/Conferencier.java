package invitation;

public class Conferencier {
	private String nomConf;
	private String profession;

	public Conferencier() {

	}

	public Conferencier(String nomConf, String profession) {

		this.nomConf = nomConf;
		this.profession = profession;
	}

	public String nomConf() {
		return nomConf;
	}

	public String profession() {
		return profession;
	}

	@Override
	public String toString() {
		if (valide() != true)
			return "Conferencier incomplet";
		else
			return nomConf + "  " + profession;
	}

	public boolean valide() {
		return profession != null && nomConf != "";
	}
	/************* méthodes au DSL **********/

	public Conferencier(ConferencierBuilder d) {
		d.build(this);
	} 
	public void participationDe(String nomConf) {

		this.nomConf = nomConf;
	}

	public void enTantQue(String profession) {
		this.profession = profession;
	}

}
