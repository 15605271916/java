package day09.enumeration枚举1;
//枚举其实也是一种类，和普通类一样可以使用构造函数，但是不能继承别的类，因为在底层枚举类已经继承了一个隐藏的父类——Enum类
//语法略有不同
public class Test8 {

	public static void main(String[] args) {

		Color c1 = Color.BLUE;
		System.out.println(c1);
		Color c2 = Color.RED;
		System.out.println(c2);
		
		switch (c1) {
		case BLUE:
			System.out.println("蓝色");
		case RED:
			System.out.println("红色");
		case GREEN:
			System.out.println("绿色");
		}
		
		Sex s1=Sex.MAN;
		System.out.println(s1);
		Sex s2=Sex.WOMAN;
		System.out.println(s2);
		
		switch (s1) {
		case MAN:
			System.out.println("男");
		case WOMAN:
			System.out.println("女");
		}
		
	}

}
