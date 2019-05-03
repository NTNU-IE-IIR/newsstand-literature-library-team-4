

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class BookTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BookTest
{
    /**
     * Default constructor for test class BookTest
     */
    public BookTest()
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
        try
        {
            Book book1 = new Book("test", "test", "test", 1);
            assertEquals("test", book1.getTitle());
        }
        catch (ValueOutOfRangeException e)
        {
        }
    }
    
    /**
     * Test that a title can be added, and that the title is correct
     * 
     */
    @Test 
    public void testTitleNeg() 
    {
        try
        {
            Book book1 = new Book(null, "test", "test", 1);
            assertEquals("INVALID VALUE", book1.getTitle());
        }
        catch (ValueOutOfRangeException e)
        {
        }
    }    
    
    /**
     * Test that you can add a publisher.
     */
    @Test
    public void testPublisher()
    {   
        try
        {
            Book book1 = new Book("test", "test", "test", 1);
            assertEquals("test", book1.getPublisher());
        }
        catch (ValueOutOfRangeException e)
        {
        }
    }
    
    /**
     * Test init.
     */
    @Test
    public void testInit()
    {
        try
        {
            Book book1 = new Book("test name", "1000",
                                  "test", 1);
            assertEquals("test name", book1.getTitle());
            assertEquals("1000", book1.getPublisher());
        }
        catch (ValueOutOfRangeException e)
        {
        }
    }
}
