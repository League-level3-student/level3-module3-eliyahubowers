package _01_AnimalFarm;

import java.util.Random;

public class Cow extends Animal{
	
    String angryNoise;
	
	String happyNoise;
	
	Cow(String noise1, String noise2) {
		super(noise1, noise2);
		this.angryNoise = noise1;
		this.happyNoise = noise2;
	}

	@Override
	String makeNoise() {
		String finalNoise = "m";
		Random r = new Random();
		for(int i = 0; i <= 10; i++) {
			if(r.nextInt(10) == 0) {
				finalNoise += "OO";
			}else {
				finalNoise += "oo";
			}
		}
		return finalNoise;
	}

}
