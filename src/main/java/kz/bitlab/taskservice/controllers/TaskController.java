package kz.bitlab.taskservice.controllers;


import kz.bitlab.taskservice.model.TaskDto;
import kz.bitlab.taskservice.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @GetMapping
    public List<TaskDto> getAll() {
        return taskService.getAll();
    }

    @GetMapping("/{id}")
    public TaskDto get(@PathVariable Long id) {
        return taskService.get(id);
    }

    @PostMapping
    public TaskDto add(@RequestBody TaskDto dto) {
        return taskService.add(dto);
    }
}
