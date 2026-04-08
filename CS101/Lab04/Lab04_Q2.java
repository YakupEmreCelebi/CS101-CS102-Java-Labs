package lab4;
import java.util.Scanner;

public class Lab04_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 1;
        int sum=0;
        int digit=0;
        while(number>0)
        {
            System.out.print("Enter a positive number:");
        number = sc.nextInt();
        int newNumber = number; 
        if(number > 0)
        {
            while(newNumber > 0)
            {
                digit = newNumber % 10;
                sum = sum + digit;
                newNumber = newNumber / 10; 
                
            }
            System.out.println(sum);
            sum = 0;
        }
        }
        System.out.println("Program finished.");
        
    }
    
}
