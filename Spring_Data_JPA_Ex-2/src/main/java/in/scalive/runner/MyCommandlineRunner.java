package in.scalive.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.scalive.model.Student;
import in.scalive.service.StudentService;
@Component
public class MyCommandlineRunner implements CommandLineRunner {

	@Autowired
	private StudentService serv;
	
	@Override
	public void run(String... args) throws Exception {
		Student s1 = new Student();
		s1.setId(15);
		s1.setName("Mohan");
		s1.setPer(8.67);
		
		Student s2 = new Student();
		s2.setId(18);
		s2.setName("Sohan");
		s2.setPer(8.67);
		
	 List<Student> stList = List.of(s1, s2);
	 
	 Iterable<Student>sList = serv.saveAllStudents(stList);
	 
	 for(Student s: sList) {
		 System.out.println("Name : "+s.getName() + ", Id : "+ s.getId() + ", Per : "+s.getPer());
	 }
		
		
		
	}

}
