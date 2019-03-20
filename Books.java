
/**
 * Holds information about the bookclasses.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Books extends Literature
{
    private String author;

    /**
     * Constructor for objects of class Books
     * @param title is the title of the book or book series.
     * @param publisher is the publisher of the book or book series.
     * @param author is the name of the author of the book or book series.
     */
    public Books(String title, String publisher, String author)
    {
        super(title, publisher);
        this.author = checkValidStringInput(author);
    }

    /**
     * Author of the selected book or book series.
     * @return the varible which holds the author.
     */
    public String getAuthor()
    {
        return this.author;
    }
}
