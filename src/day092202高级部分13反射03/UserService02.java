package day092202高级部分13反射03;

public class UserService02 implements IUserService{
	
	public int reg() {
		
		System.out.println("开始注册02......");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("注册成功02！");
		
		return 02;
		
	}

}
