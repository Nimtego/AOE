package Utilits;
import java.util.Random;

public class Rand {
	public static int getRandInt(int min, int max) {
		return max;/*
		Random rand = new Random();
		if (min < max)
			return (rand.nextInt(max-min) + 1) + (rand.nextInt(min) +1);
		else 
			return (rand.nextInt(min-max) + 1) + (rand.nextInt(max) +1);*/
	}
	public static int getRandInt(int to) {
		Random rand = new Random();
		if(to == 0)
			return 0;
		else
			return rand.nextInt(to);
	}
	public static int getRandWithNull(int to) {
		Random rand = new Random();
		if(to == 0)
			return 0;
		else
			return rand.nextInt(to);
	}
	public static int getRandIntForMobCreater(int min, int max) {
		 Random rand = new Random();
		 if (min < max)
		 return (rand.nextInt(max-min) + 1) + (rand.nextInt(min) +1);
		 else 
		 return (rand.nextInt(min-max) + 1) + (rand.nextInt(max) +1);
	}
}
