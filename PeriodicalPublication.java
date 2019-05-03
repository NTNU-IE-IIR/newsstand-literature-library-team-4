
/**
 * Holds information about the Periodical Publications.
 *
 * @author Prosjektgruppe_4: Karl-Oskar, Johannes, Anders.
 * @version 2019-05-01.
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
    protected PeriodicalPublication(String title, String publisher, 
                                  String literatureType)
    {
        super(title, publisher);
        this.literatureType = literatureType;
    }

    /**
     * Method to get the literature type of the periodical publication
     * @return is the variable which holds the literature type to return.
     */
    protected String getLiteratureType()
    {
        return this.literatureType;
    }

}
