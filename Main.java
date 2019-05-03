
/**
 * The Main-class of the application. This class only holds the main()-method
 * to start the application.
 * 
 * @author Prosjektgruppe_4: Karl-Oskar, Johannes, Anders.
 * @version 2019-05-01.
 */
public class Main 
{
    /**
     * The main entry for the application.
     * @param args arguments provided during startup of the application
     */
    public static void main(String[] args)
    {
        try
        {
            ApplicationUI appUI = new ApplicationUI();
            appUI.startApplication();
        }
        catch (ValueOutOfRangeExcpection e)
        {
            System.out.println("Something went wrong. Please contact costumer service!");
        }
    }
}
