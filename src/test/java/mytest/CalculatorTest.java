package mytest;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import myapp1.Calculator;

import static org.junit.Assert.*;

public class CalculatorTest {

    private static Calculator calculator; // Shared instance for all tests
    private int testCounter; // Instance variable for tracking individual test runs

    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("@BeforeClass: This runs once before any tests in the class.");
        calculator = new Calculator(); // Initialize the Calculator instance once
    }

    @AfterClass
    public static void tearDownAfterClass() {
        System.out.println("@AfterClass: This runs once after all tests in the class are finished.");
        calculator = null; // Clean up resources
    }

    @Before
    public void setUp() {
        System.out.println("@Before: This runs before each test method.");
        testCounter++; // Increment the counter for each test
        System.out.println("Current test count: " + testCounter);
    }

    @After
    public void tearDown() {
        System.out.println("@After: This runs after each test method.");
        System.out.println("Test method finished.");
    }

    @Test
    public void testAdd() {
        System.out.println("  @Test: Running testAdd()");
        int result = calculator.add(5, 3);
        assertEquals(8, result);
    }

    @Test
    public void testSub() {
        System.out.println("  @Test: Running testSub()");
        int result = calculator.sub(10, 4);
        assertEquals(6, result);
    }
}



