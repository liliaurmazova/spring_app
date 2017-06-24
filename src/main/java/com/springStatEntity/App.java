package com.springStatEntity;

import com.utils.GsonCreator;

import java.io.IOException;

/**
 * Created by lurmazova on 24.06.17.
 */

public class App {
    public static void main(String[] args) throws IOException {

        GsonCreator gsonCreator = new GsonCreator();
        gsonCreator.saveStatisticsInJson();

    }

}
