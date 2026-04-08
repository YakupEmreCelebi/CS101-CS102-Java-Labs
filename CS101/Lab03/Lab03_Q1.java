package lab3;

import java.util.Scanner;
public class Lab03_Q1 {
    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        System.out.print("Enter your weight in kilograms: ");
        int weight = I.nextInt();
        System.out.print("Enter your height in meters: ");
        double height = I.nextDouble();
        double BMI = weight / (height * height);
        System.out.printf("Your BMI is: " + "%.2f" ,BMI);
        if(BMI < 18.5)
        {
            System.out.println("\nYou are underweight.");
        }
        else if(18.5 <= BMI && BMI <= 24.9)
        {
            System.out.println("\nYou are of normal weight.");
        }
        else if(24.9 <= BMI && BMI <= 29.9)
        {
            System.out.println("\nYou are overweight.");
        }
        else
        {
            System.out.println("\nYour BMI indicates that you are above the recommended range.");
        }
    }
}

    
    

