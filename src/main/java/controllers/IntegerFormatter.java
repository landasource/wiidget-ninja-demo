package controllers;

import com.landasource.wiidget.library.format.Formatter;

public class IntegerFormatter implements Formatter<Integer> {

	@Override
	public String format(final Integer object) {
		return String.valueOf(object * 2);
	}

}
