package day081802面向对象02abstract抽象01;

public class Shapereal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ShapeRect r=new ShapeRect();
		r.setSize(10,20,0);
		System.out.println(r.getArea());
		
		
		ShapeCircle c=new ShapeCircle();
		c.setSize(10,20,10);
		System.out.println(c.getArea());
		
		
		
		
	}

}
