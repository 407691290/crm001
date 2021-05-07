package test;

import domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.UUID;

//import java.util.List;

public class Test1 {
	public static void main(String[] args) throws IOException {
		Logger logger = Logger.getLogger(Test1.class);

		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = sqlSessionFactory.openSession();

//	 	Student student = session.selectOne("getById",1);
//		System.out.println(student);
//		session.close();

		UUID uuid = UUID.randomUUID();
		String str = uuid.toString();
		str = str.replaceAll("-","");
		System.out.println(str);

//		List<Student> list = session.selectList("getAll");
//		for (Student stu:list){
//			System.out.println(stu);
//		}

//		Student s = new Student();
//		s.setAge(22);
//		s.setId("5");
//		s.setName("张三丰");
//		session.insert("ins",s);
//		session.commit();

//		Student ss = new Student();
//		ss.setId("2");
//		ss.setName("里斯");
//		ss.setAge(25);
//		session.update("upd",ss);
//		session.commit();
//
		session.delete("del",3);
		session.commit();


	}
}
