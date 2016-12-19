package test;

import static org.junit.Assert.*;
import invitation.Programme;

import org.junit.Before;
import org.junit.Test;

public class TestProgramme {
	private static final String HEURE = "08:03 pm";
	private static final String DESCRIPTION = "Ruby";
	private String attendu;
	private String attenduError;
	public Programme prog;
	public Programme progError;
	public Programme progErrorD;

	@Before
	public void initProgrammeTest() {
		prog = new Programme(p -> {
			p.presente(DESCRIPTION);
			p.heure(HEURE);

		});

		progError = new Programme(p -> {
			p.presente(DESCRIPTION);
		});

		progErrorD = new Programme(pg -> {
			pg.presente(DESCRIPTION);
		});

		attendu = "20:03:00 -- " + DESCRIPTION;
		 
	}

	@Test
	public void testDescriptionDeProgramme() {
		assertEquals("Description de programme:", "Ruby", prog.description());
	}

	@Test
	public void testheureDeProgramme() {
		assertEquals("l'heure :", "08:03 PM", prog.heure());
	}

	@Test
	public void testajout() {
		assertEquals(attendu, prog.toString());
	}

	@Test(expected=IllegalArgumentException.class)
	public void testajoutIncomplet() {
		progError.toString();
	}

}
