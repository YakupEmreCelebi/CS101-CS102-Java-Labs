import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AllWords {

    // Properties
    private ArrayList<Word> allWords;
    private ArrayList<String> allWordsNames;

    // Constructor
    public AllWords() throws FileNotFoundException{
    allWords = new ArrayList<>();
    allWordsNames = new ArrayList<>();
    readFile("words.txt");
    fillAllWordsArray();
    fillAllWordsPossibleChains();
    filterAllWords();
    }

    // Getters
    public ArrayList<Word> getAllWords() {
        return allWords;
    }

    // Reading words from the txt file
    private void readFile(String fileName) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File(fileName));
        while(sc.hasNextLine())
        {
            String line = sc.nextLine().trim();
            if (!line.isEmpty()) 
            {
                System.out.println(line.toUpperCase());
                allWordsNames.add(line.toUpperCase());
            }
           
        }
        sc.close();
    }

    // Creating chains with max 10 length
    public void createChain(){
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("---Creating Chains---");
        System.out.println("Enter a word from list: ");
        String userWordName = in.nextLine();
        if(allWordsNames.contains(userWordName))
        {
            System.out.println("Found in list");
            for(int i=0; i<allWords.size(); i++)
            {
                if(allWords.get(i).getName().equals(userWordName))
                {

                    System.out.print(allWords.get(i).getName());
                    Word currentWord = allWords.get(i);
                    currentWord.clearCurrentChain();
                    int count = 0;
                    while (count < 10)
                     {
                        Word newWord = currentWord.generateWordChainObject(allWords.get(i).getCurrentChain());
                        
                        if (newWord == null) 
                        {
                            break; 
                        }
                    
                        System.out.print(" - " + newWord.getName());
                        currentWord = newWord;
                        count++;
                    }

                    break;
                }
            }
        }
        else
        {
            System.out.println("Did not found in list");
        }
    }

    //Filling allWords ArrayList from the names red from txt file
    public void fillAllWordsArray() throws FileNotFoundException{
        for(int i=0; i<allWordsNames.size(); i++)
        {
            Word word = new Word(allWordsNames.get(i));
            allWords.add(word);
            
        }
    }

    // Filling all possible chain array
    public void fillAllWordsPossibleChains(){
        for(int i=0; i<allWords.size(); i++)
        {
            for(int j=0; j<allWords.size(); j++)
            {
                if(allWords.get(i).canChain(allWords.get(j)) && !allWords.get(i).getName().equals(allWords.get(j).getName()))
                {
                    allWords.get(i).addToPossibleChains(allWords.get(j));
                }
            }
        }
    }

    // Removing the words that chain length is 0
    public void filterAllWords(){
        for(int i=0; i<allWords.size(); i++)
        {
            if(allWords.get(i).getPossibleChains().size() == 0)
            {
                allWords.remove(i);
                allWordsNames.remove(i);
                i = 0;    
            }
            
        }
    }

    // Chain estimating game
    public void chainGame(){
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("---Chain Game---");
        String finalChain = "";
        boolean validIndex = false;
        int randomIndex = 0; //to silence the compiler

        // Get random word that chain length is at least 3
        while(!validIndex)
        {
            randomIndex = (int) (Math.random() * this.allWords.size());
            if(allWords.get(randomIndex).getPossibleChains().size() >= 3)
            {
                validIndex = true;
            }
        } 
        
        // Generating 2 more words
        finalChain += allWords.get(randomIndex).getName();
        Word currentWord = allWords.get(randomIndex);
        int count = 0;
        while (count < 2)
        {
            Word newWord = currentWord.generateWordChainObject(allWords.get(randomIndex).getCurrentChain());             
            if (newWord == null) 
            {
                break; 
            }      
            finalChain +=  " - " + newWord.getName();
            currentWord = newWord;
            count++;
        }

        // Seperate the middle word
        int indexOfFirstLine = finalChain.indexOf('-');
        int indexOfSecondLine = finalChain.lastIndexOf('-');
        String middleWord = finalChain.substring(indexOfFirstLine + 1, indexOfSecondLine).trim();
        String guessString = finalChain.substring(0,indexOfFirstLine + 1) + " ? " + finalChain.substring(indexOfSecondLine);
        boolean correctAnswer = false;
        int remainEstimate = 0;
        
        // Guessing the answer and check it
        do
        {
            System.out.println(guessString);
            System.out.print("Guess the middle word: ");
            String answer = in.nextLine();
            if(answer.equals(middleWord))
            {
                correctAnswer = true;
            }
            remainEstimate ++;
        }while(!correctAnswer && remainEstimate < 3);

        // Print Correct result
        if(correctAnswer)
        {
            System.out.println("Congratulations, That is correct!!!");
        }
        System.out.println(finalChain);
    }

    // Print the first menu / Creating chains or Game 
    public void printMenu(){
        Scanner in = new Scanner(System.in);
        int option;
        do
        {
            System.out.println();
            System.out.println("---Welcome---");
            System.out.print("1- Play chain game\n2- Create chains\n3- Logout\nChoose an option: ");
            option = in.nextInt();
            if(option == 1)
            {
                chainGame();
            }
            else if(option == 2)
            {
                createChain();
            }
            else if(option == 3)
            {
                System.out.println("Logged out succesfully");
            }
        }
        while(option != 3);
    }    
}
