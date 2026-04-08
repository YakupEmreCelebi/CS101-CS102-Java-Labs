package lab5;
import java.util.Scanner;
public class Lab05_Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean ask = true;
        int height=0;
        while(ask)
        {
            System.out.print("Please input the height: ");
            height = in.nextInt();
            ask = height > 31 || height<0;
        }  
        System.out.println("");
        System.out.println("*****" + "       " + "*****");
        for(int i=0; i < (height/2)-1; i++ )
        {
            System.out.println("*" + "          " + "*");
        }
        System.out.println("*"+ "           " + "*****");
        for(int i=0; i<(height-3)/2; i++)
        {
            System.out.println("*" + "                " + "*");
        }
        System.out.println("*****" + "       " + "*****");
    }
}
    

