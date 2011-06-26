package jp.ne.hatena.syoko_sasaki;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class MergeSortTest {

	@Test
	public void sortTest() throws Exception {
		int[] a = new int[] { 4, 2, 3, 1, 9 };
		assertThat(MergeSort.mergeSort(a), is(new int[] { 1, 2, 3, 4, 9 }));
	}
}
