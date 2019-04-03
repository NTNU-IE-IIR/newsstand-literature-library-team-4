import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TabloidTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TabloidTest
{
    /**
     * Default constructor for test class TabloidTest
     */
    public TabloidTest()
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
        Tabloid Tabloid1 = new Tabloid("test", "test", "test", "test");
        assertEquals("test", Tabloid1.getTitle());
    }
    
    /**
     * Test that a title can be added, and that the title is correct
     * 
     */
    @Test 
    public void testTitleNeg() 
    {
        Tabloid Tabloid1 = new Tabloid(null, "test", "test", "test");
        assertEquals("INVALID VALUE", Tabloid1.getTitle());
    }    
    
    /**
     * Test that you can add a publisher.
     */
    @Test
    public void testPublisher()
    {   Tabloid Tabloid1 = new Tabloid("test", "test", "test", "test");
        assertEquals("test", Tabloid1.getPublisher());
    }
    
    /**
     * Test init.
     */
    @Test
    public void testInit()
    {
        Tabloid Tabloid1 = new Tabloid("test name", "1000",
                              "test", "test");
        assertEquals("test name", Tabloid1.getTitle());
        assertEquals("1000", Tabloid1.getPublisher());
    }
    
}
