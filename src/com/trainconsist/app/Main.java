package com.trainconsist.app;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //ArrayList to store passanger bogies
        List<String> passangerBogies=new ArrayList<>();

        //add passanger bogies
        passangerBogies.add("Sleeper");
        passangerBogies.add("AC chair");
        passangerBogies.add("First class");


        //print list after insertion
        System.out.println("After addition: "+passangerBogies);


        //remove AC Chair
        passangerBogies.remove("AC chair");


        //check whether the sleep exists
        boolean exists=passangerBogies.contains("Sleeper");

        System.out.println("Sleepr exists: "+exists);

        //final state
        System.out.println("Final list: "+passangerBogies);






    }
}
