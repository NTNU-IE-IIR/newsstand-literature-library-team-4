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
        
        // if (title != null)
        // {
            // this.title = title;
        // }
        // else
        // {
            // this.title = "INVALID VALUE";
        // }
        // this.publisher = publisher;
        // this.litteratureType = litteratureType;  
        // this.timesPublished = timesPublished;
    }

    // /**
     // * Constructor for objects of class Tabloid.
     // * This constructor is used for making dummies
     // * to test add method in Literatureregister.
     // */
    // public Tabloid()
    // {
        // this.title = "Adressa";
        // this.publisher = "Adresseavisa";
        // this.litteratureType = "Newspaper";
        // this.timesPublished = "52 times a year, Once a week";
    // }

    // /**
     // * Returns the title of the tabloid.
     // * @return the tile of the tabloid.
     // */
    // public String getTitle()
    // {
        // return this.title;
    // }

    // /**
     // * Returns the publisher of the tabloid.
     // * @return the publisher of the tabloid.
     // */
    // public String getPublisher()
    // {
        // return this.publisher;
    // }

    // /**
     // * Returns the genre of the tabloid.
     // * @return the genre of the tabloid.    
     // */
    // public String getliteratureType()
    // {
        // return this.literatureType;
    // }

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
