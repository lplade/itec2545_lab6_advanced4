package name.lplade;

import java.util.ArrayList;

public class LakeList {
    ArrayList<Lake> lakes = new ArrayList<>();

    //constructor
    LakeList() {
        //leave empty?
    }

    void addRun(String newLake, double newTime ) {
        Boolean lakeExists = false;
        //Iterate through all the lakes to match
        for(Lake lake: this.lakes) {
            if (lake.name.equals(newLake)){
                //add the run
                lake.addRun(newTime);
                lakeExists = true;
                break; //break out of for loop now to save time
            }
        }
        if (! lakeExists) { //if by this point we haven't matched,
            //construct a new Lake and add it to the list
            this.lakes.add(new Lake(newLake, newTime));
        }
    }
}
