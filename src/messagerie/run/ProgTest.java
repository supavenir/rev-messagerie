package messagerie.run;

import messagerie.technics.MinCharRule;
import messagerie.technics.Password;

public class ProgTest {

	public static void main(String[] args) {
		Password motDePasse = new Password("azertyazerty");
		motDePasse.addRule(new MinCharRule(10));
		System.out.println(motDePasse.isValid());
	}

}
