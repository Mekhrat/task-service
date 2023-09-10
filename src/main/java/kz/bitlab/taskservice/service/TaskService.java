package kz.bitlab.taskservice.service;

import kz.bitlab.taskservice.feign.UserFeignClient;
import kz.bitlab.taskservice.mapper.TaskMapper;
import kz.bitlab.taskservice.model.TaskDto;
import kz.bitlab.taskservice.model.UserDto;
import kz.bitlab.taskservice.repositories.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;
    private final TaskMapper taskMapper;
    private final UserFeignClient feignClient;

    public List<TaskDto> getAll() {
        return taskMapper.toListTaskDto(taskRepository.findAll());
    }

    public TaskDto get(Long id) {
        return taskRepository.findById(id)
                .map(taskMapper::toTaskDto)
                .orElse(null);
    }

    public TaskDto add(TaskDto dto) {
        UserDto userDto = feignClient.get(dto.getAuthorId());
        if (userDto != null) {
            dto.setStatus("NEW");
            return taskMapper.toTaskDto(taskRepository.save(taskMapper.toTask(dto)));
        }
        throw new RuntimeException("User not found");
    }
}
