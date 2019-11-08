package com.yshpyluk.practice.algorithms;

import java.util.List;

/**
 * TODO add description
 *
 * @author yshpyluk
 */
public abstract class Algorithm {
	public abstract void sort(List<Integer> list);

	protected void swap(List<Integer> list, int positionA, int positionB) {
		Integer placeholder = list.get(positionA);
		list.set(positionA, list.get(positionB));
		list.set(positionB, placeholder);
	}
}
