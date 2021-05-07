package service.impl;

import dao.StudentDao;
import domain.Student;
import domain.vo.StudentAndClassRoom;
import service.StudentService;
import utils.SqlSessionUtil;

import java.util.List;
import java.util.Map;

public class StudentServiceImpl implements StudentService {
	StudentDao studentDao = SqlSessionUtil.getSqlSession().getMapper(StudentDao.class);

	@Override
	public Student findById(int id) {
		Student student = studentDao.getById(id);
		return student;
	}

	@Override
	public List<Student> getAll() {
		List<Student> students = studentDao.getAll();
		return students;
	}

	@Override
	public int addStudent(Student student) {
		int rs = studentDao.ins(student);
		return rs;
	}

	@Override
	public List<Student> getAge(int age) {
		List<Student> list =studentDao.getAge(age);
		return list;
	}

	@Override
	public List<Student> getStu(Map<String, Object> map) {
		List<Student> list =studentDao.getMap(map);
		return list;
	}

	@Override
	public List<Student> getStu1(String name) {
		List<Student> list =studentDao.getStu2(name);
		return list;
	}

	@Override
	public List<Map<String, Object>> getStu2() {
		List<Map<String, Object>> list =studentDao.getStu1();
		return list;
	}

	@Override
	public List<Student> getStu3() {
		List<Student> list =studentDao.getStu3();
		return list;
	}

	@Override
	public List<Student> getStu4(Student student) {
		List<Student> list =studentDao.getStu4(student);
		return list;
	}

	@Override
	public List<Student> getStu5(String[] arr) {
		List<Student> list =studentDao.getStu5(arr);
		return list;
	}

	@Override
	public List<Map<String, Object>> getStu6() {
		List<Map<String, Object>> list =studentDao.getStu6();
		return list;
	}

	@Override
	public List<StudentAndClassRoom> getStu7(String name) {
		List<StudentAndClassRoom> list = studentDao.getStu7(name);
		return list;
	}
}
