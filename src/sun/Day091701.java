package sun;

import java.util.ArrayList;
import java.util.List;

public class Day091701 {

	public static void main(String[] args) {
		int a[]= {2,5,9,7,44,456};//定义一个整数数组a
		
		System.out.println(a[3]);//打印这个数组的第“3”个元素，结果为：7
		
		List b=new ArrayList();//新建一个空列表b/数组b
		
		b.add(1);//把1添加进列表b
		b.add("tzy");//继续把“tzy”添加进列表b
		b.add("4s5d6f");//继续把"4s5d6f"添加进列表b，此时列表b中有三个元素：1，“tzy”，“4s5d6f”
		
		System.out.println(b);//打印列表b结果为：[1, tzy, 4s5d6f]
		
		System.out.println(b.get(1));//打印第“1”元素，结果为：tzy
		
		System.out.println(b.size());//打印列表的长度，结果为：3
		
		b.add("");//把一个空字符串添加进列表b
		b.add("");//再次把一个空字符串添加进列表b
		
		System.out.println(b.size());//此时列表b的长度发生变化，打印列表的长度，结果为：5
		
		b.add(1, "qwer");//指定在列表b的第“1”个位置添加元素“qwer”
		
		System.out.println(b);//此时列表变为[1, qwer, tzy, 4s5d6f, , ]，前面在b中添加了空字符串，所以b的最后有，  ，  的现象出现
		
		b.remove(1);//移除列表b的第“1”个元素即“qwer”
		
		System.out.println(b);//打印列表b结果为：[1, tzy, 4s5d6f, , ]
		
		b.remove("tzy");//移除列表b中内容为“tzy”的元素
		
		System.out.println(b);//打印列表b结果为：[1, 4s5d6f, , ]
		
		b.add("4s5d6f");//再添加一个元素“4s5d6f”，此时b中有两个4s5d6f，但是位置不同
		
		System.out.println(b);//结果为：[1, 4s5d6f, , , 4s5d6f]
		
		System.out.println(b.get(1)==b.get(4));//判断b中第“1”个与第“4”个值是否相等，结果为：true
		
		b.remove("4s5d6f");//移除列表b中内容为“4s5d6f”的元素,此时b中有两个相同的“4s5d6f”，移除的是第一个“4s5d6f”。
							//java虚拟机在执行指令的时候，从b的头开始找“4s5d6f”，找到第一个之后，就立马移除，然后指令结束，不会继续找，所以只会移除第一个
		
		System.out.println(b);//结果为：[1, , , 4s5d6f]
		
		
		
		
		
		
	}

	

}
