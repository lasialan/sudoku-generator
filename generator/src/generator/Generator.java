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
    
    public int[][] getBoard(){
        return board;
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
    
    /**
     * Using the first sequence for the first level, the sequence is as follows
     * from left to right and from top to bottom
     */
    private void extremelyEasySequence(){   
        // Fixed length for both sides.
        int length = board.length;
        for(int i = 0; i < length; i++){
            for(int j = 0; j < length; j++){
            }
        }
    }
    /**
     * Using this sequence to generate easy level. The sequences is as follows
     * jumping one cell at the time if it's in the last column jumps one cell
     * down in the current row.
     */
    private void easySequence(){
        // Fixed length
        int length = board.length;
        int j = 0; 
        for(int i = 0; i < length; i++){
            if(j == 0){
                for(j = 0; j < length; j++){
                }
            }else{
                for(j = length - 1; j >= 0; j--){
                }
            }
        }
    }
}