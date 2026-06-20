package com.trainconsist.app;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //bogie -> capacity
        Map<String,Integer> capacityMap=new HashMap<>();

        capacityMap.put("Sleeper",72);
        capacityMap.put("AC chair",56);
        capacityMap.put("First class",24);

        for (Map.Entry<String,Integer> entry:capacityMap.entrySet()){
            System.out.println("Bogie: "+entry.getKey()+ "No of seats available: "+entry.getValue());
        }

    }
}
