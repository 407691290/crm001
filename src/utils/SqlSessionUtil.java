package utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionUtil {

	private static SqlSessionFactory sqlSessionFactory;
	private static ThreadLocal<SqlSession> t = new ThreadLocal<SqlSession>();
	private SqlSessionUtil(){}

	static {
		String resource = "mybatis-config.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	public static SqlSession getSqlSession(){
		SqlSession sqlSession = t.get();
		if (sqlSession == null){
			sqlSession = sqlSessionFactory.openSession(true);
			t.set(sqlSession);
		}
		return sqlSession;
	}

	public static  void close(SqlSession sqlSession){
		if (sqlSession != null){
			sqlSession.close();
			t.remove();
		}
	}

}
