package com.task.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

import com.task.task;

@Repository

public interface ITaskRepository extends JpaRepository<task ,long>{
                                      
}
