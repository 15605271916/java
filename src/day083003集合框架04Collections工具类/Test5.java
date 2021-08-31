package day083003集合框架04Collections工具类;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//是集合的工具类
//collection是接口
//collections是类，二者不一样
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List list=new ArrayList();
		
		list.add(3);
		list.add(5);
		list.add(2);
		list.add(6);
		list.add(4);
		list.add(1);
		
		//排序
		Collections.sort(list);
		System.out.println(list);
		
		//反转
		Collections.reverse(list);
		System.out.println(list);
		
	}

}
