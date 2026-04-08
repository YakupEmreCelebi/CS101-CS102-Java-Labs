package lab4;
import java.util.Scanner;

public class Lab04_Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        String option = "yes" ;
        while(option.equals("yes"))
        {
            System.out.print("Enter a positive number: ");
            int number = sc.nextInt();
            int i=3;
            int j=2;
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
                    System.out.print(i + " ");
                }
                i++;
                j=2;
            }
            System.out.print("\nDo you want to calculate again? (yes/no): ");
            option = in.nextLine();

        }
        System.out.println("Program finished");
        
    }
    
}
