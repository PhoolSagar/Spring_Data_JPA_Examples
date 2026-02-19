package in.scalive.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.scalive.model.Student;
import in.scalive.repository.StudentRepository;

@Service
public class StudentService {

	private StudentRepository repo;
	
	@Autowired
	public StudentService(StudentRepository repo) {
		this.repo = repo;
		System.out.println();
		System.out.println("Repo class name : "+ repo.getClass().getName());
		System.out.println();
	}


	public Iterable<Student> saveAllStudents(List<Student>stList) {
		return repo.saveAll(stList);
	}

}
