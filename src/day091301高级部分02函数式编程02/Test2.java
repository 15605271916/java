package day091301高级部分02函数式编程02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

import org.omg.Messaging.SyncScopeHelper;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream s1=Stream.of("a","b","","c","","d","");
		
		s1=(Stream) s1.parallel();

		int count=(int) s1.filter((s)->{
			
			return s.equals("");
			
		}).count();
		
		System.out.println(count);
		
		System.out.println("==========");
		
		List list=new ArrayList();
		
		for (int i = 0; i < 999999; i++) {
			list.add(i);
		}
		
		long start=System.currentTimeMillis();
		
		Stream s2=list.parallelStream();//并行处理时间理应更短
		//Stream s2=list.stream();
		
		s2.forEach(System.out::println);
		
		long end=System.currentTimeMillis();
		
		System.out.println("时间："+(end-start));
		
	}

}
