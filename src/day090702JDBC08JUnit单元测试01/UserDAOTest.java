package day090702JDBC08JUnit单元测试01;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import day090602JDBC03DAO02.IUserDao;
import day090603JDBC04DAO03entity.User;
import day090604JDBC05DAO04impl.UserDAO;

public class UserDAOTest {
	
	private IUserDao userDAO;
	private User user;
	
	@Before
	public void setup() {
		
		userDAO=new UserDAO();
		user=new User();
		user.setId(7);
		user.setName("qwer");
	}
	
//	@Test
	public void testSave() {
		int count=userDAO.save(user);
		assertEquals(1, count);
	}
	
//	@Test
	public void testUpdate() {
		user.setName("asdasd");
		int count=userDAO.update(user);
		assertEquals(1, count);
	}
	
//	@Test
	public void testFindById() {
		User count =userDAO.findById(1);
		assertNotNull(count);
		String name=count.getName();
		assertEquals("zhangsan", name);
	}
	
//	@Test
	public void testFindAll() {
		List<User> userList=userDAO.findAll();
		assertNotNull(userList);
		assertEquals(9, userList.size());
	}
	
	@Test
	public void test1() {
		int[] a= {1,2,3};
		int[] b= {1,2,3};
		System.out.println(a==b);
		assertArrayEquals(a, b);
	}
	
	@Test
	public void test2() {
		int[] c= {1,2,3};
		int[] d= {1,2,3,4};
		System.out.println(c==d);
		assertArrayEquals(c, d);
	}
	
	
}
