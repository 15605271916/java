package day082704集合框架01Collection接口01;

import java.util.ArrayList;
import java.util.Collection;

import day082302面向对象14instanceof运算符01.User;

public class Test1Collection {

	public static void main(String[] args) {

		Collection c=new ArrayList();
		
		System.out.println(c);//空数组
		
		//方法
		System.out.println(c.isEmpty());//是空的吗？true
		System.out.println(c.size());//c的长度/尺寸（0）
		
		c.add(100);//添加
		c.add(true);
		c.add("tangzeyu");
		c.add(new User());

		System.out.println(c);
		
		System.out.println(c.contains("tzy"));//c中包含“tzy”吗（不包含/FALSE）
		
		c.remove(100);//移除
		
		System.out.println(c);
		
		c.clear();//清除集合
		
		System.out.println(c);
		
		c.add(100);//重新添加
		c.add(true);
		c.add("tangzeyu");
		
		Object[] array=c.toArray();
		
		System.out.println(c.size());
		
		System.out.println(c);
		
		
		
		
	}

}
