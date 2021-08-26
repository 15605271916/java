package day1202string类;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class 字符串常量池 {
	
	public static void main(String[] args) {
		
		String s1="tom";
		String s2="tom";
		//s1.s2没有开辟空间，存在于常量池中
		System.out.println(s1==s2);//true
		
		//s3 new.开辟了新空间
		String s3=new String("tom");
		
		System.out.println(s1==s3);//false
		
		String s4=s3.toString();
		
		System.out.println(s1==s4);//false
		System.out.println(s3==s4);//true
		
		String s5="t";
		String s6="om";
		String s7="t"+"om";
		String s8=s5+s6;
		System.out.println(s1==s7);//true
		System.out.println(s1==s8);//false
		
		System.out.println("字符串拼接使用+号则重新分配空间，因为字符串长度不可变，只有重新生成");
		
		System.out.println("==========");
		
		String str="bwf";
		for(int i=0;i<10;i++) {
			//string+int意为拼接
			str+=i;
			System.out.println(str);
			System.out.println(str.getClass()+"@"+Integer.toHexString(str.hashCode()));
		}
		
	}
}
