package messagerie.run;

import messagerie.technics.MinCharRule;
import messagerie.technics.Password;
import messagerie.technics.SpeCharRuleRegexp;

public class ProgTest {

	public static void main(String[] args) {
		Password motDePasse = new Password("azertyazerty");
		motDePasse.addRule(new MinCharRule(10));
		motDePasse.addRule(new SpeCharRuleRegexp(2));
		System.out.println(motDePasse.isValid());
	}

}
