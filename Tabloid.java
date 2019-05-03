/**
 * Holds information about the tabloid.
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
    protected Tabloid(String title, String publisher, 
                      String literatureType, String timesPublished)
                      throws ValueOutOfRangeException
    {
        super(title, publisher, literatureType);
        setTimesPublished(timesPublished);
    }
        
    private void setTimesPublished(String noOfPublishes) throws ValueOutOfRangeException
    {
        if (noOfPublishes == null )
        {
            throw new IllegalArgumentException("INVALID VALUE, right value must be declared");
        }
        else
        {
            if(noOfPublishes.length() == 0)
            {
                throw new ValueOutOfRangeException("Times published was empty");
            }
            else
            {
                this.timesPublished = noOfPublishes;
            }
        }
    } 

    /**
     * Returns the times this tabloid is published in a year.
     * @return the times this tabloid is published in a year.   
     */
    protected String getTimesPublished()
    {
        return this.timesPublished;
    }

    /**
     * Return details of the tabloid: 
     * Title, publisher, genre and times publishe in a year.
     * @return The tabloid´s details.
     */
    protected String getDetails()
    {
        return "Title: " + getTitle() + ", " + 
               "Publisher; "  + getPublisher() + ", " +
               "Literaturetype: " + getLiteratureType() + ", " + 
               "Times Published: " + timesPublished + ".";
    }
}
