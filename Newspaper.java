
/**
 * Holds information about the Newspaper type.
 *
 * @author Prosjektgruppe_4: Karl-Oskar, Johannes, Anders.
 * @version 2019-05-01.
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
    protected Newspaper(String title, String publisher, 
    String literatureType, String timesPublished)
    throws ValueOutOfRangeExcpection
    {
        super(title, publisher, literatureType);
        setTimesPublished(timesPublished);
    }
        
    private void setTimesPublished(String noOfPublishes) throws ValueOutOfRangeExcpection
    {
        if (noOfPublishes == null )
        {
            throw new IllegalArgumentException("INVALID VALUE, right value must be declared");
        }
        else
        {
            if(noOfPublishes.length() == 0)
            {
                throw new ValueOutOfRangeExcpection("Title was empty");
            }
            else
            {
                this.timesPublished = noOfPublishes;
            }
        }
    }   

    /**
     * Returns the times this newspaper is published in a year.
     * @return the times this newspaper is published in a year.   
     */
    protected String getTimesPublished()
    {
        return this.timesPublished;
    }

}
