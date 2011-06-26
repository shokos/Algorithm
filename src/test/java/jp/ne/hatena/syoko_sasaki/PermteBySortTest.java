package jp.ne.hatena.syoko_sasaki;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;

public class PermteBySortTest {

	@Test
	public void getPrioritiesTest() throws Exception {
		List<Priority> priorities = PermteBySort.getPriorities(5);
		assertThat(priorities.size(), is(5));
		int tmp = 0;
		for (Priority priority : priorities) {
			System.out.println(priority.getNum());
			System.out.println(priority.getPriorityNum());
			assertThat(priority.getNum() > tmp, is(true));
			tmp = priority.getNum();
		}
		System.out.println("並び替えたよ！");
		List<Priority> sortPriorities = PermteBySort.prioritySort(priorities);
		tmp = 0;
		for (Priority priority : sortPriorities) {
			System.out.println(priority.getNum());
			System.out.println(priority.getPriorityNum());
			assertThat(priority.getPriorityNum() > tmp, is(true));
			tmp = priority.getPriorityNum();
		}
	}

	@Test
	public void caliculateTest() throws Exception {
		assertThat(Math.floor(10 / 3), is(3.0));
		assertThat(Math.ceil(10 / 3), is(3.0));

	}

	@Test
	public void sortTest() throws Exception {
		PermteBySort.sort(8);
	}

}
