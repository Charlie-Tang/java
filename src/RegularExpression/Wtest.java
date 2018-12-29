package RegularExpression;

public class Wtest {
	public static void main(String[] args) {
		String a = "https://www.cnblogs.com";
		//     "\\"应该是一个反斜杠转义符
		String b = ".\\w+";
		
//		System.out.println(a.matches(b));
		
		String c = "[^c]+";
		
		String d = "(http|ftp|https):\\/\\/[\\w\\-_]+(\\.[\\w\\-_]+)+([\\w\\-\\.,@?^=%&amp;:/~\\+#]*[\\w\\-\\@?^=%&amp;/~\\+#])?";
		System.out.println(a.matches(d));
	}
}
