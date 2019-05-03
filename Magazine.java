
/**
 * Holds information about the Magazine type.
 *
 * @author Prosjektgruppe_4: Karl-Oskar, Johannes, Anders.
 * @version 2019-05-01.
 */
public class Magazine extends PeriodicalPublication
{
    private String genre;

    /**
     * Constructor for objects of class Magazine
     * @param title is the title of the magazine
     * @param publisher is the publisher of the magazine
     * @param literatureType is the type of literature 
     * @param genre is which genre the magazine is.
     */
    protected Magazine(String title, String publisher, 
                    String literatureType, String genre)
                    throws ValueOutOfRangeException
    {
        super(title, publisher, literatureType);
        setGenre(genre);       
    }
    
    private void setGenre (String magGenre) throws ValueOutOfRangeException
    {
        if (magGenre == null)
        {
            throw new IllegalArgumentException("INVALID VALUE, right value must be declared.");
        }
        else
        {
            if(magGenre.length() == 0)
            {
                throw new ValueOutOfRangeException("Genre was empty");
            }
            else
            {
                this.genre = magGenre;
            }
        } 
    } 
    
    /**
     * Gets information about which genre the magazine is.
     * @return holds the variable of which genre the magazine is.
     */
    protected String getGenre()
    {
        return this.genre;
    }
}
