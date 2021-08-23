package day07.abstract抽象;
//矩形
public class ShapeRect extends Shape {

//	public int getArea(int w, int h, int r) {
//
//		super.setSize(w, h, r);
//
//		return w * h;
//
//	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return heigth*width;
	}
}
