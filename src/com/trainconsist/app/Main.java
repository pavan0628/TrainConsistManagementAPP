package com.trainconsist.app;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //welcome message displayed when application start
        System.out.println("========Train Consist management app========");

        //dynamic collection to store bogies initially empty
        List<String> trainConsist=new ArrayList<>();

        //display initial bogie count
        System.out.println("Initial bogie count: "+trainConsist.size());
    }
}
