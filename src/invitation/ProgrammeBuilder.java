package invitation;

public class ProgrammeBuilder {
	private Programme prog;
	
	public ProgrammeBuilder() {
		prog = new Programme();
	}

	public Programme programme(){
		return prog;
	}

	public void heure(String string){
	
		prog.heure(string);
	}
	 
	public void presente(String desc){
		prog.description(desc);
	}
}

