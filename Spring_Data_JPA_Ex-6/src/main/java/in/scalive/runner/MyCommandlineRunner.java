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
		
		System.out.println("Count : " + serv.countAllStudents());
		List<Integer> list = List.of(15,18);
		serv.deleteAllById(list);
 	}

}
