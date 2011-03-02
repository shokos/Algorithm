package jp.ne.hatena.syoko_sasaki;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import org.junit.Test;

public class RandomManagerTest {

	// BIASED-RANDOM作成
	public static int biasedRandom(double p) {
		if (p <= 0 || p >= 1)
			throw new IllegalArgumentException("pの値がおかしいんじゃなイカ？");
		return Math.random() <= p ? 1 : 0;
	}

	@Test()
	public void biasedRandomTest() throws Exception {
		int per = 0;
		for (int i = 0; i < 1000; i++) {
			per += biasedRandom(0.3);
		}
		assertThat(per > 200 && per < 400, is(true));
	}

	@Test(expected = IllegalArgumentException.class)
	public void errorTest() throws Exception {
		biasedRandom(1.1);
		fail();
	}

	@Test
	public void get0or1Test() throws Exception {
		int per = 0;
		for (int i = 0; i < 1000; i++) {
			per += RandomManager.get0or1(0.0001);
		}
		assertThat(per > 450 && per < 550, is(true));
	}

}