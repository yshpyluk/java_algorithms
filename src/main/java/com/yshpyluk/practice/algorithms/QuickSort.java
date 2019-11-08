package com.yshpyluk.practice.algorithms;

import java.util.List;

/**
 * TODO add description
 *
 * @author yshpyluk
 */
public class QuickSort extends Algorithm {
	private List<Integer> list;

	@Override
	public void sort(List<Integer> list) {
		if (list.size() <= 1) {
			return;
		}

		this.list = list;
		quickSort(0, list.size() - 1);
	}

	private void quickSort(int lowIndex, int highIndex) {
		int i = lowIndex;
		int j = highIndex;
		Integer pivot = list.get(lowIndex + (highIndex - lowIndex)/2);
		while (i <= j) {
			while (list.get(i) < pivot) {
				i++;
			}
			while (list.get(j) > pivot) {
				j--;
			}

			if (i <= j) {
				swap(list, i, j);
				i++;
				j--;
			}
		}
		if (lowIndex < j) {
			quickSort(lowIndex, j);
		}
		if (i < highIndex) {
			quickSort(i, highIndex);
		}
	}
}
