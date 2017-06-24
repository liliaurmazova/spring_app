package com.utils;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by lurmazova on 24.06.17.
 */
public class GsonCreator {

    public void saveStatisticsInJson() throws IOException {
        Gson gson = new Gson();
        BeanParser beanParser = new BeanParser();
        String statJsonString = gson.toJson(beanParser.getListFromBean());
        writeToFile(statJsonString, "src/main/resources/data/sourceStatData.json");
    }


    public void writeToFile(String content, String path){
        File file = new File(path);

        try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
            if (!file.exists()) {
                file.createNewFile();
            }
            byte[] contentInBytes = content.getBytes();

            fileOutputStream.write(contentInBytes);
            fileOutputStream.flush();
            fileOutputStream.close();

            System.out.println("Json is saved to file");
            System.out.println("Json file content is " + content);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
