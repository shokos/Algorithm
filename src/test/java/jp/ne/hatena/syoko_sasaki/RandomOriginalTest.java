package jp.ne.hatena.syoko_sasaki;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Random;

import org.junit.Test;

public class RandomOriginalTest {

	@Test
	public void randomTest() throws Exception {
		for (int j = 0; j < 100; j++) {
			Random random = new Random();
			int target = random.nextInt(4) + 10;
			int per = 0;
			for (int i = 0; i < 10000; i++) {
				int result = RandomOriginal.rundumAtoB(10, 13);
				assertThat((result >= 10 && result <= 13), is(true));
				if (result == target) {
					per++;
				}
			}
			assertThat(per > 2200 && per < 2800, is(true));
		}
	}
}
