package invitation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.function.Consumer;

public class InvitationBuilder {
	Invitation invit;

	public InvitationBuilder() {
		invit = new Invitation();
	}

	public static Invitation invit(Consumer<InvitationBuilder> invitConsumer) {
		InvitationBuilder invitBuilder = new InvitationBuilder();
		invitConsumer.accept(invitBuilder);
		return invitBuilder.invit;
	}

	public void programme(Consumer<ProgrammeBuilder> gConsumer) {
		ProgrammeBuilder gBuilder = new ProgrammeBuilder();
		gConsumer.accept(gBuilder);
		Programme prog = gBuilder.programme();
		invit.addProgramme(prog);
	}

	public void nomInvite(String nomInv) {
		invit.setNomInvite(nomInv);
	}

	public void lieu(String lieuConf) {
		invit.setLieu(lieuConf);
	}

	public void date(String dateInString) {

		SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		try {
			invit.Date(format1.parse(dateInString));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
