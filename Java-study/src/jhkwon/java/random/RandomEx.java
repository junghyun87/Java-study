package jhkwon.java.random;

import java.util.Random;

public class RandomEx {
	public static void main(String[] args){
		Random rand = new Random();

		int i = rand.nextInt(10) + 1;
		System.out.println(i);

		float f = rand.nextFloat();
		System.out.println(f);

		Boolean b = rand.nextBoolean();
		System.out.println(b);
	}
}