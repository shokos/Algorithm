package jp.ne.hatena.syoko_sasaki;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PermteBySort {

	public static int[] sort(int n) {
		int[] result = new int[] {};
		// 並び替え
		List<Priority> list = prioritySort(getPriorities(n));
		for (int i = 0; i < n; i++) {
			result[i] = list.get(i).getNum();
		}
		return result;
	}

	public static List<Priority> getPriorities(int size) {
		List<Priority> result = new ArrayList<Priority>();
		Random random = new Random();
		for (int i = 0; i < size; i++) {
			result.add(new Priority(i + 1, random.nextInt((int) Math.pow(size,
					3)) + 1));
		}
		return result;
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
}
