import java.util.Scanner;
public class GetBirthday {

	public static void main(String[] args) {
		
		System.out.print("请输入用户的身份证号码： ");
		Scanner input = new Scanner(System.in);
		String id = input.next();
		String year = "";
		String month = "";
		String day = "";
		if(id.length() != 18){   //有效身份证号码为18位
			System.out.println("\n身份证号码无效！");
		}else{
			year = id.substring(6,10);   //提取年
			month = id.substring(10,12); //提取月
			day = id.substring(12,14);   //提取日
			System.out.println("\n该用户生日是： " + year + "年" + month + "月" + day + "日");
		}
	}
}
