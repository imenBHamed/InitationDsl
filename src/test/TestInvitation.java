package test;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import invitation.Conferencier;
import invitation.Invitation;
import invitation.InvitationBuilder;
import invitation.Programme;

public class TestInvitation {
	private static final String HEURE = "08:03 pm";
	private static final String NOMINVITE = "M. Alex";
	private static final String DESCRIPTION = "Ruby";
	private static final String NOMCONFERENCIER = "Alexis";
	private static final String DATE = "15-05-2017 08:00:00";
	private static final String PROFESSION = "ingenieur";
    private static final String LIEU = "Ottwaa";
    private static final String THEME = "Importance du Ruby";
	private String attendu;
	
	
	private Invitation invitation;
	private Invitation invitation1;
	private Invitation invitation2;
	
	@Before
	public void initInvitationTest() {
		  invitation = InvitationBuilder.invit(inv -> {
			inv.theme(THEME);
			inv.nomInvite(NOMINVITE);
			inv.date(DATE);
			inv.lieu(LIEU);
			inv.programme(prog -> {
				prog.heure(HEURE);
				prog.presente(DESCRIPTION);
			});
			inv.conferencier(conf -> {
				conf.participationDe(NOMCONFERENCIER);
				conf.enTantQue(PROFESSION);

			});

		});
		 
			  invitation1 = InvitationBuilder.invit(inv -> {
				inv.theme(THEME);
				inv.nomInvite(NOMINVITE);
				inv.date(DATE);
				inv.lieu(LIEU);
				inv.programme(prog -> {
					prog.heure(HEURE);
					prog.presente(DESCRIPTION);
				});

			});
			  
			  invitation2 = InvitationBuilder.invit(inv -> {
					inv.theme(THEME);
					inv.nomInvite(NOMINVITE);
					inv.date(DATE);
					inv.lieu(LIEU);
					inv.programme(prog -> {
						prog.heure(HEURE);
						prog.presente(DESCRIPTION);
					});

				});
			  
		attendu = "---------------Invitation---------------"
				+ "\n Titre de l'invitation : " + NOMINVITE + "\n"
				+ "\n Thème :" + THEME + "\n Animée par : \n" + NOMCONFERENCIER + "  " + PROFESSION 
				+ "\n programme : \n" + "20:03:00 -- " + DESCRIPTION
				+ "\n Date de la conference : Mon May 15 08:00:00 EDT 2017"
				+ "\n Lieu de la conference : " + LIEU;
		
	
	}
	
	@Test
	public void testAjoutInvitationComplete() {
		assertEquals(attendu, invitation.toString());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testAjoutInvitationIncomplete() {
		 invitation1.toString();
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testInsertionInvitationIncomplete() {
		invitation2.toString();
	}
	
	
	
}
