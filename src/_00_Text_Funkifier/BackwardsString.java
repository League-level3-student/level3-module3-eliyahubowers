package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String s2 = "";
		for(int i = 0; i < s.length(); i++) {
			s2 = s.charAt(i) + s2;
		} 
		return s2;
	}

}
