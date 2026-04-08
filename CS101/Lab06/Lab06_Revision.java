package lab6;
import java.util.Scanner;



public class Lab06_Revision {

    public static long binaryNOR(int a, int b)
    {
        long sum=0;
        char cha = ' ';
        char chb = ' ';
        int tempa =a;
        long intToBinarya= 0;
        int ia =2;
        int counta = 1;
        while(a>ia)
        {
            counta++;
            ia = ia * 2;
        }
        for(double j = counta ; j > 0 ; j--)
        {
            intToBinarya = intToBinarya + (int) (tempa / Math.pow(2.0,j-1)) *(int) Math.pow(10, j-1);
            tempa = tempa - (int) Math.pow(2.0,j-1) * (int) (tempa / Math.pow(2.0,j-1));
        }
        int tempb =b;
        long intToBinaryb= 0;
        int ib =2;
        int countb = 1;
        while(b>ib)
        {
            countb++;
            ib = ib * 2;
        }
        for(double j = countb ; j > 0 ; j--)
        {
            intToBinaryb = intToBinaryb + (int) (tempb / Math.pow(2.0,j-1)) *(int) Math.pow(10, j-1);
            tempb = tempb - (int) Math.pow(2.0,j-1) * (int) (tempb / Math.pow(2.0,j-1));
        }
        String firstNumber = Integer.toString((int) intToBinarya);
        String secondNumber = Integer.toString((int) intToBinaryb);
        for(int i=0; i<firstNumber.length(); i++)
        {
        
            
            cha= firstNumber.charAt(i);
            chb = secondNumber.charAt(i);
            if(cha=='0' && chb =='0')
            {
                sum= sum + (long) Math.pow(10,firstNumber.length()-i-1);
            }
                
            
        }
        return sum;

    
    }

public static long binaryAND(int a, int b)
{
    long sum=0;
    char cha = ' ';
    char chb = ' ';
    int tempa =a;
    long intToBinarya= 0;
    int ia =2;
    int counta = 1;
    while(a>ia)
    {
        counta++;
        ia = ia * 2;
    }
    for(double j = counta ; j > 0 ; j--)
    {
        intToBinarya = intToBinarya + (int) (tempa / Math.pow(2.0,j-1)) *(int) Math.pow(10, j-1);
        tempa = tempa - (int) Math.pow(2.0,j-1) * (int) (tempa / Math.pow(2.0,j-1));
    }
    int tempb =b;
    long intToBinaryb= 0;
    int ib =2;
    int countb = 1;
    while(b>ib)
    {
        countb++;
        ib = ib * 2;
    }
    for(double j = countb ; j > 0 ; j--)
    {
        intToBinaryb = intToBinaryb + (int) (tempb / Math.pow(2.0,j-1)) *(int) Math.pow(10, j-1);
        tempb = tempb - (int) Math.pow(2.0,j-1) * (int) (tempb / Math.pow(2.0,j-1));
    }
    String firstNumber = Integer.toString((int) intToBinarya);
    String secondNumber = Integer.toString((int) intToBinaryb);
    for(int i=0; i<firstNumber.length(); i++)
    {
        cha= firstNumber.charAt(i);
        chb = secondNumber.charAt(i);
        if(cha=='1' && chb =='1')
        {
            sum= sum + (long) Math.pow(10,firstNumber.length()-i-1);
        }
            
    }
    return sum;

    
}
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int x = in.nextInt();
        System.out.print("Enter the second number: ");
        int y = in.nextInt();
        System.out.println("\nNOR operation is " + binaryNOR(x,y));
        System.out.println("AND operation is " + binaryAND(x,y));
    }   
}
