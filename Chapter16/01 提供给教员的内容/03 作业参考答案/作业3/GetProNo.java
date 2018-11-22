import java.util.Scanner;
public class GetProNo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入年份:  "); 
		int year = input.nextInt();   
		System.out.print("请选择产品类型（1. 台式机 2. 笔记本 3. 其他）");
		int type = input.nextInt();
		int random = (int)(Math.random() * 1000);  //产生3位随机数
		String productNo = year + "0" + type + random;   //产生产品编号
		System.out.println("\n该固定资产编号是： " + productNo);
	}
}
