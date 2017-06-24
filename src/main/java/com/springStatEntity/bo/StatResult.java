package com.springStatEntity.bo;

import java.util.Date;

/**
 * Created by lurmazova on 24.06.17.
 */
public class StatResult {

    public int avgNameLength;
    public int minValue;
    public int maxValue;
    public Date minDate;
    public Date maxDate;

    public StatResult(int avgNameLength, int minValue, int maxValue, Date minDate, Date maxDate) {
        this.avgNameLength = avgNameLength;
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.minDate = minDate;
        this.maxDate = maxDate;
    }

    public int getAvgNameLength() {
        return avgNameLength;
    }

    public int getMinValue() {
        return minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public Date getMinDate() {
        return minDate;
    }

    public Date getMaxDate() {
        return maxDate;
    }

    public void setAvgNameLength(int avgNameLength) {
        this.avgNameLength = avgNameLength;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public void setMinDate(Date minDate) {
        this.minDate = minDate;
    }

    public void setMaxDate(Date maxDate) {
        this.maxDate = maxDate;
    }
}
