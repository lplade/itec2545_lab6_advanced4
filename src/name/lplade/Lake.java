package name.lplade;

import java.util.ArrayList;

class Lake {
    String name;
    private ArrayList<Double> runTimes;
    double fastestRun = 99999; //arbitrarily high value

    //constructor
    Lake(String lakeName, double firstRun){
        this.name = lakeName;
        //initialize a new empty list
        this.runTimes = new ArrayList<Double>();

        //we need at least one run for a given lake, so require it at initialization time
        addRun(firstRun);
    }

    //simple setter
    void addRun(double runTime) {
        this.runTimes.add(runTime);
        //check if this is better than our best run
        if (runTime < fastestRun) {
            //update the record if so
            this.fastestRun = runTime;
        }
    }

    ArrayList<Double> getTimes() {
        return this.runTimes;
    }

}


