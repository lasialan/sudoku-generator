package generator;

/**
 * @author Crisoforo Gaspar Hernández
 */
public class Generator {
    // Board of the game 9x9.
    private int[][] board;
    /**
     * Differnt levels for the game as follows:
     * No.  Name
     * -------------------
     * 1    Extremely easy
     * 2    Easy
     * 3    Medium
     * 4    Difficult
     * 5    Evil
     */
    private int level; 
    
    /**
     * Default constructor for the Generator class setting the level of the 
     * game to 1, each constructor generate a new board.
     */
    public Generator(){
        newBoard();
        setLevel(1);
    }
    
    /**
     * Constructor that takes allows to the user set the level for the board.
     * @param level the level of the game [1-5]
     */
    public Generator(int level){
        newBoard();
        setLevel(level);
    }
    
    /**
     * Defines a new board with the size of 9x9.
     */
    private void newBoard(){
        board = new int[9][9];
    }
    
    /**
     * Set the current level at any time.
     * @param level 
     */
    public void setLevel(int level){
        if(level >= 1 && level <= 5){
            this.level = level;
        }else{
            this.level = 1;
        }
        // TODO: Regenerate the board.
        // Issue #5 at github repo.
    }
    
    /**
     * Return the current level of the Game
     * @return  int     The current level of the game  
     */
    public int getLevel(){
        return this.level;
    }
}