/**
<<<<<<< HEAD
 * Represent the tabloid.
=======
 * Represent the Tabloid.
>>>>>>> 106f0055be10940136b32ce745dc1eb17363d6e2
 *
 * @author Prosjektgruppe_4: Karl-Oskar, Johannes, Anders.
 * @version 2019.03.18.
 */
public class Tabloid extends PeriodicalPublication
{
    private String timesPublished;

    /**
     * Constructor for objects of class Newspaper.
     * @param title The title is the title of the tabloid
     * @param publisher The publisheris the name of the organization
     * who published this tabloid.
     * @param genre The genre is the genre of the tabloid.
     * @param timesPublished is the times this tabloid is published per year.
     */
    public Tabloid(String title, String publisher, 
    String literatureType, String timesPublished)
    {
        super(title, publisher, literatureType);
        this.timesPublished = checkValidStringInput(timesPublished);
    }

    /**
     * Returns the times this tabloid is published in a year.
     * @return the times this tabloid is published in a year.   
     */
    public String getTimesPublished()
    {
        return this.timesPublished;
    }

    /**
     * Return details of the tabloid: 
     * Title, publisher, genre and times publishe in a year.
     * @return The tabloid´s details.
     */
    public String getDetails()
    {
        return "Title: " + getTitle() + ", " + 
               "Publisher; "  + getPublisher() + ", " +
               "Literaturetype: " + getLiteratureType() + ", " + 
               "Times Published: " + timesPublished + ".";
    }
}
