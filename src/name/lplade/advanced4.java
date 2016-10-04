package name.lplade;

import java.util.Scanner;

public class advanced4 {

    private static Scanner stringScanner = new Scanner(System.in);
    private static Scanner numberScanner = new Scanner(System.in);

    public static void main(String[] args) {

        //initialize a list of Lake objects
        LakeList lakeList = new LakeList();

        //main input loop
        String stopEntry;
        do {
            System.out.println("Which lake did you run around?");
            String newLake = stringScanner.nextLine();
            //TODO input error trapping

            System.out.println("What was your time for the run?");
            double newTime = numberScanner.nextDouble();
            //TODO input error trapping

            lakeList.addRun(newLake, newTime);

            System.out.print("Enter another run? (Y/N) " );
            stopEntry = stringScanner.nextLine();
            //TODO fancier Y/N checking

        } while (stopEntry.toLowerCase().equals("y")); //keep going until we're done

        System.out.println();
        System.out.println("*** FASTEST RUNS ***");

        //various permutations on "lake" are perhaps not great practice
        for (Lake lake : lakeList.lakes) {
            System.out.printf("%s: %.2f\n", lake.name, lake.fastestRun);
        }

        stringScanner.close();
        numberScanner.close();
    }

}

