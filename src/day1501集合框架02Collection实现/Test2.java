package day1501集合框架02Collection实现;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Test2 {

	public static void main(String[] args) {

		Goods g1 = new Goods(1, "BH003", "鞋子");
		Goods g2 = new Goods(2, "BH002", "手套");
		Goods g3 = new Goods(3, "BH001", "空调");

		Set set = new TreeSet();

		set.add(g1);
		set.add(g2);
		set.add(g3);

		System.out.println(set);

		Goods2 g11 = new Goods2(1, "BH003", "鞋子");
		Goods2 g22 = new Goods2(2, "BH002", "手套");
		Goods2 g33 = new Goods2(3, "BH001", "空调");

		Set set1 = new TreeSet(new Comparator<Goods2>() {
			public int compare(Goods2 o1, Goods2 o2) {
				// TODO Auto-generated method stub
				return o1.getIsbn().compareTo(o2.getIsbn());
			}
		});

		set.add(g3);
		set.add(g2);
		set.add(g1);

		System.out.println(set);

		System.out.println("=============");

	}

}
