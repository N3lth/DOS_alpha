package com.mag.student.repository;

import com.mag.student.entities.Student;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Nelth on 2017-04-17.
 */
public interface StudentRepository extends CrudRepository<Student, Long>{
}
