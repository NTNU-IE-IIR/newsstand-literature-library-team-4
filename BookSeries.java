
/**
 * Class which holds information about a bookseries.
 *
 * @author Prosjektgruppe_4: Karl-Oskar, Johannes, Anders.
 * @version 2019-05-01.
 */
public class BookSeries extends Literature
{
    private String bookSeriesTitle;
    private int numberOfBooks;

    /**
     * Constructor for objects of class BookSeries
     * @param title is the title of the bookseries.
     * @param publisher is the publisher of the bookseries.
     * @param author is the name of the author of the bookseries.
     * @param bookSeriesTitle is the name of the bookseries.
     */
    public BookSeries(String title, String publisher, 
                      String bookSeriesTitle, int numberOfBooks) 
                      throws ValueOutOfRangeExcpection 
    {
        super(title, publisher);
        this.bookSeriesTitle = checkValidStringInput(bookSeriesTitle);
        setNumberOfBooks(numberOfBooks);
    }

    /**
     * Returns the title of the bookseries.
     * @return variable which holds the title to return.
     */
    protected String getBookSeriesTitle()
    {
        return this.bookSeriesTitle;
    }
    
    private void setNumberOfBooks(int noOfBooks) throws ValueOutOfRangeExcpection
    {
        if (noOfBooks < 0)
        {
            throw new ValueOutOfRangeExcpection("Number of books was negative. Must be positive.");
        }
        else
        {
            this.numberOfBooks = noOfBooks;
        }
    }
    
    /**
     * Return the number of books in the serie.
     * @return number of books in the serie.
     */
    protected int getNumberOfBooks()
    {
        return this.numberOfBooks;
    }
}
