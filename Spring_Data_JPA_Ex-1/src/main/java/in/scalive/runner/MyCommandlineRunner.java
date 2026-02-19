package in.scalive.runner;

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
		s1.setId(11);
		s1.setName("Mohan");
		s1.setPer(80.67);
		serv.saveStudents(s1);
		
		Student s2 = new Student();
		s2.setId(12);
		s2.setName("Sohan");
		s2.setPer(89.67);
		serv.saveStudents(s2);
		
		
		
	}

}
