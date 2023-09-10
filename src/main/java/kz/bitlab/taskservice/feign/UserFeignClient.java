package kz.bitlab.taskservice.feign;


import kz.bitlab.taskservice.model.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "user-feign-client", url = "${user.feign.client.url}")
public interface UserFeignClient {

    @GetMapping
     List<UserDto> getAll();

    @GetMapping("/{id}")
    UserDto get(@PathVariable Long id);
}
