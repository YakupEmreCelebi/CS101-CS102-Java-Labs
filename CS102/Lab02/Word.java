import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Word {

    // Properties
    private String name;
    private char[] chars;
    private int length;
    private ArrayList<Word> possibleChains;
    private ArrayList<String> possibleChainsNames;
    private ArrayList<String> currentChain; 

    // Constructor
    public Word(String aName) throws FileNotFoundException{
        this.name = aName.toUpperCase();
        this.length = name.length();
        possibleChains = new ArrayList<>();
        possibleChainsNames = new ArrayList<>();
        currentChain = new ArrayList<>();
        this.chars = new char[name.length()];
        for(int i=0; i<aName.length(); i++)
        {
            this.chars[i] = name.charAt(i);
        }
    }

    // Getters
    public String getName() {
        return name;
    }

    public ArrayList<Word> getPossibleChains() {
        return possibleChains;
    }

    public char[] getChars() {
        return chars;
    }
    
    public int getLength() {
        return length;
    }

    public ArrayList<String> getPossibleChainsNames() {
        return possibleChainsNames;
    }

    public ArrayList<String> getCurrentChain() {
        return currentChain;
    }

    // Methods
    public boolean canChain(Word aWord){
        int count = 0;
        if(aWord.length == this.length)
        {
            for(int i=0; i<aWord.length; i++)
            {
                if(aWord.chars[i] != this.chars[i])
                {
                    count++;
                }
            }
            if(count > 1)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        else if(Math.abs(aWord.length - this.length) > 1)
        {
            return false;
        }
        else
        {
            if(aWord.length > this.length)
            {
                if(aWord.name.contains(name))
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
            else
            {
                if(this.name.contains(aWord.name))
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }
    }

    public void addToPossibleChains(Word aWord){
        if(Math.abs(aWord.length - this.length) <= 1)
        {
            if(this.canChain(aWord))
            {
                this.possibleChains.add(aWord);
            }
        }
    }

    public void fillPossibleChainsArray() throws FileNotFoundException{
        for(int i=0; i<this.possibleChainsNames.size(); i++)
        {
            Word word = new Word(possibleChainsNames.get(i));
            possibleChains.add(word);
        }
    }

    public void clearCurrentChain(){
        currentChain.
        clear();
    }

    public boolean checkIsExistPossibleChain(ArrayList<String> toIgnore){
        for(int i=0; i< possibleChains.size(); i++)
        {
            boolean found = false;
            for(int j=0; j<toIgnore.size(); j++)
            {
                if(possibleChains.get(i).name.equals(toIgnore.get(j)))
                {
                    found = true;
                    break;
                }
            }
            if(found == false)
            {
                return true;
            }
        }
        return false; 
    }

    public Word generateWordChainObject(ArrayList<String> toIgnore) {
        toIgnore.add(this.name);
    
        if (this.possibleChains.size() > 0 && this.checkIsExistPossibleChain(toIgnore))
         {
            ArrayList<Word> validChains = new ArrayList<>();
    
            // Elements that not in toIgnore
            for (int i = 0; i < this.possibleChains.size(); i++) 
            {
                Word chain = this.possibleChains.get(i);
                if (!toIgnore.contains(chain.name)) 
                {
                    validChains.add(chain);
                }
            }

            if (validChains.isEmpty())
             {
                System.out.println("\nNo return value");
                return null;
            }
    
            int randomIndex = (int) (Math.random() * validChains.size());
            Word selectedWord = validChains.get(randomIndex);
            toIgnore.add(selectedWord.name);
    
            return selectedWord;
        } 
        else 
        {
            System.out.println("\nNo return value, ChainArray length 0");
            return null;
        }
    }
       
}
