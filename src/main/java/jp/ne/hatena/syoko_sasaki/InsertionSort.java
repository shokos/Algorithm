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

	public static List<Priority> prioritySort(List<Priority> list) {
		Priority tmp;
		for (int j = 1; j < list.size(); j++) {
			Priority target = list.get(j);
			int i = j - 1;
			for (; i > -1
					&& list.get(i).getPriorityNum() > target.getPriorityNum(); i--) {
				tmp = list.get(i);
				list.set(i + 1, tmp);
			}
			list.set(i + 1, target);
		}
		return list;
	}

	public static void main(String[] args) {
		boolean ω = true;
		for (; ω;) {
			System.out.println("帰れません");
		}
		boolean ToT = true;
		while (ToT) {
			System.out.println("ぬけれません");
		}
	}

}
