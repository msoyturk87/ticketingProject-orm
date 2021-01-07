package com.cybertek.service;

import com.cybertek.dto.TaskDTO;
import com.cybertek.dto.UserDTO;

import java.util.List;

public interface TaskService {

    List<TaskDTO> listAllTasks();
    TaskDTO findById(Long id);
    TaskDTO save(TaskDTO dto);
    void update(TaskDTO dto);
    void delete(Long id);
}
