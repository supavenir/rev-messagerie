package messagerie.run;

import messagerie.models.Group;
import messagerie.models.User;

public class ProgTest {

	public static void main(String[] args) {
		/*
		 * Password motDePasse = new Password("azertyazerty"); motDePasse.addRule(new
		 * MinCharRule(10)); motDePasse.addRule(new SpeCharRuleRegexp(2));
		 * System.out.println(motDePasse.isValid());
		 */
		Group group = new Group("2 SIO SLAM");
		Group group2 = new Group("2 SIO SLAM");
		User user = new User("J", "SMITH");
		group.addUSers(new User("Je", "DOE"), new User("J", "DOE"), user, new User("J", "SMITH"), new User("J", "DOE"));
		group2.addUSers(user);
		// System.out.println(group);
		System.out.println(user.getGroups());
		group2.removeUser(user);
		System.out.println(group2);
		System.out.println(user.getGroups());
	}

}
