package day1501集合框架02Set实现;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set set=new HashSet();
		
//		set.add(1);
//		set.add(true);
//		set.add("tangzy");
		
		User u1=new User();
		u1.name="zhangsan";
		
		User u2=new User();
		u2.name="zhangsan";
		
		set.add(u1);
		set.add(u2);
		
		set.add(1);
		set.add("tzy");
		
		System.out.println(set);
		
		System.out.println(u1.equals(u2));
		
		System.out.println("==========");
		
		set=new HashSet();
		
		//添加三条数据
		set.add("zhangsan");
		set.add("lisi");
		set.add("wangwu");
		
		Iterator it=set.iterator();
		
		//指针在位置“0”（0），有下一个吗？有（zhangsan）（true）
		System.out.println(it.hasNext());
		it.next();
		
		//指针在位置“1”（zhangsan），有下一个吗？有（lisi）（true）
		System.out.println(it.hasNext());
		it.next();
		
		//指针在位置“2”（lisi），有下一个吗？有（wangwu）（true）
		System.out.println(it.hasNext());
		it.next();
		
		//指针在位置“3”（wangwu），有下一个吗？（没有了）
		System.out.println(it.hasNext());
	
		System.out.println("==========");
		
		//循环控制,输出三条数据
		Set set2=new HashSet();
		
		//添加三条数据
		set2.add("zhangsan");
		set2.add("lisi");
		set2.add("wangwu");
		
		Iterator it2=set2.iterator();
		
		while(it2.hasNext()) {
			String obj=(String)it2.next();
			System.out.println(obj);
		}
		
		System.out.println("==========");
		
		List list=new ArrayList();
		
		list.add("zhaoliu");
		list.add("tzy");
		list.add(true);
		
		System.out.println("list:"+list);
		
		for(Iterator it4=list.iterator();it4.hasNext();) {
			Object obj=it4.next();
					if(obj instanceof String) {
						System.out.println(((String)obj).charAt(0));
					}else if(obj instanceof Boolean) {
						if((Boolean)obj){
							System.out.println("对头");
						}
					}
		}
		
		System.out.println("==========");
		
		System.out.println("set:"+set);
		System.out.println("list:"+list);
		
		//使用指定删除法删除
		set.remove("lisi");//指定删除“lisi”
		list.remove(1);//指定删除第二个--tzy
		
		System.out.println("新set:"+set);
		System.out.println("新list:"+list);
		
		//使用循环控制法删除
		for (Object obj:list) {
			if(obj.equals("zhaoliu")) {
				list.remove("zhaoliu");//删除“zhaoliu”
			}
		}
		System.out.println("新list:"+list);
		
		System.out.println("==========");
		
		list.add("zhaoliu");
		list.add("tzy");
		
		System.out.println("All new list:"+list);
		
		System.out.println("==========");
		
		//使用迭代器删除
		for(Iterator it3=list.iterator();it3.hasNext();) {
			Object obj=(Object)it3.next();
			if(obj.equals("zhaoliu")) {
//				list.remove("zhaoliu");
				it3.remove();
				
			}
			
			
		}
		System.out.println("All new list:"+list);
		
		
		

	}

}
