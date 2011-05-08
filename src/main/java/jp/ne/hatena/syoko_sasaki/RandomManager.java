package jp.ne.hatena.syoko_sasaki;

import static java.lang.Math.floor;
import static java.lang.Math.log;
import static java.lang.Math.pow;

import java.util.Random;

public class RandomManager {

	public static int get0or1(double p) {
		if (p <= 0 || p >= 1)
			throw new IllegalArgumentException("pの値がおかしいんじゃなイカ？");
		int num1 = Math.random() <= p ? 1 : 0; // BIASED-RANDOM
		int num2 = Math.random() <= p ? 1 : 0; // BIASED-RANDOM
		return num1 == num2 ? get0or1(p) : num1;
	}

	// 5.1-3
	public static int getBiasedRandom(double p) {
		if (p <= 0 || p >= 1)
			throw new IllegalArgumentException("pの値がおかしいんじゃなイカ？");
		int i = 0;
		int tmp = 0;
		int next = 0;
		while (i != 0 && tmp == next) {
			tmp = next;
			tmp = Math.random() <= p ? 1 : 0;
			i++;
		}
		return i % 2 == 1 ? 1 : 0;
	}

	public static int rundumAtoB(int a, int b) {
		Random random = new Random();
		int m = (int) floor((log(b - a)) / (log(2)));
		int result = 0;
		for (int i = 0; i <= m; i++) {
			result += (random.nextInt(2)) * (pow(2, i));
		}
		return result > (b - a) ? rundumAtoB(a, b) + a : result + a;
	}

}
