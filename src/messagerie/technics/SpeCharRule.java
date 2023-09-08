package messagerie.technics;

public class SpeCharRule implements Rule {

	protected final String SPECIAL_CHARS = "@&~#{[|`\\^]}<>$%,./§!=*+-";
	protected int charCount;

	public SpeCharRule(int count) {
		this.charCount = count;
	}

	public SpeCharRule() {
		this(1);
	}

	@Override
	public boolean check(String passwordSeq) {
		int countCharsLeft = charCount;
		for (char c : SPECIAL_CHARS.toCharArray()) {
			if (passwordSeq.contains(c + "")) {
				countCharsLeft--;
			}
			if (countCharsLeft == 0) {
				return true;
			}
		}
		return false;
	}

}
