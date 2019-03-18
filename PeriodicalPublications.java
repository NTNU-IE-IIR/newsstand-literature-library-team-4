
/**
 * Holds information about the Periodical Publications.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PeriodicalPublications extends Litterature
{
    private String litteratureType;
    private String timesPublished;

    /**
     * Constructor for objects of class PeriodicalPublications
     * @param title is the title of the periodical publication.
     * @param publisher is the publisher of the periodical publication.
     * @param litteratureType is the type of the periodical publication.
     */
    public PeriodicalPublications(String title, String publisher, String litteratureType)
    {
        super(title, publisher);
        this.litteratureType = litteratureType;
    }

    /**
     * Method to get the litterature type of the periodical publication
     * @return is the variable which holds the litterature type to return.
     */
    public String getLitteratureType()
    {
        return this.litteratureType;
    }

}
