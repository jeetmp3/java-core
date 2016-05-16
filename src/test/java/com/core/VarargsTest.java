package com.core;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jitendra on 15/5/16.
 */
public class VarargsTest {

	@Test
	public void testVarargsMethod() {
		Varargs varargs = new Varargs();
		Assert.assertEquals(2, varargs.testMethod(2));
		Assert.assertEquals(5, varargs.testMethod(2, 3));
		Assert.assertEquals(12, varargs.testMethod(2, 2, 3));
	}
}
