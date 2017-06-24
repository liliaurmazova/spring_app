package com.springStatEntity.converter;

import com.springStatEntity.bo.StatEntity;
import org.springframework.core.convert.ConversionFailedException;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by lurmazova on 24.06.17.
 */
public class StringToStatEntityConverter implements Converter<String, StatEntity> {

    @Override
    public StatEntity convert(String statEntityAsString) {

        if (statEntityAsString == null){
            throw new ConversionFailedException(TypeDescriptor.valueOf(String.class),
                    TypeDescriptor.valueOf(String.class), statEntityAsString, null);
        }

        String[] tempArray = statEntityAsString.split("-");
        Date statDate = new Date();

        try {
            DateFormat df = new SimpleDateFormat("mm/dd/yyyy");
            statDate = df.parse(tempArray[2]);
        }
        catch (ParseException parseException) {
            parseException.printStackTrace();
        }

        StatEntity statEntity = new StatEntity(tempArray[0], Integer.parseInt(tempArray[1]), statDate);
        return statEntity;
    }

}

