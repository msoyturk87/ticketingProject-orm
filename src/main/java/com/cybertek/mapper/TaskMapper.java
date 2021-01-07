package com.cybertek.mapper;

import com.cybertek.dto.RoleDTO;
import com.cybertek.dto.TaskDTO;
import com.cybertek.entity.Role;
import com.cybertek.entity.Task;
import org.modelmapper.ModelMapper;

public class TaskMapper {

    private ModelMapper modelMapper;

    public TaskMapper(ModelMapper modelMapper) {

        this.modelMapper = modelMapper;
    }

    public Task convertToEntity(TaskDTO dto){

        return modelMapper.map(dto,Task.class);
    }

    public TaskDTO convertToDto(Role entity){

        return modelMapper.map(entity,TaskDTO.class);
    }


}