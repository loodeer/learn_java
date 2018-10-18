// 字符串反转

public class StringReverse {
	public static void main(String[] args) {
		String string = "abcdef";
		String reverse = new StringBuffer(string).reverse().toString();
		System.out.println("\nString before reverse:" + string);
		System.out.println("\nString after reverse:" + reverse);
	}
}
