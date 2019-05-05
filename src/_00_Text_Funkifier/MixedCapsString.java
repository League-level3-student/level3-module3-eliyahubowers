package _00_Text_Funkifier;

import java.time.zone.ZoneOffsetTransitionRule;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String s2 = "";
		String s3 = "";
		for(int i = 0; i < s.length(); i++) {
			if(i%2 == 0) {
				s2 += s.charAt(i);
			}else {
				s3 += s.charAt(i);
			}
		}
		s2 = s2.toLowerCase();
		s3 = s3.toUpperCase();
		String s4 = "";
		for(int i = 0; i < s.length(); i++) {
			if(i%2 == 0) {
				s4 += s2.charAt(i/2);
			}else {
				s4 += s3.charAt((i-1)/2);
			}
		}
		return s4;
	}

}
