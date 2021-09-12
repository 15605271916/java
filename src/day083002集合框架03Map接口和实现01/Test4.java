package day083002集合框架03Map接口和实现01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import javax.xml.soap.Node;

import day083001集合框架02Collection实现01.Goods;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map map=new HashMap();
		
		map.put(1, 1);
		map.put("a", "AA");
		map.put("b", "BB");
		map.put(true, false);
		//map.put(obj, "obj对象");
		map.put("", "");
		map.put(null, null);
		
		System.out.println(map.size());
		
		System.out.println(map.get("a"));
		System.out.println(map.get(1));
		
		Dog d1=new Dog();
		d1.name="wangwang";
		
		Dog d2=new Dog();
		d2.name="汪汪";
		
		map.put(d1, "狗1");
		map.put(d2, "狗2");
		
		System.out.println(map);
		
		map.remove(1);
		
		System.out.println(map);
		
		System.out.println("==========");
		
		Set keys=map.keySet();
		
		System.out.println(keys);//拿出所有的key
		
		for(Object key:keys) {
			System.out.println("键："+key+";  值："+map.get(key));//打印所有的键值对
		}
		
		System.out.println("==========");
		
		for (Iterator it2 = keys.iterator(); it2.hasNext();) {
			Object object = (Object) it2.next();
			System.out.println(object);//打印所有的key
		}
		
		System.out.println("==========");
		
		Collection values=map.values();
		
		for(Object value: values) {
			System.out.println(value);//打印所有的value
		}
		
		System.out.println("==========");
		
		Set entry=map.entrySet();
		
		for(Object en:entry) {
			System.out.println(((Entry)en).getKey()+"-"+((Entry)en).getValue());//打印键值对
		}
		
		System.out.println("==========");
		
		Map map2=new Hashtable();
		
		map2.put("a", "AAA");
		map2.put("b", "BBB");
		
		System.out.println(map);
		System.out.println(map2);
		
		System.out.println("==========");
		
		Map map3=new TreeMap();
		map3.put(1, "a");
		map3.put(3, "b");
		map3.put(5, "c");
		map3.put(2, "d");
		map3.put(4, "e");
		
		System.out.println(map3);//TreeMap()自动排序

		System.out.println("==========");
		
		Goods g1=new Goods(1, "bh00a", "a");
		Goods g2=new Goods(2, "bh00b", "b");
		Goods g3=new Goods(3, "bh00c", "c");
		
		Map map4=new TreeMap();
		map4.put(g1, "A");
		map4.put(g2, "B");
		map4.put(g3, "C");
		
		System.out.println(map4);
		
		
		
		
		
		
		
				
		
	}

}
