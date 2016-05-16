package com.core;

import java.util.Map;

/**
 * Created by jitendra on 15/5/16.
 */
public class Varargs {

	public int testMethod(int... args) {
		int multi = 1;
		for (int arg : args) {
			multi *= arg;
		}
		return multi;
	}

	public int testMethod(int x, int y) {
		return x + y;
	}
}
