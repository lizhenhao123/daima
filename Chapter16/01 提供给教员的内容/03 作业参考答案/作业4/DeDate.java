
import java.util.*;

public class DeDate {

	public static void main(String[] args) {
		System.out.print("请输入一个日期（月/日/年）: ");
		Scanner input = new Scanner(System.in);
		String date = input.next();
		int pos1 = date.indexOf("/");
		int pos2 = date.lastIndexOf("/");
		int length = date.length();
		String month = date.substring(0, pos1);
		String day = date.substring((pos1 + 1), pos2);
		String year = date.substring((pos2 + 1), length);
		System.out.println("\n\n" + year + "年" + month + "月" + day + "日");

	}
}
