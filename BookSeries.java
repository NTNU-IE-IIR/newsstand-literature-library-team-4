
/**
 * Class which holds information about a book series.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BookSeries extends Books
{
    private String bookSeriesTitle;

    /**
     * Constructor for objects of class BookSeries
     * @param title is the title of the book series.
     * @param publisher is the publisher of the book series.
     * @param author is the name of the author of the book series.
     * @param bookSeriesTitle is the name of the book series.
     */
    public BookSeries(String title, String publisher, String author, String bookSeriesTitle)
    {
        super(title, publisher, author);
        this.bookSeriesTitle = checkValidStringInput(bookSeriesTitle);
    }

    /**
     * Returns the title of the book series.
     * @return variable which holds the title to return.
     */
    public String getBookSeriesTitle()
    {
        return this.bookSeriesTitle;
    }
}
