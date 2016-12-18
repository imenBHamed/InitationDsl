package invitation;

import java.util.Date;

public interface NestedInvitationBuilder {
	 public static Invitation invitation( String lieu,String nomInvite, String theme,  Date date, Conferencier... conferenciers) {
	        Invitation invitation = new Invitation();
	        return invitation;
	    }
}
