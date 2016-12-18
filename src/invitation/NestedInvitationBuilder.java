package invitation;

import java.util.Date;

public interface NestedInvitationBuilder {
	 public static Invitation invitation(String lieu, String nomInvite, Date date, Programme... programmes) {
	        Invitation invitation = new Invitation();
	        return invitation;
	    }
}
