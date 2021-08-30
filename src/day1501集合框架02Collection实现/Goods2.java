package day1501集合框架02Collection实现;

public class Goods2 {
	
	private int id;
	private String isbn;
	private String name;
	
	public Goods2(int id,String isbn,String name) {
		
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
	public String toString() {
		return this.id+"-"+this.isbn+"-"+this.name;
	}


}
