package messagerie.technics;

public class MinCharRule implements Rule {
	int charCount;

	public MinCharRule() {
		this(8);
	}

	public MinCharRule(int charCount) {
		this.charCount = charCount;
	}

	@Override
	public boolean check(String passwordSeq) {
		return charCount <= passwordSeq.length();
	}

}
