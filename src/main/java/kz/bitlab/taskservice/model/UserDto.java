package kz.bitlab.taskservice.model;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {

    private Long id;
    private String name;
    private String email;
    private LocalDateTime createdDate;
}
