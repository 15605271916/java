package day1101核心类库02异常处理;
//try-with-resource
import java.io.IOException;

public class No5TryWithResource {

	public static void main(String[] args) {

		MyClose myclose1 = new MyClose();

		try {
			myclose1.show1();

		} catch (Exception e) {
		} finally {
			try {
				myclose1.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		try {
			try (MyClose myclose2 = new MyClose()) {
			} catch (Exception e) {
			}
		} catch (Exception e) {
		}
	}
}
