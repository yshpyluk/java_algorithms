package com.yshpyluk.practice;

import com.yshpyluk.practice.algorithms.Algorithm;
import com.yshpyluk.practice.algorithms.BubbleSort;
import com.yshpyluk.practice.algorithms.InsertionSort;
import com.yshpyluk.practice.algorithms.QuickSort;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * TODO add description
 *
 * @author yshpyluk
 */
public class AlgorithmsTest {

	@Test
	public void testBubbleSort() {
		testAlgorithm(new BubbleSort(), 50);
	}

	@Test
	public void testQuickSort() {
		testAlgorithm(new QuickSort(), 20000);
	}

	@Test
	public void testInsertionSort() {
		testAlgorithm(new InsertionSort(), 100);
	}

	@Test
	public void testDefaultSort() {
		for (int i = 1; i < 100000; i++) {
			List<Integer> numbers = new Random().ints(i * i * i * 20000, 0, 1000)
					.boxed()
					.collect(Collectors.toList());

			double start = System.currentTimeMillis();
			numbers.sort((a, b) -> a - b);
			double end = System.currentTimeMillis();
			double executionTime = (end - start) / 1000;
			System.out.println(executionTime + "	" + numbers.size());
			if (executionTime > 30) {
				break;
			}
		}
	}

	private void testAlgorithm(Algorithm algorithm, int multiplier) {
		for (int i = 1; i < 100000; i++) {
			List<Integer> numbers = new Random().ints(i * i * i * multiplier, 0, 1000)
					.boxed()
//					.sorted()
//					.sorted((a, b) -> b - a)
					.collect(Collectors.toList());

			double start = System.currentTimeMillis();
			algorithm.sort(numbers);
			double end = System.currentTimeMillis();
			double executionTime = (end - start) / 1000;
			System.out.println(executionTime + "	" + numbers.size());
			if (executionTime > 30) {
				break;
			}
		}
	}
}
