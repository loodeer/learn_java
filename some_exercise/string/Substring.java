// 截取字符串 第几位到第几位
public class Substring {
	public static void main(String args[]) {
		String str = "hello world";
		System.out.println(str.substring(0, 3));
		System.out.println(str.substring(1, 3));
		System.out.println(str);
		System.out.println(str.substring(0, 3) + str.substring(4));
		System.out.println(str.substring(2, 5));
		System.out.println(str.substring(2, 4));
		System.out.println(str.substring(2, 7));
		System.out.println(str.substring(3));
	}
}
