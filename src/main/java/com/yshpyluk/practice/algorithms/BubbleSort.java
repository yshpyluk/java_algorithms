package com.yshpyluk.practice.algorithms;

import java.util.List;

/**
 * TODO add description
 *
 * @author yshpyluk
 */
public class BubbleSort extends Algorithm {

	@Override
	public void sort(List<Integer> list) {
		boolean hasChanges = true;
		while (hasChanges) {
			hasChanges = false;
			for (int i = 1; i < list.size(); i++) {
				if (list.get(i - 1) > list.get(i)) {
					swap(list, i - 1, i);
					hasChanges = true;
				}
			}
		}
	}
}
