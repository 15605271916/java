package day082503核心类库07string类01;

public class String常用方法 {
	
	public static void main(String[] args) {
		
		String str="public static void main";
		
		System.out.println(str.charAt(8));//第8个字符：t
		
		System.out.println(str.concat("aaaa"));//拼接：public static void mainaaaa
		
		System.out.println(str.contains("static"));//是否包含/true
		
		System.out.println(str.endsWith("n"));//是否以...结束/true
		
		System.out.println(str.startsWith("public"));//是否以...开头/true
		
		System.out.println(str.equals("public static void main"));//内容是否相等/true
		
		System.out.println(str.equalsIgnoreCase("PUBLIC static void main"));//忽略大小写内容是否相等/true
		
		System.out.println(str.indexOf(97));//9
		
		System.out.println(str.indexOf('a',10));//20
		
		System.out.println(str.indexOf("ic"));//4
		
		System.out.println(str.indexOf("ic",7));//11
		
		System.out.println(str.lastIndexOf("ic"));//11
		
		System.out.println(str.lastIndexOf("ic",7));//4
		
		System.out.println(str.length());//23
		
		System.out.println(" ".trim().isEmpty());//true
		
		System.out.println(str.replace('i', '8'));//publ8c stat8c vo8d ma8n
		
		System.out.println(str.replace("ic", "666"));//publ666 stat666 void main
		
		System.out.println(str.replaceAll("[ai]", "9"));//publ9c st9t9c vo9d m99n
		
		System.out.println(str.replaceFirst("[ai]", "9"));//publ9c static void main
		
		String[] words=str.split(" ");//[public,static,void,main]
		for(String w:words) {
			System.out.println(w);
		}
		
		System.out.println(str.substring(7));//static void main
		
		System.out.println(str.substring(7,13));//static
		
		System.out.println(str);//public static void main
		
		System.out.println("==========");
		
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.hashCode());
		
		sb.append(1);
		sb.append("qwer");
		sb.append(true);
		sb.append(3.14);
		
		System.out.println(sb.hashCode());
		System.out.println(sb);
		System.out.println(sb.capacity());//字符串分配容量/16
		
	}

}
