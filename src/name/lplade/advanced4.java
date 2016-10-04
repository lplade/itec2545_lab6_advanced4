package name.lplade;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class advanced4 {

    private static Scanner stringScanner = new Scanner(System.in);
    private static Scanner numberScanner = new Scanner(System.in);

    public static void main(String[] args) {

        //initialize a list of Lake objects
        ArrayList<Lake> lakeList = new ArrayList<>();

        //main input loop
        String stopEntry;
        do {
            System.out.println("Which lake did you run around?");
            String newLake = stringScanner.nextLine();
            //TODO input error trapping

            System.out.println("What was your time for the run?");
            double newTime = numberScanner.nextDouble();
            //TODO input error trapping

            Boolean lakeExists = false;
            for(Lake lake: lakeList) {
                if (lake.name.equals(newLake)){
                    //add the run
                    lake.addRun(newTime);
                    lakeExists = true;
                    //TODO break out of foreach to save time
                }
            }
            if (! lakeExists) {
                //construct a new Lake and add it to the list
                lakeList.add(new Lake(newLake, newTime));
            }

            System.out.print("Enter another run? (Y/N) " );
            stopEntry = stringScanner.nextLine();
            //TODO fancier Y/N checking

        } while (stopEntry.toLowerCase().equals("y")); //keep going until we're done

        System.out.println();
        System.out.println("*** FASTEST RUNS ***");

        for (Lake lake : lakeList) {
            System.out.printf("%s: %.2f\n", lake.name, lake.fastestRun);
        }

        stringScanner.close();
        numberScanner.close();
    }

}

