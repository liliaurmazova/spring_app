package com.utils;

import com.google.gson.Gson;
import com.springStatEntity.bo.StatEntity;
import com.springStatEntity.bo.Statistics;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by lurmazova on 24.06.17.
 */
public class GsonCreator {

    private ArrayList<StatEntity> getListFromBean() {
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("application-context.xml"));
        Statistics statistics = (Statistics)factory.getBean("StatisticsBean");
        ArrayList<StatEntity> statEntityList = new ArrayList<StatEntity>();

        for(int i=0; i<statistics.getStatEntityList().size(); i++) {
            statEntityList.add(statistics.getStatEntityList().get(i));
        }
        return statEntityList;
    }

    public void saveStatisticsInJson() throws IOException {
        Gson gson = new Gson();
        String statJsonString = gson.toJson(getListFromBean());
        FileUtils.writeStringToFile(new File("data/statistics.json"), statJsonString);
    }
}
