package day0702面向对象02abstract抽象;

//圆
public class ShapeCircle extends Shape {

//	public double getArea(int w, int h, int r) {
//
//		super.setSize(w, h, r);
//
//		return r * r*Math.PI;
//
//	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return rad*rad*3.14;
	}

}
