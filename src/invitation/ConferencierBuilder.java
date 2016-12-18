package invitation;

public class ConferencierBuilder {
	private Conferencier conf;

	public ConferencierBuilder() {
		conf = new Conferencier();
	}

	public Conferencier conferencier() {
		return conf;
	}

	public void participationDe(String nomConf) {

		conf.nomConf(nomConf);
	}

	public void enTantQue(String profession) {
		conf.profession(profession);
	}

}
