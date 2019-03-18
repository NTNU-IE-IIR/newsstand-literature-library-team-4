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
 * @author Prosjektgruppe_4: Karl-Oskar, Johannes, Anders.
 * @version 2019-03-18.
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
     * Method for finding newspapers in literature by name.
     * @param title The title of newspapers.
     * @return the title of the newspapers.
     */
    public ArrayList<Newspaper> findNewspaperByTitle(String title)
    {
        ArrayList<Newspaper> foundNewspapers = new ArrayList<>();

        Iterator<Newspaper> it = this.newspaperList.iterator();
        while (it.hasNext())
        {
            Newspaper p = it.next();
            if (p.getTitle().equalsIgnoreCase(title))
            {
                foundNewspapers.add(p);
            }
        }

        return foundNewspapers;
    }

    /**
     * Method for finding newspapers in literature by publisher.
     * @param publisher The publisher of newspapers.
     * @return the title of the newspapers.
     */
    public ArrayList<Newspaper> findNewspaperByPublisher(String publisher)
    {
        ArrayList<Newspaper> foundNewspapers = new ArrayList<>();       

        Iterator<Newspaper> it = this.newspaperList.iterator();
        while (it.hasNext())
        {
            Newspaper p = it.next();
            if (p.getPublisher().equalsIgnoreCase(publisher))
            {
                foundNewspapers.add(p);
            }
        }

        return foundNewspapers;
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
        this.newspaperList.add(new Newspaper
        ("SMP", "Sunnmørsposten", "News", "104 times a year, Twice a week"));
    }

    /**
     * Show a list of all the newspapers in the collection.
     */
    public ArrayList<Newspaper> listAllNewspapers()
    {
        Iterator<Newspaper> it = this.newspaperList.iterator();
        ArrayList<Newspaper> foundNewspapers = new ArrayList<>();
        while (it.hasNext())
        {
            Newspaper newspaper = it.next();
            foundNewspapers.add(newspaper);
        }
        return foundNewspapers;
    }
    
    public Iterator<Newspaper> getIterator()
    {
        return this.newspaperList.iterator();
    }
    
    public boolean isLiteratureRegisterEmpty()
    {
        if(newspaperList.size() == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
}