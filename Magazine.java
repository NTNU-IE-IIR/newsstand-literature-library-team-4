
/**
 * Holds information about the Magazine type.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Magazine extends PeriodicalPublication
{
    private String genre;

    /**
     * Constructor for objects of class Magazine
     * @param title is the title of the magazine
     * @param publisher is the publisher of the magazine
     * @param litteratureType is the type of litterature 
     * this is (Magazine/Newspaper).
     * @param genre is which genre (sports,fashion,gossip) the magazine is.
     */
    public Magazine(String title, String publisher, 
                    String literatureType, String genre)
    {
        super(title, publisher, literatureType);
        this.genre = checkValidStringInput(genre);
        
    }
    
    /**
     * Gets information about which genre the magazine is.
     * @return holds the variable of which genre the magazine is.
     */
    public String getGenre()
    {
        return this.genre;
    }
}
