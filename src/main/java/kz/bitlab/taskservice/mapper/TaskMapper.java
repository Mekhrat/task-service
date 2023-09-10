package kz.bitlab.taskservice.mapper;

import kz.bitlab.taskservice.entity.Task;
import kz.bitlab.taskservice.model.TaskDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskMapper {

    TaskDto toTaskDto(Task task);
    Task toTask(TaskDto dto);
    List<TaskDto> toListTaskDto(List<Task> tasks);
}
