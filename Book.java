
/**
 * Holds information about the Book
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book extends Literature
{
    private int bookEdition;
    private String author;

    /**
     * Constructor for objects of class Book
     * @param title is the title of the book.
     * @param publisher is the publisher of the book.
     * @param author is the author of the book.
     * @param bookEdition is the number of which edition the book is.
     */
    public Book(String title, String publisher, String author, int bookEdition)
    {
        super(title, publisher);
        this.author = author;
        if (bookEdition < 1)
        {
            this.bookEdition = 9999;
        }
        else
        {
            this.bookEdition = bookEdition;
        }
    }

    /**
     * Returns the number of which edition the book is.
     * @return holds the variable of which edition the book is.
     */
    public int getBookEdition()
    {
        return this.bookEdition;
    }
    
    /**
     * Returns the author of the book
     * @return author of the book
     */
    protected String getAuthor()
    {
        return this.author;
    }
}
