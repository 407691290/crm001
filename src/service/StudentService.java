package service;

import domain.Student;
import domain.vo.StudentAndClassRoom;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
import java.util.Map;

public interface StudentService {
	Student findById(int id);
	List<Student> getAll();
	int addStudent(Student student);
	List<Student> getAge(int age);

	List<Student> getStu(Map<String, Object> map);

	List<Student> getStu1(String name);

	List<Map<String, Object>> getStu2();

	List<Student> getStu3();

	List<Student> getStu4(Student student);

	List<Student> getStu5(String[] arr);

	List<Map<String, Object>> getStu6();

	List<StudentAndClassRoom> getStu7(String name);
}
