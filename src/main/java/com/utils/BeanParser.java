package com.utils;

import com.springStatEntity.bo.StatEntity;
import com.springStatEntity.bo.Statistics;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import java.util.ArrayList;

/**
 * Created by lurmazova on 24.06.17.
 */
public class BeanParser {

    public ArrayList<StatEntity> getListFromBean() {
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("application-context.xml"));
        Statistics statistics = (Statistics)factory.getBean("StatisticsBean");
        ArrayList<StatEntity> statEntityList = new ArrayList<StatEntity>();

        for(int i=0; i<statistics.getStatEntityList().size(); i++) {
            statEntityList.add(statistics.getStatEntityList().get(i));
        }
        return statEntityList;
    }
}
