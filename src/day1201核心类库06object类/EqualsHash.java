package day1201核心类库06object类;

import java.util.HashSet;
import java.util.Set;

public class EqualsHash {

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return true;
	}

	public static void main(String[] args) {

		EqualsHash t = new EqualsHash();
		System.out.println(t);
		System.out.println(t.hashCode());
		System.out.println(Integer.toHexString(t.hashCode()));

		EqualsHash t2 = new EqualsHash();
		System.out.println(t2.hashCode());
		System.out.println(t.equals(t2));
		System.out.println(t == t2);
		
		Set set=new HashSet();
		set.add(t);
		set.add(t2);
		System.out.println(set.size());
		
		
		
	}

}
