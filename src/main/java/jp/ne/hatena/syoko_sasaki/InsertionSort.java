package jp.ne.hatena.syoko_sasaki;

import java.util.List;

public class InsertionSort {

	public static List<Integer> sort(List<Integer> list) {
		Integer tmp;
		for (int j = 1; j < list.size(); j++) {
			Integer target = list.get(j);
			int i = j - 1;
			for (; i > -1 && list.get(i) > target; i--) {
				tmp = list.get(i);
				list.set(i + 1, tmp);
			}
			list.set(i + 1, target);
		}
		return list;
	}
}
