package invitation;

import java.util.function.Consumer;

public class InvitationBuilder {
	Invitation invit;

	public InvitationBuilder() {
		invit = new Invitation();
	}

	/*********
	 * Configuration de DSL en utilisant des interface fonctionnelle et des
	 * consommateurs
	 ***********/

	public static Invitation invit(Consumer<InvitationBuilder> invitConsumer) {
		InvitationBuilder invitBuilder = new InvitationBuilder();
		invitConsumer.accept(invitBuilder);
		return invitBuilder.invit;
	}

	public void programme(Consumer<Programme> gConsumer) {
		Programme gBuilder = new Programme();
		gConsumer.accept(gBuilder);
		invit.addProgramme(gBuilder);
	}

	public void conferencier(Consumer<Conferencier> cConsumer) {
		Conferencier cBuilder = new Conferencier();
		cConsumer.accept(cBuilder);
		invit.addConferencier(cBuilder);
	}

	/**************** méthodes au DSL ****************/

	public void nomInvite(String nomInv) {
		invit.nomInvite(nomInv);
	}

	public void lieu(String lieuConf) {
		invit.lieu(lieuConf);
	}

	public void theme(String theme) {
		invit.theme(theme);
	}

	public void date(String dateInString) {
		invit.date(dateInString);
	}
}
