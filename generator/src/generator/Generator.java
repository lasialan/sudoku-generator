package generator;

/**
 * @author Crisoforo Gaspar Hernández
 */
public class Generator {

    private int level; 
    
    public Generator(){
        setLevel(1);
    }
    
    public Generator(int level){
        setLevel(level);
    }
    
    public void setLevel(int level){
        if(level >= 1 && level <= 5){
            this.level = level;
        }else{
            this.level = 1;
        }
    }
    
    public int getLevel(){
        return this.level;
    }
}