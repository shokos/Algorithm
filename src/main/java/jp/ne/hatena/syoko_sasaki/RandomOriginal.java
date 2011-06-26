package jp.ne.hatena.syoko_sasaki;

import static java.lang.Math.floor;
import static java.lang.Math.log;
import static java.lang.Math.pow;

import java.util.Random;

public class RandomOriginal {

	private static Random random = new Random();

	// 5.1-2
	public static int rundumAtoB(int a, int b) {
		int m = (int) floor((log(b - a)) / (log(2)));
		int result = 0;
		for (int i = 0; i <= m; i++) {
			result += (random.nextInt(2)) * (pow(2, i));
		}
		// はみでたら最初からやりなおし
		return result > (b - a) ? rundumAtoB(a, b) + a : result + a;
	}
}
