package aufgabe15;

public class PalindromIterativ implements Palindrom {

	@Override
	public boolean istPalindrom(String wort) {
		// TODO Auto-generated method stub
		int end = wort.length() - 1;
		for (int i = 0; i < wort.length(); i++) {
			if (i < end) {
					//equal ignorecase with toLowerCase
				if (Character.toLowerCase(wort.charAt(i)) == Character.toLowerCase(wort.charAt(end))) {
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
