// Jose Guzman
// October 1, 2023
// Description: Converts gallons to liters
// File name: Repitition.java
// To Compile in terminal type: javac Repitition.java
// To Run in terminal type: java Repitition


public class Repitition {
    public static void main(String[] args) {
        double gallons;
        double liters;

        // Using a while loop
        gallons = 10.0;
        System.out.println("Using while loop:");
        while (gallons <= 20.0) {
            liters = gallons * 3.785;
            System.out.println(gallons + " gallons = " + liters + " liters");
            gallons++;
        }

        // Using a for loop
        System.out.println("\nUsing for loop:");
        for (gallons = 10.0; gallons <= 20.0; gallons++) {
            liters = gallons * 3.785;
            System.out.println(gallons + " gallons = " + liters + " liters");
        }
    }
}

/*
Using while loop:
10.0 gallons = 37.85 liters
11.0 gallons = 41.635000000000005 liters
12.0 gallons = 45.42 liters
13.0 gallons = 49.205 liters
14.0 gallons = 52.99 liters
15.0 gallons = 56.775000000000006 liters
16.0 gallons = 60.56 liters
17.0 gallons = 64.345 liters
18.0 gallons = 68.13 liters
19.0 gallons = 71.915 liters
20.0 gallons = 75.7 liters

Using for loop:
10.0 gallons = 37.85 liters
11.0 gallons = 41.635000000000005 liters
12.0 gallons = 45.42 liters
13.0 gallons = 49.205 liters
14.0 gallons = 52.99 liters
15.0 gallons = 56.775000000000006 liters
16.0 gallons = 60.56 liters
17.0 gallons = 64.345 liters
18.0 gallons = 68.13 liters
19.0 gallons = 71.915 liters
20.0 gallons = 75.7 liters

*/




