package aufgabe15;

public class PalindromRekursiv implements Palindrom{

	@Override
	public boolean istPalindrom(String wort) {
		if(wort.length()<= 1) {
			return true;
		}
		else {
			if(Character.toLowerCase(wort.charAt(0)) == Character.toLowerCase(wort.charAt(wort.length() -1))) {
				StringBuilder sb = new StringBuilder(wort);
				sb.deleteCharAt(0);
				sb.deleteCharAt(sb.length()-1);

				return istPalindrom(sb.toString());
			}
			else {
				return false;
			}
			
		}
		
	
	}
	

}
