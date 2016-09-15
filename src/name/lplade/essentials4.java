package name.lplade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class essentials4 {

    static Scanner stringScanner = new Scanner(System.in);
    static Scanner numberScanner = new Scanner(System.in);

    public static void main(String[] args) {

        HashMap<String, ArrayList<Double>> runs = new HashMap<String, ArrayList<Double>>();


        stringScanner.close();
        numberScanner.close();
    }

    private static HashMap<String, ArrayList<Double>> newRun(HashMap currentHash){
        System.out.println("Which lake did you run around?");
        String newLake = stringScanner.nextLine();
        System.out.println("What was your time for the run?");
        double newTime = numberScanner.nextDouble();



        return
    }
}

