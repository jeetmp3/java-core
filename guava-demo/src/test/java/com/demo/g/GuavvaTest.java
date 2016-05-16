package com.demo.g;

import com.google.common.base.Optional;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Ordering;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

/**
 * Created by jitendra on 15/5/16.
 */
public class GuavvaTest {

	GuavaDemos optional = null;

	@Before
	public void setup() {
		optional = new GuavaDemos();
	}

	@Test
	public void testOptional() {
		assertEquals(10, optional.sum(Optional.of(0), Optional.of(10)));
		assertEquals(30, optional.sum(Optional.of(20), Optional.of(10)));
	}


	@Test(expected = NullPointerException.class)
	public void testOptionalWithNull() {
		Optional.of(null);
	}

	@Test(expected = NullPointerException.class)
	public void preconditionWithNullValuesTest() {
		optional.concat(null, null);
	}

	@Test
	public void preconditionTest() {
		assertEquals("JitendraBisht", optional.concat("Jitendra", "Bisht"));
	}

	@Test
	public void orderingTest() {
		List<Integer> list = Arrays.asList(3, 12, 6, -6, 36, 56, 34, 5);
		Ordering<Integer> ordering = Ordering.natural();
		Collections.sort(list, ordering);
		Integer[] expected = new Integer[]{-6, 3, 5, 6, 12, 34, 36, 56};
		assertEquals(expected, list.toArray(new Integer[0]));
		assertEquals(true, ordering.isOrdered(list));
		assertEquals(-6, (int) ordering.min(list));
		assertEquals(56, (int) ordering.max(list));
	}

	@Test
	public void testMultiSet() {
		Multiset<Integer> set = HashMultiset.create(Arrays.asList(2, 3, 2, 4, 5, 4, 6, 7, 8, 5, 3, 4, 5));
		Set<Integer> expectedSet = new HashSet<Integer>(Arrays.asList(2, 3, 4, 5, 6, 7, 8));
		assertEquals(expectedSet, set.elementSet());
		assertEquals(2, set.count(2));
		assertEquals(2, set.count(3));
		assertEquals(3, set.count(4));
		assertEquals(3, set.count(5));
	}
}
