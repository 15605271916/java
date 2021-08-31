package day082403核心类库04常用类;

import java.util.Random;

public class No2Math数学类 {

	public static void main(String[] args) {
		
		//ceil向上取整
		System.out.println(Math.ceil(3.14));
		System.out.println(Math.ceil(3.000001));
		System.out.println(Math.ceil(3.9999999999999999999999999));
		
		
		//floor向下取整
		System.out.println(Math.floor(3.9));
		System.out.println(Math.floor(3.999999999999999999999999));//例外（原因：精度问题）
		
		
		//round四舍五入
		float a=3.55f;
		System.out.println(Math.round(a));
		
		
		//random随机数(0-1之间)
		System.out.println("random随机数(0-1之间)");
		System.out.println(Math.random());
		System.out.println("==========");
		
		//随机输出10个0-1之间的数
		System.out.println("随机输出10个0-1之间的数");
		for(int i=0;i<10;i++) {
			System.out.println(Math.random());
		}
		System.out.println("==========");
		
		//随机0-100之间的数
		System.out.println("随机输出10个0-100之间的数");
		for(int k=0;k<10;k++) {
		System.out.println(10+new Random().nextInt(91));
		}
	}

}
