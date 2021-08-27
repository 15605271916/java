package day1401核心类库14序列化反序列化;

import java.beans.Transient;
import java.io.Serializable;
import java.security.PrivateKey;

public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;


	    private  transient int id;
		private String name;
		private char sex;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id=id;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name=name;
		}
		
		public char getSex() {
			return sex;
		}
		public void setSex(char sex) {
			this.sex=sex;
		}
		
		
		
}
