package algorithm;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test1 {
	public static void main(String args[])
	{
//		Date date = new Date();
//		String string = date.toString();d
//		System.out.println(string);
		
		String str = "51535";
	    // 邮箱验证规则
	    String regEx = "^\\d{5,9}";
	    // 编译正则表达式
		
	    Pattern pattern = Pattern.compile(regEx);
	    // 忽略大小写的写法
	    // Pattern pat = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher(str);
	    // 字符串是否与正则表达式相匹配
	    boolean rs = matcher.matches();
	    System.out.println(rs);
	}

}

