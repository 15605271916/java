package day09.generate生成get和set;

public class Test3 extends B{
	
	public void show(B b) {
		System.out.println("序号："+b.getId());
		System.out.println("年龄："+b.getAge());
		System.out.println("姓名："+b.getName());
		System.out.println("性别："+b.getSex());
		System.out.println("地址："+b.getAdress());
		System.out.println("生日："+b.getBirthday());
		System.out.println("职业："+b.getJob());
		System.out.println("电话："+b.getTel());
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test3 t=new Test3();
B b=new B();

b.setId(1);
b.setName("zhangsan");
b.setAge(18);
b.setSex("男");
b.setAdress("江苏省南京市");
b.setBirthday("1995-10-25");
b.setJob("DiDiDriver");
b.setTel(10086);
		
		t.show(b);
		
	}

}
