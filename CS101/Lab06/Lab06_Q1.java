package lab6;
import java.util.Scanner;

public class Lab06_Q1 {

    public static int greatestCommonDivisor(int a, int b)
    {
        int gcd =1;
        for (int i = 1; i <= a && i <= b; i++)
        {
            if (a % i == 0 && b % i == 0)
            {
                gcd=i;
            }
        }
        return gcd;
    }
    
    public static int leastCommonMultiple(int a, int b)
    {
        int lcm = Math.max(a, b);
        while (lcm % Math.min(a, b) != 0)
        {
            lcm += Math.max(a, b);
        }
        return lcm;
    }

    public static boolean isRelativelyPrime(int a, int b)
    {
        boolean isRelativelyPrime;
        if(greatestCommonDivisor(a, b) == 1)
        {
            isRelativelyPrime = true;
        }
        else
        {
            isRelativelyPrime = false;
        }
        return isRelativelyPrime;
    }

    public static long intToBinary(int a)
    {
        int temp =a;
        long intToBinary= 0;
        int i =2;
        int count = 1;
        while(a>i)
        {
            count++;
            i = i * 2;
        }
        for(double j = count ; j > 0 ; j--)
        {
            intToBinary = intToBinary + (int) (temp / Math.pow(2.0,j-1)) *(int) Math.pow(10, j-1);
            temp = temp - (int) Math.pow(2.0,j-1) * (int) (temp / Math.pow(2.0,j-1));
        }
        return intToBinary;
    }
    public static long binaryReversal(int a)
    {
        int reversed = 0;
        long number = intToBinary(a);
        int length = (int)(Math.log10(number)+1);
        int secondLength = length;
        int sum=0;
        int digit=0;
        while( number > 0)
        {
            digit = (int) number % 10;
            sum = sum + digit;
            number = number / 10; 
            reversed =  (int) (digit * Math.pow(10.0,secondLength-1) + reversed);
            secondLength --;  
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = in.nextInt();
        System.out.println("Binary representation of " + firstNumber + " is " + intToBinary(firstNumber));
        System.out.println("Binary reversal of " + firstNumber + " is " + binaryReversal(firstNumber));
        System.out.print("Enter the second number: ");
        int secondNumber = in.nextInt();
        System.out.println("Binary representation of " + secondNumber + " is " + intToBinary(secondNumber));
        System.out.println("Binary reversal of " + secondNumber + " is " + binaryReversal(secondNumber));
        if(isRelativelyPrime(firstNumber, secondNumber)==true)
        {
            System.out.println(firstNumber + " and " + secondNumber + " are relatively prime.");
        }
        else
        {
            System.out.println(firstNumber + " and " + secondNumber + " are not relatively prime.");
        }
        System.out.println("Greatest common divisor of " + firstNumber + " and " + secondNumber + " is " + greatestCommonDivisor(firstNumber, secondNumber));
        System.out.println("Least common multiple of " + firstNumber + " and " + secondNumber + " is " + leastCommonMultiple(firstNumber, secondNumber));
       

       
    }
    
}
