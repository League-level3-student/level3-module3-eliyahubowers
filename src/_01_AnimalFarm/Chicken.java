package _01_AnimalFarm;

import java.util.Random;

public class Chicken extends Animal{

    String angryNoise;
	
	String happyNoise;
	
	Chicken(String noise1, String noise2) {
		super(noise1, noise2);
		this.angryNoise = noise1;
		this.happyNoise = noise2;
	}

	@Override
	String makeNoise() {
		String finalNoise = "";
		Random r = new Random();
		int j = r.nextInt(10);
		for(int i = -1; i <= j; i++) {
			if(r.nextInt(10) == 0) {
				finalNoise += " " + angryNoise;
			}else {
				finalNoise += " " + happyNoise;
			}
		}
		return finalNoise;
	}

}
