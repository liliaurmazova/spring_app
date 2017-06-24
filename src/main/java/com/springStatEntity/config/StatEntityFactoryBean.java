package com.springStatEntity.config;

import com.springStatEntity.bo.StatEntity;
import com.utils.RandomGenerator;
import org.springframework.beans.factory.config.AbstractFactoryBean;

/**
 * Created by lurmazova on 10.06.17.
 */
public class StatEntityFactoryBean extends AbstractFactoryBean<Object> {

    @Override
    protected Object createInstance() throws Exception
    {
        StatEntity statEntity = new StatEntity();
        RandomGenerator randomGenerator = new RandomGenerator();

        statEntity.setName(randomGenerator.getRandomString());
        statEntity.setValue(randomGenerator.getRandomInt());
        statEntity.setDate(randomGenerator.getRandomDateFromCurrentDate());
        return statEntity;
    }

    @Override
    public Class<StatEntity> getObjectType() {
        return StatEntity.class;
    }


}


