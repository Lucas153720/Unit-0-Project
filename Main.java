/*
    Unit 0 Project
    Name: Lucas Martins
    Date: 8/6/2025
    Description: Design of Name Initials Using Mathematical Constants
*/

public class Main {
    public static void main(String[] args) {

        // Each initial will be represented by the digits of a popular mathematical constant.
        // The number each letter represents decreases as you move to the right.

        // First Initial (L): Pi, represented by 3.141592653589...
        // Second Initial (G): Euler's Number (e), represented by 2.718281828459045235...
        // Third Initial (M): Square Root of 2, represented by 1.41421356237309504880168872...

        // The digits embedded in each initial are read from left to right.
        // All digits after the first are considered to be after a decimal point.
        
        // Each print statement prints a line of all 3 initials.
        // Each initial is kept 3 spaces apart.
        
        System.out.println("31      27182   14       14");
        System.out.println("41      81      213     562");
        System.out.println("59      82 84   37 30 95 04");
        System.out.println("26      59  0   88   0   16");
        System.out.println("53589   45235   88       72");
    }
}
