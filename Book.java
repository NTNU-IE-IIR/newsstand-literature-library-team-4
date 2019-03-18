
/**
 * Holds information about the Book
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book extends Books
{
    private int bookEdition;

    /**
     * Constructor for objects of class Book
     * @param title is the title of the book.
     * @param publisher is the publisher of the book.
     * @param author is the author of the book.
     * @param bookEdition is the number of which edition the book is.
     */
    public Book(String title, String publisher, String author, int bookEdition)
    {
        super(title, publisher, author);
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
}
