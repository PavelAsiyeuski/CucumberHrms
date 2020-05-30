package com.class03;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GroupsDemo {

	@BeforeClass (alwaysRun=true)
	public void beforeClass() {
		System.out.println("Before Class");
	}
	@AfterClass (alwaysRun=true)
	public void afterClass() {
		System.out.println("After Class");
	}
	
	
	@Test (dependsOnGroups= {"smoke"})
	public void test1() {
		System.out.println("Test 1");
	}
	@Test(groups="smoke")
	public void test2() {
		System.out.println("Test 2");
	}
	@Test(groups= {"regression"})
	public void test3() {
		System.out.println("Test 3");
	}
	@Test(groups= {"smoke","regression"})
	public void test4() {
		System.out.println("Test 4");
	}
	@Test
	public void test5() {
		System.out.println("Test 5");
	}
	
}
