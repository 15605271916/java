package day1404集合框架01collection接口01;

import java.util.ArrayList;
import java.util.List;

import day1002面向对象14instanceof运算符.User;

public class Test2List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List c = new ArrayList();

		System.out.println(c);// 空集合

		c.add(100);// 添加
		c.add(true);
		c.add("tangzeyu");
		c.add(new User());

		System.out.println(c);

		Object[] array = c.toArray();

		System.out.println(c.size());

		System.out.println(c);

		System.out.println(c.get(0));// 打印第0个

		System.out.println("==========");
		
		List list = new ArrayList();
		//循环控制添加
		for(int i=0;i<30;i++) {
			list.add(i);
		}
		System.out.println(list);
		
		System.out.println("==========");
		
		System.out.println(c);
		
		//通过下标修改
		c.set(2, "zhangsan");//把第三个修改/替换为“zhangsan”
		
		System.out.println(c);
		
		//通过下标删除
		c.remove(0);//删除第一个
		
		System.out.println(c);
		
		
	}
}
