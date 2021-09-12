package day082704集合框架01Collection接口01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test3Linkedlist {
	
	public static void main(String[] args) {
		
		LinkedList list=new LinkedList();
		
		list.add("zhangsan");//添加zhangsan>[zhangsan]
		list.add(1,"lisi");//在第二个位置添加lisi>[zhangsan,lisi]
		list.addFirst("wangwu");//在第一个位置添加wangwu>[wangwu,zhangsan,lisi]
		list.addLast("zhaoliu");//在最后一个位置添加zhaoliu>[wangwu,zhangsan,lisi,zhaoliu]
		
		System.out.println(list);//[wangwu,zhangsan,lisi,zhaoliu]
		
		list.push("qwer");//在第一个位置添加qwer>[qwer,wangwu,zhangsan,lisi]
		
		System.out.println(list);
		
		list.pop();//弹出（删除）一个值（默认是第0个）
		
		System.out.println(list);
		
		//add和push的区别
		
		
		
		
		
	}

}
