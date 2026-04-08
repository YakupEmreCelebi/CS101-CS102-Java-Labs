package lab6;
import java.util.Scanner;



public class Lab06_Q2 {

    public static boolean validateEmail(String s)
    {
        String name = "";
        String surname = "";
        String university = "";
        String edu = "";
        String tr = "";
        char ch = ' ';
        boolean isNameTrue = true;
        boolean isSurnameTrue = true;
        boolean isUniversityTrue = true;

        boolean isValid =true;
        int indexOfDot = s.indexOf(".");
        if(indexOfDot == -1)
        {
            isValid = false;
        }
        else
        {
        name = s.substring(0, indexOfDot);
        s = s.substring(indexOfDot + 1);
        int indexOfEt = s.indexOf("@");
        if(indexOfEt == -1)
        {
            isValid = false;
        }
        else
        {
        surname = s.substring(0, indexOfEt);
        s = s.substring(indexOfEt+1);
        int indexOfSecondDot = s.indexOf(".");
        if(indexOfSecondDot == -1)
        {
            isValid = false;
        }
        else
        {
        university = s.substring(0, indexOfSecondDot);
        s = s.substring(indexOfSecondDot+1);
        int indexOfThirdDot = s.indexOf(".");
        if(indexOfThirdDot == -1)
        {
            isValid = false;
        }
        else
        {
        edu = s.substring(0, indexOfThirdDot);
        s = s.substring(indexOfThirdDot+1);
        tr = s;
        if(!tr.equals("tr") || !edu.equals("edu"))
        {
            isValid = false;
        }
        else
        {
            for (int i = 0; i<name.length(); i++)
            {
                ch = name.charAt(i);
                if(Character.isLetter(ch))
                {
                    isNameTrue = true;
                }
                else
                {
                    isNameTrue = false;
                }
            }
            for (int i = 0; i<surname.length(); i++)
            {
                ch = surname.charAt(i);
                if(Character.isLetter(ch))
                {
                    isSurnameTrue = true;
                }
                else
                {
                    isSurnameTrue = false;
                }
            }
            for (int i = 0; i<university.length(); i++)
            {
                ch = university.charAt(i);
                if(Character.isLetter(ch))
                {
                    isUniversityTrue = true;
                }
                else
                {
                    isUniversityTrue = false;
                }
            }
            if(!isUniversityTrue || !isSurnameTrue || !isNameTrue)
            {
                isValid = false;
            }
            else
            {
                isValid = true;
            }           
        }       
        }
        }
        }
        }
        
        

        
        if(isValid)
        {
            char lowerchname = name.charAt(0);
            char upperchname = Character.toUpperCase(lowerchname);
            String newName = upperchname + name.substring(1 );

            char lowerchsurname = surname.charAt(0);
            char upperchsurname = Character.toUpperCase(lowerchsurname);
            String newSurname = upperchsurname + surname.substring(1 );

            char lowerchuni = university.charAt(0);
            char upperchuni = Character.toUpperCase(lowerchuni);
            String newUni = upperchuni + university.substring(1 );

            System.out.print("Student name: " + newName);
            System.out.print("\nStudent Surname: " + newSurname);
            System.out.print("\nUniversity Name: " + newUni);
        }
        else
        {
            System.out.println("The email is not valid, please enter a valid email");
        }
        return isValid;
        
    }

    public static boolean validatePassword(String s)
    {
        boolean upperCaseValid = false;
        boolean lowerCaseValid = false;
        boolean digitValid = false;
        boolean isValid = true;
        char ch = ' ';
        if(s.length() < 8)
        {
            isValid = false;
        }
        else
        {
            isValid = false;
            for(int i = 0; i < s.length(); i++)
            {
                ch = s.charAt(i);
                if(Character.isUpperCase(ch))
                {
                    upperCaseValid = true;
                    break;
                }
                else
                {
                    upperCaseValid = false;
                }
            }   
            for(int i = 0; i < s.length(); i++)
            {
                ch = s.charAt(i);
                if(Character.isLowerCase(ch))
                {
                    lowerCaseValid = true;
                    break;
                }
                else{
                    lowerCaseValid = false;
                }
            } 
            for(int i = 0; i < s.length(); i++)
            {
                ch = s.charAt(i);
                if(Character.isDigit(ch))
                {
                    digitValid = true;
                    break;
                }
                else
                {
                    digitValid = false;
                }
            } 
            if(digitValid && lowerCaseValid && upperCaseValid)
            {
                isValid = true;
            }
            else
            {
                isValid = false;
            }
        }

        return isValid;
    }

   
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);

        boolean isValidEmail = false;
        while(!isValidEmail)
        {
            System.out.print("Enter the email: ");
            String email = in.nextLine();
            isValidEmail = validateEmail(email);
        
        }
        

        
        boolean isValidPassword = false;


        int count = 1;
       
        while(!isValidPassword)
        {
            if(count == 1)
            {
                System.out.print("\nEnter the Password: ");
            }
            else
            {
                System.out.println("The password is not valid, please enter another password");
                System.out.print("Enter the Password: ");
            }
            String password = in.nextLine();
            isValidPassword = validatePassword(password);
            count ++;
        }
        System.out.println("The password is valid");
        System.out.println("Registration is successful");
    }
}
