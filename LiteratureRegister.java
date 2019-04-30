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

    //An arraylist for the Literature superclass,
    private ArrayList<Literature> literatureList;

    /**
     * Constructor for objects of class LiteratureRegister
     */
    public LiteratureRegister()
    {
        this.literatureList = new ArrayList<Literature>();
    }

    /**
     * Method for adding literature to the literature register
     * param literature is the literature to be added to the list
     */
    public void addLiterature(Literature literature)
    {
        this.literatureList.add(literature);
    }

    /**
     * Method for finding literature by name.
     * @param title The title of literature.
     * @return the title of the literature.
     */
    public ArrayList<Literature> findLiteratureByTitle(String title)
    {
        ArrayList<Literature> foundLiterature = new ArrayList<Literature>();

        Iterator<Literature> it = this.literatureList.iterator();
        while (it.hasNext())
        {
            Literature l = it.next();
            if (l.getTitle().equalsIgnoreCase(title))
            {
                foundLiterature.add(l);
            }
        }

        return foundLiterature;
    }

    /**
     * Method for finding literature by publisher.
     * @param publisher The publisher of literature.
     * @return the title of the literature.
     */
    public ArrayList<Literature> findLiteratureByPublisher(String publisher)
    {
        ArrayList<Literature> foundLiterature = 
            new ArrayList<Literature>();       

        Iterator<Literature> it = this.literatureList.iterator();
        while (it.hasNext())
        {
            Literature l = it.next();
            if (l.getPublisher().equalsIgnoreCase(publisher))
            {
                foundLiterature.add(l);
            }
        }

        return foundLiterature;
    }

    /**
     * Remove a literature from the collection, if the index used is valid.
     * @param index The index of the literature to be removed.
     */
    public void removeLiterature(int index)
    {
        if (indexValid(index)) 
        {
            literatureList.remove(index);
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
        else if (index >= literatureList.size()) 
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
     * Show a list of all the literature in the collection.
     * 
    @return List of all literature.
     */
    public ArrayList<Literature> listAllLiterature()
    {
        Iterator<Literature> it = this.literatureList.iterator();
        ArrayList<Literature> foundLiterature = new ArrayList<Literature>();
        while (it.hasNext())
        {
            Literature literature = it.next();
            foundLiterature.add(literature);
        }
        return foundLiterature;
    }

    /**
     * Getting the iterator.
    @return literature list Iterator.
     */
    public Iterator<Literature> getIterator()
    {
        return this.literatureList.iterator();
    }

    /**
     * Checks if the register contains any objects.
    @return true if the register cointains objects, false otherwise.
     */
    public boolean isLiteratureRegisterEmpty()
    {
        if (literatureList.size() == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}