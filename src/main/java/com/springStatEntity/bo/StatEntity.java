package com.springStatEntity.bo;

import java.util.Date;

/**
 * Created by lurmazova on 10.06.17.
 */
public class StatEntity {
    public String name;
    public Integer value;
    public Date date;

    public StatEntity(){

    }

    public StatEntity (String name, int value, Date date) {
        this.name = name;
        this.value = value;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public Integer getValue() {
       return value;
    }

    public Date getDate() {
        return date;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setValue(Integer value){
        this.value = value;
    }

    public void setDate(Date date){
        this.date = date;
    }


}
