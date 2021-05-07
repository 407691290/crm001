package dao;

import domain.Student;
import domain.vo.StudentAndClassRoom;

import java.util.List;
import java.util.Map;

public interface StudentDao {
	Student getById(int id);
	List<Student> getAll();
	int ins(Student student);
	List<Student> getAge(int age);

	List<Student> getMap(Map<String, Object> map);

	List<Student> getStu2(String name);

	List<Map<String, Object>> getStu1();

	List<Student> getStu3();

	List<Student> getStu4(Student student);

	List<Student> getStu5(String[] arr);

	List<Map<String, Object>> getStu6();

	List<StudentAndClassRoom> getStu7(String name);
}
