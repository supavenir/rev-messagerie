package messagerie.models;

public class Utilisateur {

	private String nom;
	private String prenom;
	private int age;

	public Utilisateur(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		setAge(age);
	}

	public Utilisateur(String nom, String prenom) {
		this(nom, prenom, 0);
	}

	public Utilisateur() {
		this("?", "?", 0);
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setAge(int age) throws NumberFormatException {
		if (age >= 0 && age <= 130) {
			this.age = age;
		} else {
			throw new NumberFormatException();
		}
	}

	@Override
	public String toString() {
		return nom + " " + prenom + " (" + age + ")";
	}

}
