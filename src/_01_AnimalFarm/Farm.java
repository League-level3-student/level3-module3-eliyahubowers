package _01_AnimalFarm;

import java.util.ArrayList;
import java.util.Random;

public class Farm {
	public static void main(String[] args) {
		ArrayList<Animal> farm = new ArrayList<Animal>();
		Cow c = new Cow("mooo","MOOOOO MOO");
		Chicken ch = new Chicken("buck" , "BKAAAAA");
		Duck d = new Duck("quack" , "QUACK");
		Sheep s = new Sheep("baaah" , "BAAAHH");
		Random r = new Random();
		for(int i = 0; i < 6; i ++) {
			int j = r.nextInt(4);
			if(j == 0) {
				farm.add(c);
			}else if(j == 1) {
				farm.add(ch);
			}else if(j == 2) {
				farm.add(d);
			}else if(j == 3) {
				farm.add(s);
			}
		}
		for(int i = 0; i < farm.size(); i ++) {
			System.out.println(farm.get(i).makeNoise());
			System.out.println(farm.get(i).eat());
		}
	}
}
