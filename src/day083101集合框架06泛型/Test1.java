package day083101集合框架06泛型;

import java.util.ArrayList;
import java.util.List;

//

public class Test1<T> {//泛型类  泛型写在类名的后面

	//泛型定义在方法上，写在方法的声明部分，返回类型的前面
	public  <T> String show1(T t,String s) {
		return "";
	}
	
	
	public <T> T show2(T s){
		return s;
	}
	
	public String show3(T s) {
		return "tzy";
	}
	
	public T  show4(T s) {
		return s;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1=new ArrayList<String>();
		list1.add("zhangsan");
		list1.add("lisi");
		list1.add(new String("wangwu"));
		System.out.println(list1);

		List<Integer> list2=new ArrayList<Integer>();
		list2.add(1213);
		list2.add(280);
		list2.add(new Integer(733));
		System.out.println(list2);
		
		System.out.println("==========");
		
		Test1<String> t1=new Test1<String>();
		
		t1.show1(100, "tzy");
		t1.show2(200);
		t1.show3("qwer");
		t1.show4("zhangsan");
		
		System.out.println("==========");
		
		Test2 t2=new Test2();
	}

}
