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

	public void nomConf(String nomConf) {
		this.nomConf = nomConf;
	}

	public String profession() {
		return profession;
	}

	public void profession(String profession) {
		this.profession = profession;
	}

}
