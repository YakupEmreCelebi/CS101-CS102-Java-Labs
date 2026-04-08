package lab4;
import java.util.Scanner;

public class Lab04_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=1;
        int result=1;
        System.out.print("Enter a number:");
        int number = sc.nextInt();
        while(i<=number)
        {
            result = result * i;
            i++;
        }
        System.out.println("Factorial of " + number + " is " + result);
        i=1;
        result=1;
        while(number!=-1)
        {
            System.out.print("Enter a number:");
            number = sc.nextInt();
            if(number!=-1)
            {
                while(i<=number)
                {
                    result = result * i;
                    i++;
                }
                System.out.println("Factorial of " + number + " is " + result);
                i=1;
                result=1;
            }
            else
            {
                System.out.println("Program finished.");
            }
            
           
        }
       
    }
    
}
