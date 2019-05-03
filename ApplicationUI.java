    import java.util.InputMismatchException;
    import java.lang.IllegalArgumentException;
    import java.util.Scanner;
    import java.util.Iterator;
    import java.util.ArrayList;
    
    /**
     * Makes up the user interface (text based) of the application.
     * Responsible for all user interaction, like displaying the menu
     * and receiving input from the user.
     * 
     * @author Prosjektgruppe_4: Karl-Oskar, Johannes, Anders.
     * @version 2019-05-01.
     */
    
    public class ApplicationUI
    {
    
        // The menu that will be displayed.
        private String[] menuItems = {
                "1. Add new newspaper",
                "2. Add new magazine",
                "3. Add new tabloid",
                "4. Add new book",
                "5. Add new bookserie",
                "6. Find literature by title",
                "7. Find literature by publisher",
                "8. List all literature",
                "9. Remove literature from register",
                "10. Add literaturedummies to list",
            };
    
        private LiteratureRegister literatureReg;
    
        /**
         * Creates an instance of the ApplicationUI User interface. 
         */
        public ApplicationUI() throws ValueOutOfRangeException
        {
            this.literatureReg = new LiteratureRegister();
        }
    
        /**
         * Starts the application by showing the menu and retrieving input from the
         * user.
         */
        public void startApplication() 
        {
            boolean quit = false;
            int maxMenuItemNumber = menuItems.length + 1;
    
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
                        this.removeLiterature();
                        break;
                        
    
                        case 10:
                        this.fillLiteratureRegisterWithDummies();
                        break;
    
                        case 11:
                        System.out.print("\nThank you for using Application");
                        System.out.print(" v2019.05.01. Bye!\n");
                        quit = true;
                        break;
    
                        default:
                    }
                } 
                catch (InputMismatchException ime) 
                {
                    System.out.println("\nERROR: Please provide a number between" +
                        " 1 and " + maxMenuItemNumber + "..\n");
                }
                catch (IllegalArgumentException e)
                {
                    System.out.println("\nERROR: Illegal input used!");
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
            System.out.println("\n**** Application v2019.05.01 ****\n");
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
        // ------ All these methods are made private, 
        // ------ since they are only used by the menu ---
    
        /**
         * Add a new newspaper to the register.
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
            try
            {
                //The user has chosen to add a newspaper.
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
    
                //Adds the newspaper to the register.
                Literature literature = new Newspaper(title, publisher, 
                        literatureType, timesPublished);
                this.literatureReg.addLiterature(literature);
    
                System.out.println("The newspaper " + title + " has been added to the register."
                    + "\n");
            }
            catch (IllegalArgumentException e)
            {
                System.out.println("\nERROR: Wrong inputs provided for Title ....");
            }
    
            catch (ValueOutOfRangeException e)
            {
                System.out.println("Title, publisher, literaturetype or "
                    + "number of publishes per year was out of range");
                System.out.println("Add newspaper was canceled." + "\n");
    
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
    void addNewMagazine()
    {
        try
        {
            //The user has chosen to add a magazine.
            System.out.println("Please enter the title of the magazine: ");
            Scanner reader = new Scanner(System.in);
            String title = reader.nextLine();
    
            System.out.println("Please enter the publisher of the magazine: ");
            String publisher = reader.nextLine();
    
            System.out.println("Please enter the literaturetype: ");
            String literatureType = reader.nextLine();
    
            System.out.println("Please enter the genre of the magazine ");
            String genre = reader.nextLine();
    
            //Adds the magazine to the register.
            Literature literature = new Magazine(title, publisher, 
                    literatureType, genre);
            this.literatureReg.addLiterature(literature);
        }
        catch (ValueOutOfRangeException e)
        {
            System.out.println("Title, publisher, literaturtype or "
                + "genre was out of range");
            System.out.println("Add tabloid was canceled." + "\n");
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
    void addNewTabloid()
    {
        try
        {
            //The user has chosen to add a tabloid.
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
    
            //Adds the tabloid to the register.
            Literature literature = new Magazine(title, publisher, 
                    literatureType, timesPublished);
            this.literatureReg.addLiterature(literature);
        }
        catch (ValueOutOfRangeException e)
        {
            System.out.println("Title, publisher, literaturtype or "
                + "number of publishes was out of range");
            System.out.println("Add tabloid was canceled." + "\n");
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
    void addNewBook()
    {
        try
        {
            //The user has chosen to add a book.
            System.out.println("Please enter the title of the book: ");
            Scanner reader = new Scanner(System.in);
            String title = reader.nextLine();

            System.out.println("Please enter the publisher of the book: ");
            String publisher = reader.nextLine();

            System.out.println("Please enter the author of this book: ");
            String author = reader.nextLine();

            System.out.println("Please enter the bookedition: ");
            int bookEdition = reader.nextInt();

            //Adds the book to the register.
            Literature literature = new Book(title, publisher, 
                                             author, bookEdition);
            this.literatureReg.addLiterature(literature);
        }
        catch (ValueOutOfRangeException e)
        {
            System.out.println("Title, publisher, author or "
                + "number of book edition was out of range");
            System.out.println("Add book was canceled." + "\n");
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
    void addNewBookSeries()
    {
        try
        {
            //The user has chosen to add a bookseries.
            System.out.println("Please enter the title of the bookseries: ");
            Scanner reader = new Scanner(System.in);
            String title = reader.nextLine();

            System.out.println("Please enter the publisher of the bookseries: ");
            String publisher = reader.nextLine();

            System.out.println("Please enter the title of the book serie: ");
            String bookSeriesTitle = reader.nextLine();

            System.out.println("Please enter the number of books in the serie");
            int numberOfBooks = reader.nextInt();

            //Adds the bookseries to the register.
            Literature literature = new BookSeries(title, publisher, 
                    bookSeriesTitle, numberOfBooks);
            this.literatureReg.addLiterature(literature);

            System.out.println("The bookseries " + title + " has been added to the register."
                + "\n");
        }
        catch (ValueOutOfRangeException e)
        {
            System.out.println("Title, publisher, title of the bookseries or "
                + "number of books was out of range");
            System.out.println("Add bookseries was canceled." + "\n");
        }
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
            System.out.println("List of all literature:"
                + "\n");
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

    void removeLiterature()
    {
        System.out.println("Please enter the title of the literature you wish to remove: ");
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
            
            System.out.println("Are you sure you want to delete the found literature?");
            System.out.println("Please answer <yes> to confirm, or any other input to abort!");
            Scanner reader2 = new Scanner(System.in);
            String answer = reader2.nextLine();
           
            if(answer.equalsIgnoreCase("yes"))
            {
                for (Literature literature : foundLiterature)
                {
                    this.literatureReg.removeLiterature(literature);
                }
                System.out.println("Literature has been deleted!");
            }
            else
            {
                System.out.println("Deletion of literature aborted!");
            }

        }
    }

    /**
     * Fills the literatureregister with dummies for testing.
     */
    void fillLiteratureRegisterWithDummies()
    {
        try
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
        catch (ValueOutOfRangeException e)
        {
            //Just leave it..... Ikke skriv dette!! Aldri, dette er et untak pga dummies
        }
    }
}
