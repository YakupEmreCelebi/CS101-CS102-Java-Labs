package lab2;

import java.util.Scanner;
public class Lab02_Q2_Revision {
    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        final double mercuryGravityMultiplier = 0.38;
        final double venusGravityMultiplier = 0.91;
        final double marsGravityMultiplier = 0.38;
        final double jupiterGravityMultiplier = 2.34;
        final double plutoGravityMultlipier = 0.06;
        System.out.print("Enter first pluto weight of first earthling(kg): ");
        double firstPlutoWeight = I.nextDouble();
        System.out.print("Enter second weight of second earthling(kg): ");
        double secondPlutoWeight = I.nextDouble();
        double firstEarthWeight = firstPlutoWeight / plutoGravityMultlipier;
        double firstMercuryWeight = firstEarthWeight * mercuryGravityMultiplier;
        double firstMarsWeight = firstEarthWeight * marsGravityMultiplier;
        double firstJupiterWeight = firstEarthWeight * jupiterGravityMultiplier;
        double firstVenusWeight = firstEarthWeight * venusGravityMultiplier;
        
        double secondEarthWeight = secondPlutoWeight / plutoGravityMultlipier;
        double secondMercuryWeight = secondEarthWeight * mercuryGravityMultiplier;
        double secondMarsWeight = secondEarthWeight * marsGravityMultiplier;
        double secondJupiterWeight = secondEarthWeight * jupiterGravityMultiplier;
        double secondVenusWeight = secondEarthWeight * venusGravityMultiplier;
        
        System.out.printf("%36s %8s %10s %12s %13s ", "MERCURY", "VENUS", "MARS", "JUPITER", "EARTH");
        System.out.printf("\nEARTHLING ONE( %4.1f kg)%9.1f %11.1f %10.1f %11.1f %14.1f", firstPlutoWeight , firstMercuryWeight,firstVenusWeight, firstMarsWeight, firstJupiterWeight , firstEarthWeight);
        System.out.printf("\nEARTHLING TWO( %4.1f kg)%9.1f %11.1f %10.1f %11.1f %14.1f", secondPlutoWeight , secondMercuryWeight,secondVenusWeight, secondMarsWeight, secondJupiterWeight , secondEarthWeight);
        
    }
    
}
