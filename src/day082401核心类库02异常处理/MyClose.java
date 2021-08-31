package day082401核心类库02异常处理;

import java.io.Closeable;
import java.io.IOException;

public class MyClose implements Closeable {
	
	public void show1() {
		System.out.println("do something");
	}

	@Override
	public void close() throws IOException {
		System.out.println("关闭资源");
	}

	public static void main(String[] args) {

	}

}
