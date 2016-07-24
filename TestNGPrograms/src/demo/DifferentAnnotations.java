package demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DifferentAnnotations {
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("@BeforeMethod will execute befre every @Test");
	}
	
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("@AfterMethod will execute after every @Test");
	}
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("@BeforeClass will always execute prior to @BeforeMethod and @Test");
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("@AfterClass will always execute later to @AfterMethod and @Test");
	}
	
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("@BeforeTest will always execute prior to @BeforeClass, @BeforeMethod @Test");
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("@AfterTest will always execute later to @AfterClass, @AfterMethod @Test");
	}
	
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("@BeforeSuite will always execute prior to all annotations or tests in the suite");
	}
	
	@AfterSuite
	public void afterSuite(){
		System.out.println("@AfterSuite will always execute later to all annotations or tests in the suite");
	}
	
	
	@Test(priority=1)
	public void testCase1(){
		System.out.println("Inside test case 1");
	}
	
	@Test(priority=0)
	public void testCase2(){
		System.out.println("Inside test case 2");
	}
	

}
