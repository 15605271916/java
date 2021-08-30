package day1501集合框架02Set实现;

public class User {

	public static void main(String[] args) {

	}

	public String name;

	@Override
	public int hashCode() {
		//hashcode可以理解为内存地址，两个对象hashcode不一样，那一定不一样，hashcode如果一样，那这两个对象可能一样
		//最常用的地方就是在一堆东西里找一个东西。先用你要找的东西的hashcode和所有东西的hashcode比较，
		//如果不一样的话就肯定不是你要找的东西。如果一样的话就很可能是你要找的东西。然后再进行仔细的比较两个东西是不是真的一模一样。
		// TODO Auto-generated method stub
		return name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.name.equals(((User)obj).name);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
	
	
	
	

}
