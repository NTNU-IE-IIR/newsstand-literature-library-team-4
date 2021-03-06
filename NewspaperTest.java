

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class NewspaperTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class NewspaperTest
{
    /**
     * Default constructor for test class NewspaperTest
     */
    public NewspaperTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
         
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    /**
     * Test that a comment can be added, and that the comment is correct
     * 
     */
    @Test 
    public void testTitle() 
    {
       Newspaper newspaper1 = new Newspaper("test","test","test","test");
       assertEquals("test", newspaper1.getTitle());
    }
    
    
    /**
     * Test that a comment can be added, and that the comment is correct
     * 
     */
    @Test 
    public void testTitleNeg() 
    {
       Newspaper newspaper1 = new Newspaper(null,"test","test","test");
       assertEquals("INVALID VALUE", newspaper1.getTitle());
    }    
    
    @Test
    public void testPublisher()
    {
       Newspaper newspaper1 = new Newspaper("test", "test", "test", "test");
       assertEquals("test", newspaper1.getPublisher());
    }
    
    @Test
    public void testInit()
    {
        Newspaper newspaper1 = new Newspaper("test name", "test", "test", "test");
        assertEquals("test name", newspaper1.getTitle());
        assertEquals(1000, newspaper1.getPublisher());
    }
}