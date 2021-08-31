package homework06_Java;

import java.io.File;

public class Homework082601递归删除文件夹 {

	public static void deleteAll(File file) {

		if (file.isFile()) {//文件
			
			file.delete();// 删除该文件

			System.out.println(file.getName() + "已删除");

		} else if (file.list() == null) {//空文件夹

			file.delete();// 删除该文件夹

			System.out.println(file.getName() + "已删除");

		} else {// 非空文件夹

			File[] files = file.listFiles();

			for (File f : files) {

				deleteAll(f);// 递归，再次判断。将里面文件删除

				f.delete();// 删除和上述文件同一层级的文件夹

				file.delete();// 删除母文件夹

			}
			System.out.println(file.getName() + "已删除");
		}
	}

	public static void main(String[] args) {

		File file = new File("C:\\myfiles\\a");

		deleteAll(file);
	}
}