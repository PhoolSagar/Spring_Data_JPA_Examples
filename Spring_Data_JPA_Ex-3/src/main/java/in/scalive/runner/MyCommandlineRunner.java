package in.scalive.runner;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.scalive.model.Student;
import in.scalive.service.StudentService;
import jdk.javadoc.doclet.Reporter;

@Component
public class MyCommandlineRunner implements CommandLineRunner {

	@Autowired
	private StudentService serv;

	@Override
	public void run(String... args) throws Exception {
		Optional<Student> op = serv.findById(11);
//		 if(op.isPresent()) {
//			 Student s = op.get();
//			 System.out.println("Name : "+s.getName());
//			 System.out.println("Id : "+s.getId());
//			 System.out.println("Per : "+s.getPer());
//			 
//			 
//		 }

		op.ifPresentOrElse(
				(s) -> System.out.println(
						"Id : " + s.getId() + 
						", Name : " + s.getName() + 
						", Per : " + s.getPer()
						),
				() -> System.out.println("Reconrd not found"));

	}

}
