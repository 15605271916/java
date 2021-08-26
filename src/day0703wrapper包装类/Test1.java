package day0703wrapper包装类;

public class Test1 {
	//字符串==判断
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 2;
		System.out.println(a == b);//false
		System.out.println(b == c);//true
		
		// 直接赋值
		String s1 = "qwer";
		String s2 = "qwer";
		System.out.println(s1 == s2);//true

		// 如果是new一个string，则“==”判断的是地址是否也相等
		String s3 = new String("asdf");
		String s4 = new String("asdf");
		System.out.println(s3 == s4);//false

		// 如果想仅判断内容是否相等，则如下：
		System.out.println(s3.equals(s4));//true

		// 那么直接赋值的string和new的string相等吗？(不相等)
		String s5 = "qwer";
		System.out.println(s3 == s5);//false
		
		//那么字符串拼接（编译阶段拼接）呢？(相等)
		String s6 = "abc";
		String s7 = "ab"+"c";
		String s8 = "a"+"bc";
		System.out.println(s6 == s7);//true
		System.out.println(s7 == s8);//true
		
		//同样是拼接（运行阶段拼接），相等吗？（不相等），但是内容相等
		String c1 = "ab";
		String c2 = "c";
		String s9=c1+c2;
		System.out.println(s8 == s9);//false
		System.out.println(s8.equals(s9));//true
		
		System.out.println("=====分割线=====");

	}
}
