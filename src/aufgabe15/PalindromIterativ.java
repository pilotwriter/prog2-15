package aufgabe15;

public class PalindromIterativ implements Palindrom {

	@Override
	public boolean istPalindrom(String wort) {
		// TODO Auto-generated method stub
		int end = wort.length() - 1;
		for (int i = 0; i < wort.length(); i++) {
			if (i < end) {
				if (wort.charAt(i) == wort.charAt(end)) {
					end--;
					continue;
				} else {
					return false;
				}
			}
			else {
				break;
			}
		}
		return true;

	}

}
