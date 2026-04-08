package lab2;

import java.util.Scanner;
public class Lab02_Q3 {
    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        // Craete main variables
        String date, day, month, year, hour, minute;

        // Get input from user
        System.out.print("Enter date and time: ");
        String dateAndTime = I.nextLine();

        // Other Variables
        int indexOfFirstSlash, indexOfSecondSlash, indexOfComma, indexOfCizgi, indexOfIkiNokta;
        indexOfFirstSlash = dateAndTime.indexOf('/');
        indexOfSecondSlash = dateAndTime.indexOf('/', indexOfFirstSlash + 1);
        indexOfComma = dateAndTime.indexOf(',');
        indexOfCizgi = dateAndTime.indexOf('-');
        indexOfIkiNokta = dateAndTime.indexOf(':');

        // Assignment of main variables
        year = dateAndTime.substring(0,indexOfFirstSlash).trim();
        month = dateAndTime.substring(indexOfFirstSlash+1, indexOfSecondSlash).trim();
        date = dateAndTime.substring(indexOfSecondSlash+1, indexOfComma).trim();;
        day = dateAndTime.substring(indexOfComma+1, indexOfCizgi).trim();;
        hour = dateAndTime.substring(indexOfCizgi+1, indexOfIkiNokta).trim();;
        minute = dateAndTime.substring(indexOfIkiNokta+1).trim();;

        // Print main variables
        System.out.printf("Date: %10s " , date);
        System.out.printf("\nDay: %4s " , day);
        System.out.printf("\nMonth: %3s " , month);
        System.out.printf("\nYear: %5s " , year);
        System.out.printf("\nTime: %20s " , minute + " minutes after " + hour);

        
    }
    
}
