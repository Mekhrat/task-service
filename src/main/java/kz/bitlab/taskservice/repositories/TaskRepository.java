package kz.bitlab.taskservice.repositories;

import kz.bitlab.taskservice.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface TaskRepository extends JpaRepository<Task, Long> {
}
