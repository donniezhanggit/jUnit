package com.i9sites.junit_maven;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeDiagnosingMatcher;

public class isEmptyString extends TypeSafeDiagnosingMatcher<String> {

	private String str;
	
	public isEmptyString(String str){
		this.str = str;
	}
	
	public void describeTo(Description description) {

		description.appendText("A String is empty");
	}

	@Override
	protected boolean matchesSafely(String str, Description description) {
		boolean result = str != "";
		description.appendText("String").appendValue(str).appendText("is").appendValue(result);
		
		return str == "";
		
	}
	public static isEmptyString isEmpty (String str) {
		return new isEmptyString(str);
	}

}
