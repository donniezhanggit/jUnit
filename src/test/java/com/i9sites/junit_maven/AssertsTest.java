package com.i9sites.junit_maven;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static com.i9sites.junit_maven.isEmptyString.*;
import static com.i9sites.junit_maven.DivisibleBy.*;

import org.junit.Test;

public class AssertsTest {

	@Test
	public void testAssert(){
		
		String str1 = "jUnit";
		String str2 = "jUnit";
		Integer int1 = null;
		Integer int2 = 1;
		
		int[] array1 = {1,2,3,4};
		int[] array2 = {1,2,3};
	/*	
		//assertArrayEquals(array1, array2);
		assertEquals(str1,str2);
		
		assertThat(str1,is("jUnit"));
	//	assertNotSame(str1,str2);
		assertThat("Not Equals", "1234", is("123"));
		assertNotNull(int2);*/
		
		String tst = "";
		Integer tst2 = 4;
		assertThat(tst,is(isEmpty(tst)) );
		assertThat(tst2,is(disivibleBy(2)));

	}
	
}
