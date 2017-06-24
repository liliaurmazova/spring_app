package com.springStatEntity;

import com.utils.Calculations;
import com.utils.GsonCreator;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws IOException {

        GsonCreator gsonCreator = new GsonCreator();
        gsonCreator.saveStatisticsInJson();
        Calculations calculations = new Calculations();

        StringBuilder statMessages = new StringBuilder();
        statMessages.append("Average name length = " + calculations.getAverageNameLength() + " | ");
        statMessages.append("Min value = " + calculations.getMinValue() + " | ");
        statMessages.append("Max value = " + calculations.getMaxValue() + " | ");
        statMessages.append("Min date = " + calculations.getMinDate() + " | ");
        statMessages.append("Max date = " + calculations.getMaxDate());

        System.out.println(statMessages);
        gsonCreator.writeToFile(statMessages.toString(), "src/main/resources/data/statCalculations.json");

    }

}
