package lab2;
/**
 * Lab02_Q1
 */
import java.util.Scanner;
public class Lab02_Q1 {

    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        System.out.print("Enter volume of sphere: "); 
        double volumeOfSphere = I.nextDouble();
        double r = Math.pow((3.0 * volumeOfSphere / 4.0 / Math.PI),1.0/3.0);
        double A = 4.0 * Math.PI * r * r;
        System.out.printf("%-58s %5.1f" , "The radius of the sphere is:"    , r);
        System.out.printf("\n%-58s %5.1f" , "The surface area of the sphere is: ", A);
        
    }
}