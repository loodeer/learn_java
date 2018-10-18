// 字符串分割
public class StringSplit {
	public static void main(String[] args) {
		String str = "ww-youj-com";
		String[] temp;
		String delimeter = "-";
		temp = str.split(delimeter);

		for (int i = 0; i< temp.length; i++) {
			System.out.println(temp[i]);
			//System.out.println("\n");
		}
		
		System.out.println("------java for each循环输出的方法-----");
		String str1 = "www.beibei.com";
		String[] temp1;
		String delimeter1 = "\\.";
		temp1 = str1.split(delimeter1);
		for (String x: temp1) {
			System.out.println(x);
			//System.out.println("\n");
		}

	}
}
