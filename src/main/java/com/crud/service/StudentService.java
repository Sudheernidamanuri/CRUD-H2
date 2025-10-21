package com.crud.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.crud.model.Student;
import com.crud.repository.StudentRepository;

@Service
public class StudentService {
    @Autowired
	private StudentRepository studentRepository;
    //POST
    public String addStudent(Student student) {
    	
    	studentRepository.save(student);
    	return "The Student "+student.getName()+" has been successfully added into h2 db";
    }
    //GET
    public List<Student> getAllStudents(){
    	
    	return studentRepository.findAll();
    }
    //PUT
    public String updateStudent(Student student) {
    	
    	Optional<Student> s1=studentRepository.findById(student.getId());
    	
    	if(s1.isPresent()) {
    		
    		Student newStudent=s1.get();
    		
    		newStudent.setName(student.getName());
    		newStudent.setAge(student.getAge());
    		studentRepository.save(newStudent);
    		return "The "+student.getName()+" data of "+student.getId()+" has been successfully updated";
    		
    	}
    	
    	else return "Student not found in the db";
    
}
    //DELETE
    public String deleteStudent(int id) {
    	
    	if(studentRepository.existsById((long) id)) {
    		studentRepository.deleteById((long) id);
    		
    		return "The Student of ID "+id+" has been deleted successfully";
    	}
		return "There is no student exists with that ID";
    	
    	
    }
    
    
    
    
    
    
    
    
    
}
