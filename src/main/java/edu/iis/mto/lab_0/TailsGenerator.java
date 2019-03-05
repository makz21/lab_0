package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        if (value == null) {
            return new ArrayList<>(0);
        }
        ArrayList<String> listOfTrimStr = new ArrayList<>();
        listOfTrimStr.add(value);
        for (int i = 0; i < value.length(); i++) {
            listOfTrimStr.add(value.substring(i + 1, value.length()));
        }
        System.out.println(listOfTrimStr);
        return listOfTrimStr;
    }

}
