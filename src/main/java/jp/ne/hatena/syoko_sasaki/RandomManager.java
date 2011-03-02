package jp.ne.hatena.syoko_sasaki;

public class RandomManager {

	public static int get0or1(double p) {
		if (p <= 0 || p >= 1)
			throw new IllegalArgumentException("pの値がおかしいんじゃなイカ？");
		int num1 = Math.random() <= p ? 1 : 0; // BIASED-RANDOM
		int num2 = Math.random() <= p ? 1 : 0; // BIASED-RANDOM
		return num1 == num2 ? get0or1(p) : num1;
	}
}
