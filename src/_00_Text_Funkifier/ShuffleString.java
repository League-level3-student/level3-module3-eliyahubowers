package _00_Text_Funkifier;

public class ShuffleString extends SpecialString {

	public ShuffleString(String s) {
		super(s);		
	}

	@Override
	public String funkifyText(String s) {
		int l = s.length()/2;
		String s2 = s.substring(0, l);
		String s3 = s.substring(l, s.length());
		String s4 = "";
		for(int i = 0; i < s2.length(); i++) {
				s4 += s2.charAt(i);
				s4 += s3.charAt(i);
		}
		if(l%2 == 0) {
			s4 += s3.charAt(s3.length()-1);
		}
		return s4;
	}

}
