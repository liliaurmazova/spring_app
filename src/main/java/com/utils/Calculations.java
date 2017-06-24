package com.utils;

import com.springStatEntity.bo.StatEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by lurmazova on 24.06.17.
 */
public class Calculations {

    public BeanParser beanParser = new BeanParser();
    public ArrayList<StatEntity> statEntities = beanParser.getListFromBean();

    public int getAverageNameLength() {
        int sumOfAllNameLength = 0;
        for(int i=0; i<statEntities.size(); i++){
           sumOfAllNameLength = sumOfAllNameLength + statEntities.get(i).getName().length();
        }
        return sumOfAllNameLength/statEntities.size();
    }

    public int getMinValue() {
       int minValue = statEntities.get(0).getValue();
       for(int i=0; i<statEntities.size(); i++){
           if (minValue > statEntities.get(i).getValue())
               minValue = statEntities.get(i).getValue();
       }
        return minValue;
    }

    public int getMaxValue() {
        int maxValue = statEntities.get(0).getValue();
        for(int i=0; i<statEntities.size(); i++){
            if (maxValue < statEntities.get(i).getValue())
                maxValue = statEntities.get(i).getValue();
        }
        return maxValue;
    }

    public Date getMinDate() {
        SortedSet<Date> dateSortedSet = new TreeSet<Date>();
        for(int i=0; i<statEntities.size(); i++){
            dateSortedSet.add(statEntities.get(i).getDate());
        }
        return dateSortedSet.first();
    }

    public Date getMaxDate() {
        SortedSet<Date> dateSortedSet = new TreeSet<Date>();
        for(int i=0; i<statEntities.size(); i++){
            dateSortedSet.add(statEntities.get(i).getDate());
        }
        return dateSortedSet.last();
    }
}
