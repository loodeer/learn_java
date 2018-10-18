// 测试创建字符串性能
//
public class StringComparePerformance {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		for (int i = 0;i< 50000; i++) {
			String s1 = "hello";
			String s2 = "hello";
		}
		long endTime = System.currentTimeMillis();
		System.out.println("通过 String 关键字创建字符串:" + (endTime -startTime) + "毫秒");

		startTime = System.currentTimeMillis();
		for (int i = 0; i< 50000; i++) {
			String s3 = new String("hello");
			String s4 = new String("hello");
		}
		endTime = System.currentTimeMillis();
		System.out.println("通过 String 对象创建字符串:" + (endTime -startTime) + "毫秒");
	}
}
