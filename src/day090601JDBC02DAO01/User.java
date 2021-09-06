package day090601JDBC02DAO01;

public class User {

	public void show() {

		Dog dog = new Dog();

		System.out.println("人的功能:" + dog.getData());

	}

	public void show2() {

		System.out.println("显示show2功能");
	}

	public void show3() {

		System.out.println("显示show3功能");
	}

	public void show4() {

		System.out.println("显示show4功能");
	}

	public void show5() {

		System.out.println("显示show5功能");
	}
	
	public void showAll() {

		show2();
		show3();
		show4();
		show5();
	}
}
