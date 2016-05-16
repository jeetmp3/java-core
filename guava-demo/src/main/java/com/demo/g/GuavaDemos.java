package com.demo.g;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;

import java.util.List;

/**
 * Created by jitendra on 15/5/16.
 */
public class GuavaDemos {

	public int sum(Optional<Integer> a, Optional<Integer> b) {
		return a.or(0) + b.or(0);
	}

	public String concat(String src, String target) {
		src = Preconditions.checkNotNull(src);
		target = Preconditions.checkNotNull(target);
		return src.concat(target);
	}
}
