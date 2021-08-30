package day1502集合框架03Map接口和实现;

public class Dog {

	String name;

	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return name.equals(((Dog)obj).name);
	}
	
	
	
	


}
