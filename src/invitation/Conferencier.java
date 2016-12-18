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

	/************* méthodes au DSL **********/

	public void participationDe(String nomConf) {

		this.nomConf = nomConf;
	}

	public void enTantQue(String profession) {
		this.profession = profession;
	}

}
