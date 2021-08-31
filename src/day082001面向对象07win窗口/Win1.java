package day082001面向对象07win窗口;

import javax.swing.JFrame;

public class Win1 extends JFrame {

	public static void main(String[] args) {

		Win1 t = new Win1();

		t.setTitle("窗体程序");// 标题
		t.setBounds(100, 100, 450, 300);// 大小
		t.setVisible(true);// 可见性

	}

}
