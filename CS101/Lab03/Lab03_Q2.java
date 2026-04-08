package lab3;

import java.util.Scanner;
public class Lab03_Q2 {
    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        System.out.print("Enter the student's GPA: ");
        double GPA = I.nextDouble();
        System.out.print("Enter the total number of completed credit hours: ");
        int NoOfCompletedCreditHours = I.nextInt();
        System.out.print("Enter the extracurricular activity hours: ");
        int extracurricularActivityHours = I.nextInt();
        System.out.print("Enter the number of academic honors received: ");
        int  noOfAcademicHonorsReceived = I.nextInt();
        System.out.print("Enter the total annual family income: ");
        int totalAnnualFamilyIncome = I.nextInt();
        int scholarshipScore = 200;
        if(NoOfCompletedCreditHours > 40)
        {
           scholarshipScore += 600; 
        }
        else
        {
            scholarshipScore = scholarshipScore + (15 * NoOfCompletedCreditHours);
        }
        if(extracurricularActivityHours > 30)
        {
            scholarshipScore += 300;
        }
        else
        {
            scholarshipScore = scholarshipScore + (10 * extracurricularActivityHours);
        }
        if(noOfAcademicHonorsReceived > 5)
        {
            scholarshipScore += 100;
        }
        else
        {
            scholarshipScore = scholarshipScore + (20 * noOfAcademicHonorsReceived);
        }
        scholarshipScore = scholarshipScore - (5 * totalAnnualFamilyIncome / 5000);
        System.out.println("Total scholarship score: " + scholarshipScore);

        boolean bGPA = GPA >= 3.5;
        boolean bCH = NoOfCompletedCreditHours >= 30;
        boolean bEAH = extracurricularActivityHours>= 20;
        boolean bIncome = totalAnnualFamilyIncome <= 75000;
        boolean bScore = scholarshipScore >= 900;

        if(bGPA && bCH && bEAH && bIncome && bScore)
        {
            System.out.println("The student is eligible for the scholarship.");
        }
        else
        {
            System.out.println("The student is not eligible for the scholarship. Reason:");
        }    
        if(!bGPA)
        {
            System.out.println("GPA is below 3.5.");
        }    
        if(!bCH)
        {
            System.out.println("Fewer than 30 completed credit hours.");
        }
        if(!bEAH)
        {
            System.out.println("Fewer than 20 extracurricular activity hours.");
        }
        if(!bIncome)
        {
            System.out.println("Family income exceeds $75000.");
        }
        if(!bScore)
        {
            System.out.println("Total scholarship score is below 900 points.");
        }
    }
}

   
    


