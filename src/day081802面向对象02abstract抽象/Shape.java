package day081802面向对象02abstract抽象;
//abstract
public abstract class Shape {
	public int width;//宽
	public int heigth;//高
	public int rad;//半径
	
	public void setSize(int w,int h,int r) {
		this.width=w;
		this.heigth=h;
		this.rad=r;
	}
	
	public abstract double getArea();
	
	
}
