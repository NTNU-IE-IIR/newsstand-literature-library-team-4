import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 * Tests class NewspaperTest.
 *
 * @author Prosjektgruppe_4: Karl-Oskar, Johannes, Anders.
 * @version 2019.03.18.
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
        try
        {
            Newspaper newspaper1 = new Newspaper("test", "test", "test", "test");
            assertEquals("test", newspaper1.getTitle());
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
            Newspaper newspaper1 = new Newspaper(null, "test", "test", "test");
            assertEquals("INVALID VALUE", newspaper1.getTitle());
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
            Newspaper newspaper1 = new Newspaper("test", "test", "test", "test");
            assertEquals("test", newspaper1.getPublisher());
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
            Newspaper newspaper1 = new Newspaper("test name", "test publisher", 
                                                 "test", "te    st");
            assertEquals("test name", newspaper1.getTitle());
            assertEquals("test publisher", newspaper1.getPublisher());
        }
        catch (ValueOutOfRangeException e)
        {
        }
    }
}