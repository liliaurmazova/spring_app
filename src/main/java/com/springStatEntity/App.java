package com.springStatEntity;

import com.utils.GsonCreator;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws IOException {
        //BeanFactory factory = new XmlBeanFactory(new ClassPathResource("application-context.xml"));
       // Statistics statistics = (Statistics)factory.getBean("StatisticsBean");
        GsonCreator gsonCreator = new GsonCreator();
        gsonCreator.saveStatisticsInJson();

        //System.out.println(statistics.getStatEntityList().get(0).getName());

    }

}
