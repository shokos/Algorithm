package jp.ne.hatena.syoko_sasaki;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class Online {

	@Test
	public void testname() throws Exception {
		int[] score = new int[] { 5, 1, 6, 2, 3, 1, 9, 8, 1, 4 };
		assertThat(getBest(score, 8), is(9));
		assertThat(getBest(score, 2), is(2));
		assertThat(getBest(score, 4), is(6));

	}

	private int getBest(int[] score, int k) {
		int best = -9999;
		for (int i = 0; i < k; i++) {
			if (score[i] > best) {
				best = score[i];
			}
		}
		for (int i = k; i < score.length; i++) {
			if (score[i] > best) {
				return i;
			}
		}
		return score.length - 1;
	}

}
