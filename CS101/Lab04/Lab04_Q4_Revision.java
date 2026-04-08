package lab4;
import java.util.Scanner;

public class Lab04_Q4_Revision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        int sum=0;     
        String option = "yes" ;
        while(option.equals("yes"))
        {
            System.out.print("Enter a positive number: ");
            int number = sc.nextInt();
            int newNumber = number;
            int i=3;
            sum=0;
            int j=2;
            int largestPrime =2;
            System.out.print("Prime numbers: 2 ");
            while(i< number +1)
            {
                int remain = -1;
                
                while(remain!=0 && j<i)
                {
                    remain = i % j;
                    j++;
                }
                
                if(j==i)
                {
                    
                    sum = sum + i;
                    System.out.print(i + " ");
                    largestPrime = i;
                }
                i++;
                j=2;
            }

            System.out.println("\nSum of primes: " + (sum + 2));
            System.out.println("Largest prime: " + largestPrime);
            System.out.print("\nDo you want to calculate again? (yes/no): ");
            option = in.nextLine();

        }
        System.out.println("Program finished");
        
    }
    
}
