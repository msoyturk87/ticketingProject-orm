package com.cybertek.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.lang.reflect.Type;

@Component
public class MapperUtil {

    private ModelMapper modelMapper;

    public MapperUtil(ModelMapper modelMapper) {

        this.modelMapper = modelMapper;
    }

  /*
    public <T> T converToEntity(Object objectToBeConverted,T convertedObject){

        return modelMapper.map(objectToBeConverted, (Type) convertedObject.getClass());
    }

    public <T> T convertToDTO(Object objectToBeConverted,T convertedObject){

        return modelMapper.map(objectToBeConverted,(Type) convertedObject.getClass());
    }*/
    // this method can handle upper two method
    public <T> T convert(Object objectToBeConverted,T convertedObject){

        return modelMapper.map(objectToBeConverted, (Type) convertedObject.getClass());
    }
}
