package lab8_revision;

import java.util.ArrayList;
import java.util.Scanner;

public class BattleManager {
    // Instance Variables
    private final Knight knight; // A Knight instance representing the player-controlled Knight
    private final ArrayList<BattleColumn> columns; // BattleColumn objects for columns in the game grid
    boolean invisibleModeActive;
    int scoreForSword;

    /* 
     * Initializes the columns list with a number of BattleColumn instances based on SkyBattleGame.COLS.
     * The Knight is initialized with y=0 position, initial health (SkyBattleGame.INITIAL_HEALTH), and 
     * a knight symbol (SkyBattleGame.KNIGHT_SYMBOL).
     */
    public BattleManager() 
    {
        this.knight = new Knight(0, SkyBattleGame.INITIAL_HEALTH, SkyBattleGame.KNIGHT_SYMBOL);
        this.columns = new ArrayList<BattleColumn>();
        for (int i = 0; i < SkyBattleGame.COLS; i++) 
        {
            columns.add(new BattleColumn(false));
        }
    }

    /*
     * Takes the player’s input (direction) and adjusts the Knight's y position accordingly.
     * It checks for valid movement directions (up, down, stay still), ensures the knight does not go out of
     * bounds. If the move is valid, the shiftGrid method is called first to shift the grid to the left,
     * followed by the move method, which updates the knight's position and checks for collisions.
     * Shifting the grid before moving ensures accurate collision detection based on the knight's new position.
     * The method returns true if the move is valid and successful, or false if the move is invalid or out of bounds.
     */
    public boolean handleMovement(String direction) 
    {
        if(direction.equals("w") && knight.getY()==0)
        {
            return false;
        }
        else if(direction.equals("s") && knight.getY()==10)
        {
            return false;
        }
        if(direction.equals("w"))
        {
            shiftGrid();
            this.move(-1);
            return true;
        }
        if(direction.equals("s"))
        {
            shiftGrid();
            this.move(1);
            return true;
        }
        if(direction.equals("d"))
        {
            shiftGrid();
            this.move(0);
            return true;
        }
        return true;
        

    }

    /*
     * Updates the Knight's y position by the provided yDist and checks the position for Dark 
     * Knights. If the Knight collides with a Dark Knight, its health is reduced by 1, and an 
     * attack message is displayed using displayAttackMessage(). Otherwise, the player's score 
     * (SkyBattleGame.score) increases by 1.
     */
    private void move(int yDist) 
    {
        knight.setY(knight.getY()+yDist); 
        
        BattleColumn last = columns.get(0);
        char [] elements = last.getElements();
        if(elements[knight.getY()] == '♘')
        {
            if(knight.power == 0)
            {
                knight.setHealth(knight.getHealth() - 1);  
                displayAttackMessage();
            }
            else
            {
                displayAttackMessage();
                SkyBattleGame.score = SkyBattleGame.score +1;
            }
        }     
        else
        {
            SkyBattleGame.score = SkyBattleGame.score +1;
        }
        if(elements[knight.getY()] == 'X')
        {
            knight.power += 4;
            
        }
        if(knight.power>0)
        {
            knight.power -= 1;
        }
    }

    /*
     * Shifts the grid by moving each column to the left and generating a new column at the 
     * rightmost position.
     */
    private void shiftGrid() 
    {
        this.columns.remove(0);
        BattleColumn last = new BattleColumn(true);
        last.generate(true);
        this.columns.add(last);
        

        
        
        

        
        

    }

    /*
     * Displays a message to the player when the Knight is attacked by a Dark Knight.
     */
    private void displayAttackMessage() 
    {
        if(knight.power == 0)
        {
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("You were attacked by a dark knight");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }
        else
        {
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("You were attacked by a dark knight, but your invicibiity sord saved you");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }
        
    }

    // Getters
    
    /*
     * Returns the current instance of the knight.
     */
    public Knight getKnight() 
    {
        return this.knight;
    }

    /*
     * Returns the ArrayList of columns representing the current game grid.
     */
    public ArrayList<BattleColumn> getColumns() 
    {
        return this.columns;
    }
    
}
