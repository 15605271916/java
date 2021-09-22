package day092202高级部分13反射03;

public class UserService03 implements IUserService{

	@Override
	public int reg() {

		System.out.println("开始注册03......");
		
		try {
			Thread.sleep(300);
			System.out.println("注册成功03！");
			return 1;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}finally {
			
		}
		
		
	}
	
	

}
