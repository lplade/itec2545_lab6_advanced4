package name.lplade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class essentials4 {

    private static Scanner stringScanner = new Scanner(System.in);
    private static Scanner numberScanner = new Scanner(System.in);

    public static void main(String[] args) {

        HashMap<String, ArrayList<Double>> runMap = new HashMap<>();

        String stopEntry;
        do {
            //Input a run
            runMap = newRun(runMap);
            System.out.print("Enter another run? (Y/N)" );
            stopEntry = stringScanner.nextLine();
            //TODO fancier Y/N checking
        } while (stopEntry.toLowerCase().equals("y")); //keep going until we're done


        showFastestRuns(runMap);

        System.out.println();

        stringScanner.close();
        numberScanner.close();
    }

    private static HashMap<String, ArrayList<Double>> newRun(HashMap<String, ArrayList<Double>> inHash){
        System.out.println("Which lake did you run around?");
        String newLake = stringScanner.nextLine();
        //TODO error trapping

        //Pull the value ArrayList from inHash, if any
        ArrayList<Double> thisLakeRunList = inHash.get(newLake);
        System.out.println("What was your time for the run?");
        double newTime = numberScanner.nextDouble();
        //TODO error trapping

        //If this is a new lake, initialize a new ArrayList
        if (thisLakeRunList == null) {
            thisLakeRunList = new ArrayList<Double>();
        }
        //still working with just the ArrayList
        thisLakeRunList.add(newTime);

        //now save the revised ArrayList back to the HashMap
        inHash.put(newLake, thisLakeRunList);

        return inHash;
    }

    private static void showFastestRuns(HashMap<String, ArrayList<Double>> inHash){
        System.out.println();
        System.out.println("*** FASTEST RUNS ***");

        //iterate over each lake in the HashMap
        for (Object lake : inHash.keySet()) {
            //get the ArrayList of run times for this lake
            ArrayList<Double> thisLakeRunList = inHash.get(lake);
            double fastestTimeForThisLake = 99999; //arbitrarily high
            for (Object run : thisLakeRunList) {
                double runTime = (double) run; //type conversion
                if ( runTime < fastestTimeForThisLake) {
                    fastestTimeForThisLake = runTime; //track lowest run
                }
            }
            String lakeName = (String) lake; //type conversion
            System.out.printf("%s: %.2f\n", lakeName, fastestTimeForThisLake);
        }
    }
}

