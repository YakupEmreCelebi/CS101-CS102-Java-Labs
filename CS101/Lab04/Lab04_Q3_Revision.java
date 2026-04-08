package lab4;
import java.util.Scanner;

public class Lab04_Q3_Revision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digit=0;
        int sum = 0;
        int reversed = 0;
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();
        int length = (int)(Math.log10(number)+1);
        int secondLength = length;
        int newNumber = number;
        while(number>0 && length < 9)
        {
            while(newNumber > 0)
            {
                digit = newNumber % 10;
                sum = sum + digit;
                newNumber = newNumber / 10;
                reversed =  (int) (digit * Math.pow(10.0,secondLength-1) + reversed);
                secondLength --;
                
            }
            System.out.println("Sum of digits: " + sum);
            if(sum % 2 == 0)
            {
                System.out.println("Sum of digits is even.");
            }
            else
            {
                System.out.println("Sum of digits is odd.");
            }
            System.out.print("Reversed number: " + reversed);
            sum=0;
            reversed=0;
            System.out.print("\nEnter a positive number: ");
            number = sc.nextInt();
            length = (int)(Math.log10(number)+1);
            secondLength = length;
            newNumber = number;
            
        }
       
        if(length > 8)
        {
            System.out.println("Number exceeds 8 digits.");
        }
        System.out.println("Program finished.");
    }
    
}
