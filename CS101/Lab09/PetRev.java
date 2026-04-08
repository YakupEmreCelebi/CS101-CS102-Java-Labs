package lab9;


public class PetRev {
    //instance variables
    private String petName;
    private String petType;
    private int petHealth;
    private int petHappynessLevel;
    private String petMood;
    private UserRev ownerOfPet;
    public double petAge;
    private boolean IsOld;

    //constructors
    public PetRev(String aName, String aType, UserRev aUser){

        this.petName = aName;
        this.petType = aType;
        this.petHealth =  (int) ((Math.random() * (20)) + 30);;
        this.petHappynessLevel = (int) ((Math.random() * (20)) + 40);
        this.petMood = "Playful";
        this.ownerOfPet = aUser;
        this.petAge = 1;
    }
    
    //methods
    public void  AdjustMood(){

        if( this.petHappynessLevel > 70)
        {
            this.petMood = "Happy";
        }
        else if( this.petHappynessLevel <= 70 && this.petHappynessLevel >= 50)
        {
            this.petMood = "Playful";
        }
        else if(this.petHappynessLevel < 50)
        {
            this.petMood = "Sad";
        }
    }

    public void feedPet(){
        this.petInteraction();
        if(this.petHealth <= 90)
        {
            this.petHealth += 10;
        }
        else if(this.petHealth == 100)
        {
            System.out.println("Already Max Health");
        }
        else
        {
            this.petHealth = 100;
        }
        if(this.petHappynessLevel <= 95)
        {
            this.petHappynessLevel += 5;
        }
        else if(this.petHappynessLevel == 100)
        {
            System.out.println("Already Max Health");
        }
        else
        {
            this.petHappynessLevel = 100;
        }
       AdjustMood();
    }
    public void playWithPet(){
        this.petInteraction();
        if(this.petHappynessLevel <= 85)
        {
            this.petHappynessLevel += 15;
        }
        else if(this.petHappynessLevel == 100)
        {
            System.out.println("Already Max Health");
        }
        else
        {
            this.petHappynessLevel = 100;
            System.out.println("");
        }
        AdjustMood();
    }

    public void groomPet()
    {
        this.petInteraction();
        if(this.petHealth <= 85)
        {
            this.petHealth += 15;
        }
        else if(this.petHealth == 100)
        {
            System.out.println("Already Max Health");
        }
        else
        {
            this.petHealth = 100;
        }
    }
    public String toString(){
        String string = "Name: " + this.petName + " Type: " + this.petType + " Health: " + this.petHealth
         + " Happiness: " + this.petHappynessLevel + " Mood: " + this.petMood;
         return string;
    }
    public String getPetStatus(){
        return this.toString();
    }

    public void incrementAge(){
        this.petAge = this.petAge + 0.25;
    }

    public boolean equals(int i){
        return ownerOfPet.getUserPets().get(i).getPetName().equals(petName);
    }

    public void petInteraction(){
        for(int i=0; i<ownerOfPet.getUserPets().size(); i++)
        {
            if(ownerOfPet.getUserPets().get(i).petMood.equals("Playful"))
            {
                int indexOfPlayfulPet = i;
                for(int j=0; j<ownerOfPet.getUserPets().size(); j++)
                {
                    if(j!=indexOfPlayfulPet)
                    {
                        if(ownerOfPet.getUserPets().get(j).petHappynessLevel <= 95)
                        {
                            ownerOfPet.getUserPets().get(j).petHappynessLevel += 5;
                        }
                        else
                        {
                            ownerOfPet.getUserPets().get(j).petHappynessLevel = 100;
                        }
                    }
                    
                }
            }
            if(ownerOfPet.getUserPets().get(i).petMood.equals("Sad") || ownerOfPet.getUserPets().get(i).petHealth < 30 )
            {
                int indexOfSadPet = i;
                for(int t=0; t<ownerOfPet.getUserPets().size(); t++)
                {
                    if(t!=indexOfSadPet)
                    {
                        if(ownerOfPet.getUserPets().get(t).petHappynessLevel >= 10)
                        {
                            ownerOfPet.getUserPets().get(t).petHappynessLevel -= 10;
                        }
                        else
                        {
                            ownerOfPet.getUserPets().get(t).petHappynessLevel = 0;
                        }
                    }
                }
            }
        }
        System.out.println("Pet interacted with other pets");
    }

    //getters
    public int getHealth()
    {
        return this.petHealth;
    }
    public int getHappyness()
    {
        return this.petHappynessLevel;
    }
    public String getPetName()
    {
        return this.petName;
    }

}
