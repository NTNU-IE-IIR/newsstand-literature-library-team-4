import java.util.ArrayList;
import java.util.Iterator;

/**
 * Represents a register, holding a collection of
 * different books, newspapers and magazines.
 * 
 * For this register you can:
 * Add books, newspaper and magazines.
 * Remove books, newspaper and magazines.
 * Find books, newspaper and magazines in the shop by author.
 * Find books, newspaper and magazines in the shop by title.
 * Find books, newspaper and magazines in the shop by publisher.
 * List the complete inventory.
 * 
 * @author Prosjektgruppe 4.
 * @version 2019-02-06
 */
public class LiteratureRegister
{
    // An ArrayList for storing newspaper.
    private ArrayList<Newspaper> newspaperList;

    /**
     * Constructor for objects of class LiteratureRegister
     */
    public LiteratureRegister()
    {
        this.newspaperList = new ArrayList<Newspaper>(); 
    }

    /**
     * Method for adding newspaper in Literature register.
     * @param newspaper The title of the newspaper
     */
    public void addNewspaper(Newspaper newspaper)
    {
        this.newspaperList.add(newspaper);
    }

    /**
     * Method for finding newspaper in literature by name.
     * @param title The title of newspaper.
     * @return the title of the newspaper.
     */
    public Newspaper findNewspaperByTitle(String title)
    {
        Newspaper foundNewspaper = null;

        boolean found = false;
        Iterator<Newspaper> it = this.newspaperList.iterator();
        while (it.hasNext() && !found)
        {
            Newspaper p = it.next();
            if (p.getTitle().equalsIgnoreCase(title))
            {
                foundNewspaper = p;
                found = true;
            }
        }

        return foundNewspaper;
    }

    /**
     * Method for finding newspaper in literature by publisher.
     * @param publisher The publisher of newspaper.
     * @return the title of the newspaper
     */
    public Newspaper findNewspaperByPublisher(String publisher)
    {
        Newspaper foundNewspaper = null;

        boolean found = false;
        Iterator<Newspaper> it = this.newspaperList.iterator();
        while (it.hasNext() && !found)
        {
            Newspaper p = it.next();
            if (p.getPublisher().equalsIgnoreCase(publisher))
            {
                foundNewspaper = p;
                found = true;
            }
        }

        return foundNewspaper;
    }

    /**
     * Remove a newspaper from the collection.
     * @param index The index of the newspaper to be removed.
     */
    public void removeNewspaper(int index)
    {
        if (indexValid(index)) 
        {
            newspaperList.remove(index);
        }
    }

    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean indexValid(int index)
    {
        // The return value.
        // Set according to whether the index is valid or not.
        boolean valid;

        if (index < 0) 
        {
            System.out.println("Index cannot be negative: " + index);
            valid = false;
        }
        else if (index >= newspaperList.size()) 
        {
            System.out.println("Index is too large: " + index);
            valid = false;
        }
        else 
        {
            valid = true;
        }
        return valid;
    }

    /**
     * Test method to check if the literature register works.
     */
    public void fillLiteratureRegisterWithDummies()
    {
        this.newspaperList.add(new Newspaper
        ("DB", "Dagbladet", "News", "52 times a year, Once a week"));
        this.newspaperList.add(new Newspaper
        ("VG", "Verdens Gang", "News", "52 times a year, Once a week"));
        this.newspaperList.add(new Newspaper
        ("ITavisen", "Itavisen", "News", "52 times a year, Once a week"));
        this.newspaperList.add(new Newspaper
        ("SMP", "Sunnmørsposten", "News", "104 times a year, Twice a week"));
    }

    /**
     * Show a list of all the newspapers in the collection.
     */
    public void listAllNewspapers()
    {
        System.out.println("Newspaper listing: ");

        for (Newspaper newspaper : newspaperList) 
        {
            System.out.println(newspaper.getDetails());
        }
        System.out.println();
    }
    
}
