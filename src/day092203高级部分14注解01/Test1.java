package day092203高级部分14注解01;

@Anno01(value=1,a="bwf",b=20)
public class Test1 {
	
	@Anno01(value=2,a="zhangsan")
	public static void main(String[] args) {

	}
	
	@Anno01(value=3,a="lisi")
	public void show1(@Anno01(value=2,a="wangwu") int a) {
		
		@Anno01(value=5,a="zhaoliu")
		int b=100;
		
	}

}
