package myPack;

import java.util.ArrayList;

public class MethodsInJavaExercise {

    public MethodsInJavaExercise() {
    }

    public void getOddValues(int [] numArray){
        ArrayList<Integer> oddVals = new ArrayList<Integer>();

        for(int eachNumArray: numArray){
            if(eachNumArray%2!=0){
                oddVals.add(eachNumArray);
            }
        }

        displayOddValues(oddVals);
    }

    public void displayOddValues(ArrayList<Integer> oddVals){
        System.out.println("Odd Values:");
        for(Integer eachOddVals: oddVals){

            System.out.println(eachOddVals);
        }
    }
}
