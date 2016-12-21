package invitation;

public class Main {

	public static void main(String[] args) {
		Invitation invitation = InvitationBuilder.invit(inv -> {
			inv.nomInvite("M. Guy Tremblay");
			inv.theme("Maintenance et Réalisation");
			inv.lieu("Montreal");
			inv.date("30-03-2017 09:00:00");
			inv.programme(prog -> {
				prog.heure("09:00 am");
				prog.presente("Introduction");
			});
			inv.programme(prog -> {
				prog.heure("10:00 pm");
				prog.presente("Les types de DSL");
			});
			inv.programme(prog -> {
				prog.heure("11:00 pm");
				prog.presente("Les avantages de DSL");
			});
			inv.programme(prog -> {
				prog.heure("11:30 pm");
				prog.presente("Un exemple pratique de DSL");
			});
			inv.conferencier(conf -> {
				conf.participationDe("Martin Fowler");
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
