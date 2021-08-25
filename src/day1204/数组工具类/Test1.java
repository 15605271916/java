package day1204.数组工具类;

import java.util.Arrays;
import java.util.Comparator;

public class Test1 {

	public static void main(String[] args) {

		
		Integer[] array= {2,5,6,7,3,1,9};		
		
		System.out.println(Arrays.toString(array));
		
		Arrays.sort(array);//升序
		
		System.out.println(Arrays.toString(array));
		
		Arrays.sort(array,new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
//				return o1-o2;//升序
				return o2-o1;//降序
			}
		});
		System.out.println(Arrays.toString(array));
		
		System.out.println("==========");
		
		int[] array2=new int[10];
		
		System.out.println(Arrays.toString(array2));
		Arrays.fill(array2, 1);//用1填充
		System.out.println(Arrays.toString(array2));
		
		Arrays.fill(array2, 2,4,10);//从第2个到第4个用10进行替换/填充（包含第二个，不包含第四个）
		System.out.println(Arrays.toString(array2));
	}

}
