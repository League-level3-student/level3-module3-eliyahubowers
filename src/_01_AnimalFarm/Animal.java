package _01_AnimalFarm;

import java.util.Random;

public abstract class Animal {
	
	String angryNoise;
	
	String happyNoise;
	
	public Animal(String happyNoise, String angryNoise){
		this.angryNoise = angryNoise;
		this.happyNoise = happyNoise;
	}

	String eat() {
		Random r = new Random();
		int i = r.nextInt(2);
		if(i == 0) {
		    return "contented " + this.happyNoise;
		}else {
			return "I want more " + this.angryNoise + " " + this.angryNoise;
		}
	}
	
	abstract String makeNoise();
	
}
