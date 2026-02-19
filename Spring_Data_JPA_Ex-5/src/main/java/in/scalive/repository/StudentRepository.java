package in.scalive.repository;

import org.springframework.data.repository.CrudRepository;

import in.scalive.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{

}
