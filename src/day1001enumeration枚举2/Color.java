package day1001enumeration枚举2;

public enum Color {
	RED("red"), //public static final Color red;
				//red=new Color(RED,0)
	GREEN("green"),
	BLUE("blue"),
	
	YELLOW("yellow","黄色");
	
	public String desc="";
	public String desc2="";
	
	private Color(String desc) {
		System.out.println("构造了："+desc);
	}
	
	private Color(String desc,String desc2) {
		this.desc=desc;
		this.desc2=desc2;
	}
	
	public String toString() {
		if(desc==null) {
			return name();
		}
		return desc;
		
	}
	

	







}
