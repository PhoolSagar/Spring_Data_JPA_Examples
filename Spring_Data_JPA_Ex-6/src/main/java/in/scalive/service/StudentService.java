package in.scalive.service;

import java.util.List;
import java.util.Optional;

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
		System.out.println("Repo class name : " + repo.getClass().getName());
		System.out.println();
	}

	public Optional<Student> findById(Integer id) {
		return repo.findById(id);
	}
	
	public Iterable<Student> findAllStudents(){
		return repo.findAll();
	}
	
	public boolean deleteById(Integer id) {
		if(repo.existsById(id)) {
			repo.deleteById(id);
			return true;
		}
		return false;
	}

	public long countAllStudents() {
		return  repo.count();
	}
	public void deleteAllById(List<Integer> li) {
		repo.deleteAllById(li);
	}
}
