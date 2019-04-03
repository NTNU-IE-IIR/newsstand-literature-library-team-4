
/**
 * Represent the newspaper.
 *
 * @author Prosjektgruppe_4: Karl-Oskar, Johannes, Anders.
 * @version 2019.03.18.
 */
public class Newspaper extends PeriodicalPublication
{
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
    String literatureType, String timesPublished)
    {
        super(title, publisher, literatureType);
        this.timesPublished = checkValidStringInput(timesPublished);
    }

    /**
     * Returns the times this newspaper is published in a year.
     * @return the times this newspaper is published in a year.   
     */
    public String getTimesPublished()
    {
        return this.timesPublished;
    }

}
