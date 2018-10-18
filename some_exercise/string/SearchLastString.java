
// 查找子串在目标串出现的最后位置
public class SearchLastString {
	public static void main(String[] args) {
		String strOrigin = "Hello world";
		int lastIndex = strOrigin.lastIndexOf("l");
		if (lastIndex == -1) {
			System.out.println("没有找到");
		} else {
			System.out.println("l 最后出现的位置是：" + lastIndex);
		}
	}
}
