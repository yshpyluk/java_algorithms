package com.yshpyluk.practice.algorithms;

import java.util.List;

/**
 * TODO add description
 *
 * @author yshpyluk
 */
public class InsertionSort extends Algorithm {
	private List<Integer> list;

	@Override
	public void sort(List<Integer> list) {
		if (list.size() == 1) {
			return;
		}

		this.list = list;

		int i = 1;
		while (i < list.size()) {
			while (list.get(i - 1) > list.get(i)) {
				swap(list, i, i -1);
				if (i == 1) continue;
				i--;
			}
			i++;
		}
	}
}
