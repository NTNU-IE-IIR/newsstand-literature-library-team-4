/**
 * Super class, holds information about litterature
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Literature
{
    private String title;
    private String publisher;
    private String literatureType;

    /**
     * Constructor for objects of class Litterature
     * @param title is the title of the litterature
     * @param publisher is the publisher of the litterature
     */
    public Literature(String title, String publisher)
    {
        this.title = checkValidStringInput(title);
        this.publisher = checkValidStringInput(publisher);
    }

    /**
     * Checks the String brought into the function towards null, 
     * and returns "INVALID VALUE"
     * if the String equals null.
     * @param stringToCheck is the input brought into the function.
     * @return stringToReturn is the String which will be returned.
     */
    protected String checkValidStringInput(String stringToCheck)
    {
        String stringToReturn = null;
        if (stringToCheck != null)
        {
            stringToReturn = stringToCheck;
            return stringToReturn;
        }
        else
        {
            stringToReturn = "INVALID VALUE";
            return stringToReturn;
        }
    }

    /**
     * Gets information about the title of the selected litterature.
     * @return is the title to return.
     */
    public String getTitle()
    {
        return this.title;
    }

    /**
     * Gets information about the publisher of the selected litterature.
     * @return is the publisher to return.
     */
    public String getPublisher()
    {
        return this.publisher;
    }

}
