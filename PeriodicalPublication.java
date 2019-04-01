
/**
 * Holds information about the Periodical Publications.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class PeriodicalPublication extends Literature
{
    private String literatureType;
    private String timesPublished;

    /**
     * Constructor for objects of class PeriodicalPublications
     * @param title is the title of the periodical publication.
     * @param publisher is the publisher of the periodical publication.
     * @param literatureType is the type of the periodical publication.
     */
    public PeriodicalPublication(String title, String publisher, 
                                  String literatureType)
    {
        super(title, publisher);
        this.literatureType = literatureType;
    }

    /**
     * Method to get the litterature type of the periodical publication
     * @return is the variable which holds the litterature type to return.
     */
    public String getLiteratureType()
    {
        return this.literatureType;
    }

}
