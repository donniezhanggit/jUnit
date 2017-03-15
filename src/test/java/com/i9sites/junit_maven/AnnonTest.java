package com.i9sites.junit_maven;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class AnnonTest {
	
	@Rule
	public TemporaryFolder folder = new TemporaryFolder();
	
	
	@BeforeClass
	public static void beforeClassTest(){
		System.out.println("@before Class Executed");
	}
	
	@Before
	public void beforeTest(){
		System.out.println("@before Executed");
	}
	
	@Test
	@Ignore
	public void testOneTest(){
	System.out.println("@Test One");
	}
		
	@Test
	@Ignore
	public void testTwoTest(){
	System.out.println("@Test two");
		
	}
	@AfterClass
	public static void afterClassTest(){
		System.out.println("@after Class Executed");
	}
	
	@After
	public void afterTest(){
		System.out.println("@after Executed");
	}
	@Test(expected = ArithmeticException.class)
	@Ignore
	public void divideIntegerByZero(){
		int number = 10/0;
	}
	
	/*@Test
	public void createFolderRuleTest() throws IOException{
		File folder = this.folder.newFolder("MY_Folder");
		Assert.assertTrue(folder.exists());
	}*/
	
	@Test
	public void createFolderRuleTest(){
		File folder = null;
		try {
			folder = this.folder.newFolder("MY_FOLDER");
			assertTrue(folder.exists());
		} catch (Exception e) {
			assertFalse(folder.exists());
		}
				
	}
	
	

	
}
