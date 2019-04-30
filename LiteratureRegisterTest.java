import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the class LiteratureRegisterTest.
 *
 * @author Prosjektgruppe_4: Karl-Oskar, Johannes, Anders.
 * @version 2019.03.18.
 */
public class LiteratureRegisterTest
{
    /**
     * Default constructor for test class LiteratureRegisterTest
     */
    public LiteratureRegisterTest()
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
    
    //addNewspaper(null);
     /**
     * Test that a newspaper can be added, and that the title is correct
     * 
     */
     @Test 
    public void testAddNewspaper() 
    {
        LiteratureRegister literatu1 = new LiteratureRegister();
        Literature newspape1 = new Newspaper("test", "test", "test", "test");
        literatu1.addLiterature(newspape1);
    }
    
    /**
     * Test the method of finding newspapers by title.
     */
    @Test
    public void testFindNewspaperByTitle()
    {
        LiteratureRegister literatu1 = new LiteratureRegister();
        Newspaper newspape1 = new Newspaper("test name", "test", "test", "test");
        literatu1.addLiterature(newspape1);
        assertSame("test name", newspape1.getTitle());
    }
    
    /**
     * Test the method of finding newspapers by title.
     */
    @Test
    public void testFindNewspaperByTitleNeg()
    {
        LiteratureRegister literatu1 = new LiteratureRegister();
        Newspaper newspape1 = new Newspaper(null, "test", "test", "test");
        literatu1.addLiterature(null);
        assertEquals("INVALID VALUE", newspape1.getTitle());
    }
}

