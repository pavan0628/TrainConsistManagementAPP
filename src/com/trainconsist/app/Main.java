package com.trainconsist.app;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //preserve insertion order and uniqueness
        Set<String> formation=new LinkedHashSet<>();

        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");
        formation.add("Sleeper");

        //duplicate sleeper ignored
        System.out.println(formation);
    }
}
