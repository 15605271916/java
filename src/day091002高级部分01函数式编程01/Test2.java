package day091002高级部分01函数式编程01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List list = new ArrayList();

		list.add(2);
		list.add(3);
		list.add(5);
		list.add(6);
		list.add(1);
		list.add(4);

		System.out.println(list);

		Collections.sort(list);

		System.out.println(list);

		Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {

				return o2 - o1;

			}

		});
		System.out.println(list);

		System.out.println("==========");

		List list2 = new ArrayList();

		list2.add(26);
		list2.add(31);
		list2.add(53);
		list2.add(64);
		list2.add(19);
		list2.add(40);

		System.out.println(list2);

		Collections.sort(list2, (Integer o1, Integer o2) -> {

			return o2 - o1;

		});

		System.out.println(list2);

		System.out.println("==========");

		Test2 t2 = new Test2();

		t2.show2(new IA() {

			@Override
			public void m1() {

				System.out.println("IA接口中的m1方法");

			}
			
		});

		t2.show2(() -> {

			System.out.println("IA接口中的m1方法（lambda实现）");

		});

		System.out.println("==========");

		t2.show3((int a) -> {

			System.out.println(a);

		});

		//简写
		t2.show3(( a) -> {

			System.out.println(a+10);

		});
		
	}

	public void show2(IA a) {

		a.m1();

	}

	public void show3(IB b) {

		b.m1(100);

	}

}
