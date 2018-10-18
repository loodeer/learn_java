public class StringConcatenate {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		for (int i = 0;i<50000;i++){
			String result = "this is" + "testing the" + "difference";
		}
		long endTime = System.currentTimeMillis();

		System.out.println("字符串连接用时:" + (endTime - startTime));

		for (int i = 0; i< 50000; i++ ) {
			StringBuffer result = new StringBuffer();
			result.append("this is");
			result.append("testing the");
			result.append("difference");
		}
		long endTime2 = System.currentTimeMillis();
		System.out.println("使用StringBuffer连接耗时：" + (endTime2 - endTime));
	}
}
