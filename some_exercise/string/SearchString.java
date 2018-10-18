// 查找字符串第一次出现的位置
public class SearchString {
	public static void main(String[] args) {
		String strOrig = "hello world";
		int intIndex = strOrig.indexOf("l");

		if (intIndex == -1) {
			System.out.println("not found");
		} else {
			System.out.println("found at:" + intIndex);
		}
	}
}
