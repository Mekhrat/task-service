package kz.bitlab.taskservice.model;

import lombok.*;

import javax.persistence.Column;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TaskDto {

    private Long id;
    private String title;
    private String description;
    private String status;
    private Long authorId;
}
