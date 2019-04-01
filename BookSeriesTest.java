

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class BookSeriesTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BookSeriesTest
{
    /**
     * Default constructor for test class BookSeriesTest
     */
    public BookSeriesTest()
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
    public void testGetTitle() 
    {
        BookSeries bookSeri1 = new BookSeries("test", "test", "test", "test", 1);
        assertEquals("test", bookSeri1.getTitle());
    }
    
    /**
     * Test that a title can be added, and that the title is correct
     * 
     */
    @Test 
    public void testTitleNeg() 
    {
        BookSeries bookSeri1 = new BookSeries(null, "test", "test", "test", 1);
        assertEquals("INVALID VALUE", bookSeri1.getTitle());
    }    
    
    /**
     * Test that you can add a publisher.
     */
    @Test
    public void testPublisher()
    {
        BookSeries bookSeri1 = new BookSeries("test", "test", "test", "test", 1);
        assertEquals("test", bookSeri1.getPublisher());
    }
    
    /**
     * Test init.
     */
    @Test
    public void testInit()
    {
        BookSeries bookSeri1 = new BookSeries("test name", "1000",
                                              "test", "test", 1);
        assertEquals("test name", bookSeri1.getTitle());
        assertEquals("1000", bookSeri1.getPublisher());
    }
    
}
