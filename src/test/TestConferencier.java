package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import invitation.Conferencier;

public class TestConferencier {
	private static final String NOMCONFERENCIER = "Alexis";
	private static final String PROFESSION = "ingenieur";
	private String attendu;
	private String attenduError;
	public Conferencier conf;
	public Conferencier confErrorP;
	public Conferencier confErrorN;

	@Before
	public void initConferencierTest() {
		conf = new Conferencier(c -> {
			c.participationDe(NOMCONFERENCIER);
			c.enTantQue(PROFESSION);

		});

		confErrorP = new Conferencier(c -> {
			c.participationDe(NOMCONFERENCIER);
		});

		confErrorN = new Conferencier(c -> {
			c.enTantQue(PROFESSION);
		});

		attendu = NOMCONFERENCIER + "  " + PROFESSION;
		attenduError = "Conferencier incomplet";

	}

	@Test
	public void testajoutConferencier() {
		assertEquals(attendu, conf.toString());
	}

	@Test
	public void testnomConferencier() {
		assertEquals("Alexis", conf.nomConf());
	}

	@Test
	public void testProfessionConferencier() {
		assertEquals("ingenieur", conf.profession());
	}

	@Test(expected=IllegalArgumentException.class)
	public void testajoutIncomplet() {
		  confErrorP.toString();
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testAjoutIncomplet() {
		confErrorN.toString();
	}

}
