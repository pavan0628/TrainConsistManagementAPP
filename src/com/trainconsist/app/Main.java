package com.trainconsist.app;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        //stores uniqiue bogie ids
        Set<String> bogieIds=new HashSet<>();

        //Add ids
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG101");

        //Duplicates BG101 automatically ignored
        System.out.println("Unique bogie IDs "+ bogieIds);


    }
}
