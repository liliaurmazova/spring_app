package com.springStatEntity.bo;

import java.util.ArrayList;

/**
 * Created by lurmazova on 10.06.17.
 */
public class Statistics {

    public ArrayList<StatEntity> statEntities;

    public Statistics() {

    }

    public ArrayList<StatEntity> getStatEntityList() { return statEntities; }

    public void setStatEntityList(ArrayList<StatEntity> statEntities) { this.statEntities = statEntities; }


}
