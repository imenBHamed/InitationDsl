package invitation;

public class Main {

	public static void main(String[] args) {
		Invitation invitation = InvitationBuilder.invit(inv -> {
			inv.titreDeLInvitation("Mises à jour de DSL interne");
			inv.theme("Internal DSL in Java 8");
			inv.lieu("Montreal");
			inv.date("30-03-2017 09:00:00");
			inv.programme(prog -> {
				prog.heure("08:03 pm");
				prog.presente("les nouvelles fonctionnalités de DSL");
			});
			inv.conferencier(conf -> {
				conf.participationDe("Alexis lio");
				conf.enTantQue("Maitre de conference");

			});

		});

		System.out.print(invitation);
	}
}
