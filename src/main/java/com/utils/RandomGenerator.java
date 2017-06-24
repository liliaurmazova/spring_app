package com.utils;

import org.apache.commons.lang3.RandomStringUtils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by lurmazova on 10.06.17.
 */
public class RandomGenerator {

    public RandomGenerator(){

    }

    public String getRandomString(){
        return RandomStringUtils.randomAlphabetic(10).toLowerCase();
    }

    public int getRandomInt() {
        return Integer.parseInt(RandomStringUtils.randomNumeric(10));
    }

    public int getRandomInt(int length) {
        return Integer.parseInt(RandomStringUtils.randomNumeric(length));
    }

    public Date getRandomDateFromCurrentDate() {
        final Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, (-1 * getRandomInt(50)));
        return cal.getTime();
    }

    private String getYesterdayDateString() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        return dateFormat.format(getRandomDateFromCurrentDate());
    }

}
