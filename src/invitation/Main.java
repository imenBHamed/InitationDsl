package invitation;

public class Main {

	public static void main(String[] args) {
		Invitation invitation = InvitationBuilder.invit(inv -> {
			inv.nomInvite("M. Lio");
			inv.theme("Internal DSL in Java 8");
			inv.lieu("Montreal");
			inv.date("30-03-2017 09:00:00");
			inv.programme(prog -> {
				prog.heure("08:03 pm");
				prog.presente("les nouvelles fonctionnalités de DSL");
			});

			inv.programme(prog -> {
				prog.heure("10:00 pm");
				prog.presente("les avantages de DSL");
			});

			inv.conferencier(conf -> {
				conf.participationDe("Alexis lio");
				conf.enTantQue("Maitre de conference");

			});
			inv.conferencier(conf -> {
				conf.participationDe("Alexand");
				conf.enTantQue("Ingenieur");

			});

		});

		System.out.print(invitation);
	}
}
