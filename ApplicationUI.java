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
            "1. Add new newspaper",
            "2. Add new magazine",
            "3. Add new tabloid",
            "4. Add new book",
            "5. Add new bookserie",
            "6. Find literature by title",
            "7. Find literature by publisher",
            "8. List all literature",
            "9. Add literature dummies to list",
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
                    this.addNewNewspaper();
                    break;

                    case 2:
                    this.addNewMagazine();
                    break;

                    case 3:
                    this.addNewTabloid();
                    break;

                    case 4:
                    this.addNewBook();
                    break;

                    case 5:
                    this.addNewBookSeries();
                    break;

                    case 6:
                    this.findLiteratureByTitle();
                    break;

                    case 7:
                    this.findLiteratureByPublisher();
                    break;

                    case 8:
                    this.listAllLiterature();
                    break;

                    case 9:
                    this.fillLiteratureRegisterWithDummies();
                    break;

                    case 10:
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

        System.out.println("Please enter the literaturetype: ");
        String literatureType = reader.nextLine();

        System.out.println("Please enter the number of publishes " 
            + "of the newspaper: ");
        String timesPublished = reader.nextLine();

        // Legg inn avisa i registeret
        Literature literature = new Newspaper(title, publisher, 
                literatureType, timesPublished);
        this.literatureReg.addLiterature(literature);

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
    void addNewMagazine()
    {
        // Brukeren har nå valgt å legge til en avis
        System.out.println("Please enter the title of the magazine: ");
        Scanner reader = new Scanner(System.in);
        String title = reader.nextLine();

        System.out.println("Please enter the publisher of the magazine: ");
        String publisher = reader.nextLine();

        System.out.println("Please enter the literaturetype: ");
        String literatureType = reader.nextLine();

        System.out.println("Please enter the genre of the magazine ");
        String genre = reader.nextLine();

        // Legg inn avisa i registeret
        Literature literature = new Magazine(title, publisher, 
                literatureType, genre);
        this.literatureReg.addLiterature(literature);
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
    void addNewTabloid()
    {
        // Brukeren har nå valgt å legge til en avis
        System.out.println("Please enter the title of the tabloid: ");
        Scanner reader = new Scanner(System.in);
        String title = reader.nextLine();

        System.out.println("Please enter the publisher of the magazine: ");
        String publisher = reader.nextLine();

        System.out.println("Please enter the literaturetype: ");
        String literatureType = reader.nextLine();

        System.out.println("Please enter the number of publishes " 
            + "of the tabloid: ");
        String timesPublished = reader.nextLine();

        // Legg inn avisa i registeret
        Literature literature = new Magazine(title, publisher, 
                literatureType, timesPublished);
        this.literatureReg.addLiterature(literature);
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
    void addNewBook()
    {
        // Brukeren har nå valgt å legge til en avis
        System.out.println("Please enter the title of the book: ");
        Scanner reader = new Scanner(System.in);
        String title = reader.nextLine();

        System.out.println("Please enter the publisher of the book: ");
        String publisher = reader.nextLine();

        System.out.println("Please enter the author of this book: ");
        String author = reader.nextLine();

        System.out.println("Please enter the bookedition: ");
        int bookEdition = reader.nextInt();

        // Legg inn avisa i registeret
        Literature literature = new Book(title, publisher, 
                author, bookEdition);
        this.literatureReg.addLiterature(literature);

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
    void addNewBookSeries()
    {
        // Brukeren har nå valgt å legge til en avis
        System.out.println("Please enter the title of the bookseries: ");
        Scanner reader = new Scanner(System.in);
        String title = reader.nextLine();

        System.out.println("Please enter the publisher of the bookseries: ");
        String publisher = reader.nextLine();

        System.out.println("Please enter the title of the book serie: ");
        String bookSeriesTitle = reader.nextLine();

        System.out.println("Please enter the number of books in the serie");
        int numberOfBooks = reader.nextInt();

        // Legg inn avisa i registeret
        Literature literature = new BookSeries(title, publisher, 
                bookSeriesTitle, numberOfBooks);
        this.literatureReg.addLiterature(literature);
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
    void findLiteratureByTitle()
    {
        System.out.println("Please enter the title of the literature: ");
        Scanner reader = new Scanner(System.in);
        String title = reader.nextLine();

        ArrayList<Literature> foundLiterature =
            this.literatureReg.findLiteratureByTitle(title);

        if (foundLiterature.isEmpty())
        {
            System.out.println("Could not find any literature with this title.");
            System.out.println();
        }
        else
        {
            System.out.println();
            System.out.println("Literature found:");
            for (Literature literature : foundLiterature)
            {
                printInformation(literature);
            }

        }
    }

    /**
     * Finds the literature by publisher.
     * The user-entered text into the interface is the searchword
     * This text is not case sensitive
     */
    private void findLiteratureByPublisher()
    {
        System.out.println("Please enter the publisher of the literature: ");
        Scanner reader = new Scanner(System.in);
        String publisher = reader.nextLine();

        ArrayList<Literature> foundLiterature =
            this.literatureReg.findLiteratureByPublisher(publisher);

        if (foundLiterature.isEmpty())
        {
            System.out.println("Could not find any literature with this publisher.");
            System.out.println();
        }
        else
        {
            System.out.println();
            System.out.println("Literature found:");
            for (Literature literature : foundLiterature)
            {
                printInformation(literature);

            }

        }
    }

    /**
     * Prints the relevant information about the literature
     * @param literature is the literature which should have the information printed.
     */
    private void printInformation(Literature literature) {
        if (literature instanceof Newspaper) {
            Newspaper newspaper = (Newspaper) literature;
            printLiteratureInformation(newspaper);
            System.out.println("Literaturetype: " + newspaper.getLiteratureType() +
                "\nTimespublished: " + newspaper.getTimesPublished()
                + "\n");
        }

        if (literature instanceof Magazine) {
            Magazine magazine = (Magazine) literature;
            printLiteratureInformation(magazine);
            System.out.println("Literaturetype: " + magazine.getLiteratureType() +
                "\nGenre: " + magazine.getGenre()
                + "\n");
        }

        if (literature instanceof Tabloid) {
            Tabloid tabloid = (Tabloid) literature;
            printLiteratureInformation(tabloid);
            System.out.println("Literaturetype: " + tabloid.getLiteratureType() +
                "\nTimespublished: " + tabloid.getTimesPublished()
                + "\n");
        }

        if (literature instanceof Book) {
            Book book = (Book) literature;
            printLiteratureInformation(book);
            System.out.println("Author: " + book.getAuthor() +
                "\nBookediton: " + book.getBookEdition()
                + "\n");
        }

        if (literature instanceof BookSeries) {
            BookSeries bookserie = (BookSeries) literature;
            printLiteratureInformation(bookserie);
            System.out.println("Title of the serie: " + bookserie.getBookSeriesTitle() +
                "\nNumber of books: " + bookserie.getNumberOfBooks()
                + "\n");
        }
    }

    /**
     * Lists all the products/literature in the register
     * @return the list of all newspaper in the register 
     */
    private void listAllLiterature()
    { 
        Iterator<Literature> literatureList = this.literatureReg.getIterator();
        if (literatureReg.isLiteratureRegisterEmpty())
        {
            System.out.println("Literaturelist is empty, " +
                "please add any literature to the list!");
        }
        else
        {
            System.out.println();
            System.out.println("List of all literature:");
            while (literatureList.hasNext())
            {   
                Literature literature = literatureList.next();

                printInformation(literature);

            }   
        }
    }

    /**
     * Prints the general information about the literature.
     * This information is common for all literature in the register.
     * @param literature is the literature to be printed information about.
     */
    private void printLiteratureInformation(Literature literature)
    {
        System.out.println("Title: " + literature.getTitle() +
            "\nPublisher: " + literature.getPublisher());
    }

    /**
     * Fills the literatureregister with dummies for testing.
     */
    void fillLiteratureRegisterWithDummies()
    {
        this.literatureReg.addLiterature(new Newspaper
            ("DB", "Dagbladet", "News", "52 times a year, Once a week"));
        this.literatureReg.addLiterature(new Newspaper
            ("VG", "Verdens Gang", "News", "52 times a year, Once a week"));
        this.literatureReg.addLiterature(new Newspaper
            ("ITavisen", "Itavisen", "News", "52 times a year, Once a week"));
        this.literatureReg.addLiterature(new Newspaper
            ("SMP", "Sunnmørsposten", "News", "104 times a year, Twice a week"));
        this.literatureReg.addLiterature(new Magazine
            ("Teknisk Ukeblad", "TU Media", "Magazine", "Technology"));
        this.literatureReg.addLiterature(new BookSeries ("Mystery Chamber", "Bloomsburry",
                "Harry Potter", 8));
        this.literatureReg.addLiterature(new Book ("Snømannen", "Aschehoug","Jo Nesbø",
                3));
    }
}
