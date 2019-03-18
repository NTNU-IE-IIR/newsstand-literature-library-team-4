
/**
 * Represent the newspaper.
 *
 * @author Prosjektgruppe_4: Karl-Oskar, Johannes, Anders.
 * @version 2019.03.18.
 */
public class Newspaper
{
    private String title;
    private String publisher;
    private String genre;
    private String timesPublished;

    /**
     * Constructor for objects of class Newspaper.
     * @param title The title is the title of the newspaper
     * @param publisher The publisheris the name of the organization
     * who published this newspaper.
     * @param genre The genre is the genre of the newspaper.
     * @param timesPublished is the times this newspaper is published per year.
     */
    public Newspaper(String title, String publisher, 
                     String genre, String timesPublished)
    {
        if (title != null)
        {
        this.title = title;
    }
    else
    {
        this.title ="INVALID VALUE";
    }
        this.publisher = publisher;
        this.genre = genre;  
        this.timesPublished = timesPublished;
    }

        /**
     * Constructor for objects of class Newspaper.
     * This constructor is used for making dummies
     * to test add method in Literatureregister.
     */
    public Newspaper()
    {
        this.title = "Adressa";
        this.publisher = "Adresseavisa";
        this.genre = "News";
        this.timesPublished = "52 times a year, Once a week";
    }
    
    /**
     * Returns the title of the newspaper.
     * @return the tile of the newspaper.
     */
    public String getTitle()
    {
        return this.title;
    }

    /**
     * Returns the publisher of the newspaper.
     * @return the publisher of the newspaper.
     */
    public String getPublisher()
    {
        return this.publisher;
    }

    /**
     * Returns the genre of the newspaper.
     * @return the genre of the newspaper.    
     */
    public String getGenre()
    {
        return this.genre;
    }

    /**
     * Returns the times this newspaper is published in a year.
     * @return the times this newspaper is published in a year.   
     */
    public String getTimesPublished()
    {
        return this.timesPublished;
    }

    /**
     * Return details of the newspaper: 
     * Title, publisher, genre and times publishe in a year.
     * @return The newspaper´s details.
     */
    public String getDetails()
    {
        return "Title: " + title + ", " + 
               "Publisher; "  + publisher + ", " +
               "Genre: " + genre + ", " + 
               "Times Published: " + timesPublished + ".";
    }
}
