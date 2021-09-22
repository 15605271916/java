package day092202高级部分13反射03;

public class UserService01 implements IUserService{
	
	public int reg() {
		
		System.out.println("开始注册01......");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("注册成功01！");
		
		return 01;
		
	}

}
