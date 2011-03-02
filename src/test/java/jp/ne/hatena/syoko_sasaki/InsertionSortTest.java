package jp.ne.hatena.syoko_sasaki;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class InsertionSortTest {

	@Test
	public void sort1() throws Exception {
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(2);
		List<Integer> resultList = new ArrayList<Integer>();
		resultList.add(2);
		resultList.add(3);
		assertThat(InsertionSort.sort(list), is(resultList));
	}

	@Test
	public void sort2() throws Exception {
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(3);
		list.add(1);
		List<Integer> resultList = new ArrayList<Integer>();
		resultList.add(1);
		resultList.add(3);
		resultList.add(5);
		assertThat(InsertionSort.sort(list), is(resultList));
	}

	@Test
	public void sort3() throws Exception {
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> resultList = new ArrayList<Integer>();
		assertThat(InsertionSort.sort(list), is(resultList));
	}

	@Test
	public void sort4() throws Exception {
		List<Integer> list = null;
		boolean isCheck = false;
		try {
			InsertionSort.sort(list);
		} catch (NullPointerException e) {
			isCheck = true;
		}
		assertThat(isCheck, is(true));
	}

}
