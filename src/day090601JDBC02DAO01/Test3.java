package day090601JDBC02DAO01;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User user=new User();
		
		user.show();
		
		System.out.println("==========");

		System.out.println("实现2.3.4.5功能");
		user.show2();
		user.show3();
		user.show4();
		user.show5();
		
		System.out.println("==========");
		
		user.showAll();
		
	}

}
