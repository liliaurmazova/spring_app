package com.springStatEntity.converter;

import com.springStatEntity.bo.StatEntity;
import org.springframework.core.convert.ConversionFailedException;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.converter.Converter;

public class StatEntityToStringConverter implements Converter<StatEntity, String>{

    @Override
    public String convert(StatEntity statEntity) {
        if (statEntity == null){
            throw new ConversionFailedException(TypeDescriptor.valueOf(StatEntity.class),
                    TypeDescriptor.valueOf(String.class), statEntity, null);
        }

        StringBuilder builder = new StringBuilder();
        builder.append(statEntity.getName());
        builder.append("-");
        builder.append(statEntity.getValue().toString());
        builder.append("-");
        builder.append(statEntity.getDate().toString());
        return builder.toString();
    }

}
