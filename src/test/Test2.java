package test;

import com.sun.source.tree.NewArrayTree;
import domain.Student;
import domain.vo.StudentAndClassRoom;
import service.StudentService;
import service.impl.StudentServiceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test2 {


	public static void main(String[] args) {
		StudentService studentService = new StudentServiceImpl();
//		Student student = studentService.findById(11);
//		System.out.println(student);

//		List<Student> list = studentService.getAll();
//		for (Student s:list){
//			System.out.println(s);
//		}

//		List<Student> list = studentService.getAge(22);
//		for (Student s:list){
//			System.out.println(s);
//		}

//		List<Student> list = studentService.getStu1("三");
//		for (Student s:list){
//			System.out.println(s);
//		}

//		List<Student> list = studentService.getStu3();
//		for (Student s:list){
//			System.out.println(s);
//		}
//		Student student = new Student();
//		student.setName("王");
//		student.setAdress("阳");
//		List<Student> list = studentService.getStu4(student);
//		for (Student s:list){
//			System.out.println(s);
//		}

//		String [] arr = {"1","2","5"};
//		List<Student> list = studentService.getStu5(arr);
//		for (Student s:list){
//			System.out.println(s);
//		}

//		Map<String,Object> map = new HashMap<String,Object>();
//		map.put("name","史密斯");
//		map.put("age",28);
//		List<Student> listStu = studentService.getStu(map);
//		for (Student s:listStu){
//			System.out.println(s);
//		}

//		Student student = new Student();
//		student.setAge(28);
//		student.setId("12");
//		student.setName("史密斯");
//		int rs = studentService.addStudent(student);
//		System.out.println(rs);

//		List<Map<String,Object>> listMap = studentService.getStu2();
//		for (Map<String,Object> map:listMap){
//			Set<String> set = map.keySet();
//			for (String key:set){
//				System.out.println(key);
//				System.out.println(map.get(key));
//			}
//		}

//		List<Map<String,Object>> listMap = studentService.getStu6();
//		for (Map<String,Object> map:listMap){
//			Set<String> set = map.keySet();
//			for (String key:set){
//				System.out.println("key-->" + key);
//				System.out.println("value-->" + map.get(key));
//			}
//			System.out.println("------------------");
//		}

		List<StudentAndClassRoom> list = studentService.getStu7("王");
		for (StudentAndClassRoom s:list){
			System.out.println(s);
		}
	}
}
