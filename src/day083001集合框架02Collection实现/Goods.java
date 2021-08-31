package day083001集合框架02Collection实现;

public class Goods implements Comparable{

	private int id;
	private String isbn;
	private String name;
	
	public Goods(int id,String isbn,String name) {
		
		this.id=id;
		this.isbn=isbn;
		this.name=name;
		
	}

	public int getId() {
		return id;
	}


	public String getIsbn() {
		return isbn;
	}


	public String getName() {
		return name;
	}
	
	@Override
	public int compareTo(Object o) {
		return this.isbn.compareTo(((Goods)o).getIsbn());//根据编号正序排列
		//return -(this.id-((Goods)o).getId());//根据id倒序排列
		//return this.name.compareTo(((Goods)o).getName());//根据名称正序排列
	}
	
	@Override
	public String toString() {
		return this.id+"-"+this.isbn+"-"+this.name;
	}

	
	


}
