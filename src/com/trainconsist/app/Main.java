package com.trainconsist.app;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //represents train consist
        LinkedList<String> consist=new LinkedList<>();

        //add bogies
        consist.add("Engine");
        consist.add("Sleeper");
        consist.add("AC");
        consist.add("Cargo");
        consist.add("Guard");

        //Insert pantry at index2
        consist.add(2,"Pantry Car");

        //remove first bogie
        consist.removeFirst();

        //remove last bogie
        consist.removeLast();

        //final consist
        System.out.println("Final list: "+consist);


    }
}
