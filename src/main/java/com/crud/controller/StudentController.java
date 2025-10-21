package com.crud.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.crud.model.Student;
import com.crud.service.StudentService;

@RestController
public class StudentController {
     
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/addStudent")
	 public String addStudent(@RequestBody Student student) {
		
		return studentService.addStudent(student);
	 }
	
	@GetMapping("/getStudent")
	 public List<Student> getAllStudents(){
		
		return studentService.getAllStudents();
	 }
	
	@PutMapping("/updateStudent")
	public String updateStudent(@RequestBody Student student) {
		
		return studentService.updateStudent(student);
	}
	
	@DeleteMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable int id) {
		
		return studentService.deleteStudent(id);
	}
}
