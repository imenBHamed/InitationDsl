package invitation;

public class Main {

	public static void main(String[] args) {
		Invitation invitation = InvitationBuilder.invit(inv -> {
			inv.nomInvite("M. Guy Tremblay");
			inv.theme("Maintenance et R�alisation");
			inv.lieu("UQAM-Montr�al");
			inv.date("30-03-2017 09:00:00");
			inv.programme(prog -> {
				prog.heure("09:00 am");
				prog.presente("Introduction");
			});
			inv.programme(prog -> {
				prog.heure("10:00 am");
				prog.presente("Les types de DSL");
			});
			inv.programme(prog -> {
				prog.heure("11:00 am");
				prog.presente("Les avantages de DSL");
			});
			inv.programme(prog -> {
				prog.heure("11:30 am");
				prog.presente("Un exemple pratique de DSL");
			});
			inv.conferencier(conf -> {
				conf.participationDe("Martin Fowler");
				conf.enTantQue("Ma�tre de conf�rence");
			});
			inv.conferencier(conf -> {
				conf.participationDe("Imen Ben Hamed");
				conf.enTantQue("Ing�nieure informatique");
			});
		});

		System.out.print(invitation);
	}
}
