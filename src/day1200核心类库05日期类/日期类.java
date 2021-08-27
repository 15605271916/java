package day1200核心类库05日期类;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalField;
import java.util.Calendar;
import java.util.Date;

public class 日期类 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long times = System.currentTimeMillis();
		System.out.println("时间差为:" + times);

		Date d1 = new Date();// 当前日期
		System.out.println(d1);

		Date d2 = new Date(0);
		System.out.println(d2);// 基准时间

		Date d3 = new Date("2021/4/8 8:20:30");// 自定义的时间
		System.out.println(d3);

		Date d4 = new Date(2021, 1, 1);
		System.out.println(d4);// 二月1号（0-11对应1-12月）

		System.out.println(d1.after(d2));// 比较日期前后
		System.out.println(d1.before(d2));

		System.out.println(d1.compareTo(d2));

		Date d5 = new Date();
		Date d6 = new Date();
		
		//以下判断结果跟代码执行完成的时间点有关，精确到毫秒。运行d1的时间，与运行d5，d6的时间是否在同一毫秒内
        //d1运行完成时间（精确到毫秒，比如上午8点15分15秒30毫秒）到d5运行完成时间（精确到毫秒如8点15分15秒35毫秒）
		//d1到d5中间有一段代码，也需要运行时间，所以d1与d5时间不同
		//d5到d6中间没有代码，因此极大概率在同一毫秒内运行完成（除非你的计算机性能差到不能再差）
		System.out.println(d1.equals(d5));// false
		System.out.println(d5.equals(d6));// true

		// 0-11对应1月-12月
		// 例如2021/1/15（日期格式）表示2021年1月15号
		// 但是2021,1,15（非日期格式）表示2021年2月15号
		// 2021,0,15表示的是2021年1月15号
		System.out.println(d1.getMonth());// 当前月份8月，第“7”个月，结果为7，如果当前为1月，则结果为0
		System.out.println(d1.getTime());

		d1.setYear(2021 - 1900);// 1900为基准年
		System.out.println(d1);

		System.out.println("==========");

		Calendar c1 = Calendar.getInstance();
		System.out.println(c1);
		System.out.println(c1.get(Calendar.DATE));// 今天是几号
		c1.add(Calendar.DATE, -2);
		System.out.println(c1.get(Calendar.DATE));// 减去2天是几号

		c1.clear();// 清除日期
		System.out.println(c1.get(Calendar.MONTH));// 清除之后月份为“0”，意为当前为1月份

		c1.set(Calendar.MONTH, 2);// 设置当前月份为“2”，意为3月份
		System.out.println(c1.get(Calendar.MONTH));// 当前为3月份，打印当前月份，结果为“2”

		System.out.println(c1.toString());

		Date d7 = c1.getTime();
		System.out.println(d7);

		System.out.println("==========");

		Instant instant = Instant.now();// 获取当前时间戳（格林尼治时间）
		System.out.println(instant);
		System.out.println(instant.get(ChronoField.MILLI_OF_SECOND));// 毫秒

		System.out.println(ZoneId.systemDefault());

		LocalDate ld = LocalDate.now();// 当地日期
		System.out.println(ld);
		System.out.println(ld.getYear());
		System.out.println(ld.get(ChronoField.YEAR));

		ld = ld.plusDays(3);// 增加3天(需要重新赋值)
		System.out.println(ld.get(ChronoField.DAY_OF_MONTH));

		LocalTime t1 = LocalTime.now();// 当地时间
		System.out.println(t1);
		t1 = t1.plusHours(2);// 增加2小时(需要重新赋值)
		System.out.println(t1);

		System.out.println("==========");

		LocalDate l2 = LocalDate.now();
		LocalDate l3 = l2.plusDays(2);
		l3 = l3.plusMonths(1);
		System.out.println(l2);
		// l3是在l2的基础上加1个月再加两天
		System.out.println(l3);

		// 计算l2，l3的差值(Period)
		Period p = Period.between(l2, l3);//l3-l2

		System.out.println(p.getDays());//日期差两天
		System.out.println(p.getMonths());//月份差1个月
		System.out.println(p.getYears());//年份相等，相差0

	}

}
