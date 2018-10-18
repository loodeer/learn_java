// 比较字符串第一个字母 ASCII 码的差值.
public class StringCompare {
	public static void main(String args[]) {
		String str = "Hello World";
		String anotherString = "hello world";
		Object objStr = str;

		System.out.println(str.compareTo(anotherString));
		System.out.println(str.compareToIgnoreCase(anotherString));
		System.out.println(str.compareTo(objStr.toString()));
	}
}
