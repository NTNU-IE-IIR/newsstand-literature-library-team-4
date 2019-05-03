import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MagazineTest.
 *
 * @author  Team 4: Anders, Johannes, Karl-Oskar 
 * @version 04.01.2019
 */
public class MagazineTest
{
    /**
     * Default constructor for test class MagazineTest
     */
    public MagazineTest()
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
            Magazine magazine1 = new Magazine("test", "test", "test", "test");
            assertEquals("test", magazine1.getTitle());
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
            Magazine magazine1 = new Magazine(null, "test", "test", "test");
            assertEquals("INVALID VALUE", magazine1.getTitle());
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
            Magazine magazine1 = new Magazine("test", "test", "test", "test");
            assertEquals("test", magazine1.getPublisher());
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
            Magazine magazine1 = new Magazine("test name", "1000",  
                                          "test", "test");
            assertEquals("test name", magazine1.getTitle());
            assertEquals("1000", magazine1.getPublisher());
        }
        catch (ValueOutOfRangeException e)
        {
        }
    }
    
}
