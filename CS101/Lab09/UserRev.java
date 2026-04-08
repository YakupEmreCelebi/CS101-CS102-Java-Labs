package lab9;

import java.util.ArrayList;

public class UserRev {
    
    //instance variables
    private String userName;
    private String userPassword;
    private ArrayList<PetRev> userPets;
    private int userBudget;

    //constructors
    public UserRev(String aName, String aPassword){

        this.userName = aName;
        this.userPassword = aPassword;
        this.userBudget = 100;
        userPets = new ArrayList<PetRev>();
    }

    //methods
    public boolean verifyPassword(String aPassword){

        if(aPassword.equals(this.userPassword))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String getName(){
        return this.userName;
    }


    public void adoptPet(String aPetName, String ApetType){
      
                if(ApetType.equals("Cat") && this.userBudget >= 30)
            {
                this.userBudget -= 30; 
                PetRev pet = new PetRev(aPetName, ApetType, this);
                userPets.add(pet);
                System.out.println("Pet is adopted successfully");
            }
            else if(ApetType.equals("Dog") && this.userBudget >= 40)
            {
                this.userBudget -= 40;
                PetRev pet = new PetRev(aPetName, ApetType, this);
                userPets.add(pet);
                System.out.println("Pet is adopted successfully");
            }
            else if(ApetType.equals("Rabbit") && this.userBudget >= 20)
            {
                this.userBudget -= 20;
                PetRev pet = new PetRev(aPetName, ApetType, this);
                userPets.add(pet);
                System.out.println("Pet is adopted successfully");
            }
            else
            {
                System.out.println("Not have enough points.");
            }
    }

    public void adoptPet(PetRev aPet){
       
            userPets.add(aPet);
            System.out.println("adoption is confirmed");
    }

    public PetRev releasePet(PetRev pet){

        if(userPets.remove(pet))
        {
            return pet;
        }
        else
        {
            System.out.println("Not Exist");
            return null;
        }
    }

    public ArrayList<PetRev> searchPetsByHealth(int minHealth){

        ArrayList<PetRev> petsWithHealth = new ArrayList<PetRev>();
        for(int i=0; i<userPets.size(); i++)
        {
            if(userPets.get(i).getHealth() >= minHealth)
            {
                petsWithHealth.add(userPets.get(i));
            }
        }
        return petsWithHealth;
    }
    public ArrayList<PetRev> searchPetsByHappiness(int minHappiness){

        ArrayList<PetRev> petsWithHappyness = new ArrayList<PetRev>();
        for(int i=0; i<userPets.size(); i++)
        {
            if(userPets.get(i).getHappyness() >= minHappiness)
            {
                petsWithHappyness.add(userPets.get(i));
            }
        }
        return petsWithHappyness;
    }

    public void displayAverageHealthAndHappiness(){
        double sumOfHealth = 0;
        double sumOfHappyness = 0;
        for(int i=0; i < userPets.size(); i++)
        {
            sumOfHealth = sumOfHealth + userPets.get(i).getHealth();
        }
        for(int i=0; i < userPets.size(); i++)
        {
            sumOfHappyness = sumOfHappyness + userPets.get(i).getHappyness();
        }
        System.out.println("Average Health: " + (sumOfHealth /  userPets.size()) + ", Average Happyness: "
              + (sumOfHappyness /  userPets.size()));
    }

    public PetRev getPetByName(String petName){
        for(int i=0; i<userPets.size(); i++)
        {
           if(userPets.get(i).equals(i))
           {
            return userPets.get(i);
           }     
        }
        return null;
    }

    public void displayPets(){
        for(int i=0; i<userPets.size(); i++)
        {
            System.out.println(userPets.get(i).getPetStatus());
        }
    }

    public boolean equals(String scanner){
        return this.userName.equals(scanner);
    }

    //getters
    public ArrayList<PetRev> getUserPets(){
        return this.userPets;
    }
    






}
