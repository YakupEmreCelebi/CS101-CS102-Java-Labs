package lab8_revision;

public class Knight {
    // Instance Variables
    int y; // y-coordinate of the Knight
    int health; // current health points of the Knight
    char symbol = SkyBattleGame.KNIGHT_SYMBOL;  // visual symbol of the Knight
    int power = 0;

    /*
     * Initializes the Knight with a specified y position, health, and a visual symbol. It sets the 
     * health using the setHealth() method to ensure the value is non-negative.
     */
    public Knight(int y, int health, char symbol) 
    {
        this.y=y;
        this.health=health;
        this.symbol=symbol;
        setHealth(health);
    }

    /*
     * Returns true if the Knight’s health is greater than zero, meaning the Knight is still alive; 
     * otherwise, returns false.
     */
    public boolean isAlive() 
    {
        if(this.health>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /*
     * Returns a string representation of the Knight, including its symbol and a visual representation
     * of its health using the ‘*’ symbol. The number of asterisks corresponds to the Knight's health.
     */
    public String toString() 
    {
        String string="Knight: symbol (♞), health (";
        for(int i=0; i<this.health; i++)
        {
            string = string + "*";
        }
        string = string + " " + health + " )";
        return string ;
    }

    // Getters & Setters
    public int getHealth() 
    {
        return this.health;
    }

    public int getY() 
    {
        return this.y;
    }

    public char getSymbol() 
    {
        return this.symbol;
    }

    public void setY(int y) 
    {
        this.y=y;
    }

    /*
     * Sets the Knight’s health to the provided value, but ensures the health is never set to a value 
     * below 0 using Math.max(health, 0)
     */
    public void setHealth(int health) 
    {
        this.health =  Math.max(health, 0);
    }
    
}
