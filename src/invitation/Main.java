package invitation;

public class Main {

	public static void main(String[] args) {
		Invitation invitation = InvitationBuilder.invit(inv -> {
			inv.nomInvite("jdfh");
			inv.lieu("Montreal");
			inv.date("30-03-2017 09:00:00");
			inv.programme(prog -> {
				prog.heure("08:03 pm");
				prog.presente("b");
			});

		});

		System.out.print(invitation);
	}
}
