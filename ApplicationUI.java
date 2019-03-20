import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Iterator;
import java.util.ArrayList;

/**
 * Makes up the user interface (text based) of the application.
 * Responsible for all user interaction, like displaying the menu
 * and receiving input from the user.
 * 
 * @author Prosjektgruppe_4: Karl-Oskar, Johannes, Anders.
 * @version 2019-03-18.
 */

public class ApplicationUI 
{
 
    // The menu tha will be displayed. Please edit/alter the menu
    // to fit your application (i.e. replace "prodct" with "litterature"
    // etc.
    private String[] menuItems = {
        "1. List all newspapers",
        "2. Add new newspaper",
        "3. Find a newspaper by title",
        "4. Add newspaperdummies to list",
    };

    private LiteratureRegister literatureReg;
    
    /**
     * Creates an instance of the ApplicationUI User interface. 
     */
    public ApplicationUI() 
    {
        this.literatureReg = new LiteratureRegister();
    }

    /**
     * Starts the application by showing the menu and retrieving input from the
     * user.
     */
    public void startApplication() 
    {
        this.init();

        boolean quit = false;

        while (!quit) 
        {
            try 
            {
                int menuSelection = this.showMenu();
                switch (menuSelection) 
                {
                    case 1:
                        this.listAllNewspapers();
                        break;

                    case 2:
                        this.addNewNewspaper();
                        break;

                    case 3:
                        this.findNewspaperByTitle();
                        break;
                        
                    case 4:
                        this.fillLiteratureRegisterWithDummies();
                        break;

                    case 5:
                        System.out.print("\nThank you for using Application");
                        System.out.print("v2019.03.06. Bye!\n");
                        quit = true;
                        break;

                    default:
                }
            } 
            catch (InputMismatchException ime) 
            {
                System.out.println("\nERROR: Please provide a number between" +
                                   "\1 and " + this.menuItems.length + "..\n");
            }
        }        
        
    }

    /**
     * Displays the menu to the user, and waits for the users input. The user is
     * expected to input an integer between 1 and the max number of menu items. 
     * If the user inputs anything else, an InputMismatchException is thrown. 
     * The method returns the valid input from the user.
     *
     * @return the menu number (between 1 and max menu item number) provided 
     * by the user.
     * @throws InputMismatchException if user enters an invalid number/menu 
     * choice
     */
    private int showMenu() throws InputMismatchException 
    {
        System.out.println("\n**** Application v2019.03.06 ****\n");
        // Display the menu
        for ( String menuItem : menuItems )
        {
            System.out.println(menuItem);
        }
        int maxMenuItemNumber = menuItems.length + 1;
        // Add the "Exit"-choice to the menu
        System.out.println(maxMenuItemNumber + ". Exit\n");
        System.out.println("Please choose menu item (1-" + 
                           maxMenuItemNumber + "): ");
        // Read input from user
        Scanner reader = new Scanner(System.in);
        int menuSelection = reader.nextInt();
        if ((menuSelection < 1) || (menuSelection > maxMenuItemNumber)) 
        {
            throw new InputMismatchException();
        }
        return menuSelection;
    }
    
    // ------ The methods below this line are "helper"-methods, 
    // ------ used from the menu ----
    // ------ All these methods are made privat, 
    // ------ since they are only used by the menu ---
    
    /**
     * Initializes the application.
     * Typically you would create the LiteratureRegistrer-instance here
     */
    private void init()
    {
        System.out.println("init() was called"); 
    }

    /**
      * Lists all the products/literature in the register
      * @return the list of all newspaper in the register 
     */
    private void listAllNewspapers()
    { 
        Iterator<Newspaper> newspaperList = this.literatureReg.getIterator();
        if (literatureReg.isLiteratureRegisterEmpty())
        {
            System.out.println("Newspaperlist is empty, " +
                               "please add newspaper to the list!");
        }
        else
        {
            while (newspaperList.hasNext())
            {   
                Newspaper newspaper = newspaperList.next();
            
                System.out.println("Title: " + newspaper.getTitle() +
                                   "\nPublisher: " + newspaper.getPublisher()
                                   + "Genre: " + newspaper.getGenre() +
                                   "No of times published: " 
                                   + newspaper.getTimesPublished()
                                   + "\n");
            }   
        }
    }
    
    /**
     * Add a new product/literature to the register.
     * In this method you have to add code to ask the
     * user for the necessary information you need to 
     * create an instance of the product, which you
     * then send as a parameter to the addNewspaper()-
     * method of the register.
     * Remember to also handle invalid input from the
     * user!!
     */
    void addNewNewspaper()
    {
        // Brukeren har nå valgt å legge til en avis
        System.out.println("Please enter the title of the newspaper: ");
        Scanner reader = new Scanner(System.in);
        String title = reader.nextLine();
        
        System.out.println("Please enter the publisher of the newspaper: ");
        String publisher = reader.nextLine();
        
        System.out.println("Please enter the genre of the newspaper: ");
        String genre = reader.nextLine();
        
        System.out.println("Please enter the number of publishes " 
                           + "of the newspaper: ");
        String timesPublished = reader.nextLine();
        

        // Legg inn avisa i registeret
        Newspaper newspaper = new Newspaper(title, publisher, 
                                            genre, timesPublished);
        this.literatureReg.addNewspaper(newspaper);

    }
  

    /**
     * Find and display a product based om name (title).
     * As with the addNewProduct()-method, you have to
     * ask the user for the string (name/title/publisher)
     * to search for, and then use this string as input-
     * parameter to the method in the register-object.
     * Then, upon return from the register, you need
     * to print the details of the found item.  
     */
    void findNewspaperByTitle()
    {
        System.out.println("Please enter the title of the newspaper: ");
        Scanner reader = new Scanner(System.in);
        String title = reader.nextLine();   
       
        ArrayList<Newspaper> foundNewspapers = 
                                 this.literatureReg.findNewspaperByTitle(title);
        
        if (foundNewspapers.isEmpty())
        {
            System.out.println("Could not find any newspaper with this title.");
            System.out.println();
        }
        else
        {
            for (Newspaper newspaper : foundNewspapers)
            {
                System.out.println("Title: " + newspaper.getTitle() 
                                   + "Publisher: " + newspaper.getPublisher()
                                   + "Genre: " + newspaper.getGenre()
                                   + "No of times published: "
                                   + newspaper.getTimesPublished()
                                   + "\n ");
            }

        }
    }
    
    /**
     * Fills the literatureregister with dummies for testing.
     */
    void fillLiteratureRegisterWithDummies()
    {
        this.literatureReg.addNewspaper(new Newspaper
        ("DB", "Dagbladet", "News", "52 times a year, Once a week"));
        this.literatureReg.addNewspaper(new Newspaper
        ("VG", "Verdens Gang", "News", "52 times a year, Once a week"));
        this.literatureReg.addNewspaper(new Newspaper
        ("ITavisen", "Itavisen", "News", "52 times a year, Once a week"));
        this.literatureReg.addNewspaper(new Newspaper
        ("SMP", "Sunnmørsposten", "News", "104 times a year, Twice a week"));
        this.literatureReg.addNewspaper(new Newspaper
        ("SMP", "Sunnmørsposten", "News", "104 times a year, Twice a week"));
    }
}
