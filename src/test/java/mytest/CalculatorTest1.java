package mytest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import myapp1.Calculator;



/*This Test Include Commonly used Annotation of Junit4
 *It is testing example1.Calculator.Java Class */
public class CalculatorTest1 {
	// This setup runs once before all tests in the class
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Executing @BeforeClass: Setup for the entire test class.");
        // Example: Initialize a database connection or a shared resource
    }

    // This setup runs before each test method
    @Before
    public void setUp() {
        System.out.println("Executing @Before: Setup for a single test method.");
        // Example: Initialize test data or objects for each test
    }
	@Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 3);
        assertEquals(8, result); // Assert that 8 is the expected result
        System.out.println("Add method of Calculator Class is tested");
    }
	// This test method will be ignored during execution
    @Ignore("This test is currently under development")
    @Test
    public void testIgnoredFeature() {
        System.out.println("Executing @Test: testIgnoredFeature() - This should not be printed if ignored.");
        fail("This test should not run.");
    }

    // This tear down runs after each test method
    @After
    public void tearDown() {
        System.out.println("Executing @After: Teardown for a single test method.");
        // Example: Clean up resources after each test
    }

    // This tear down runs once after all tests in the class
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Executing @AfterClass: Teardown for the entire test class.");
        // Example: Close database connections or shared resources
    }

}
