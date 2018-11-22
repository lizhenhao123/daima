package cn.jbit.classandobject;

import java.util.Scanner;
/**
 * 作业3：姓、名输出 
 *
 */
public class GetName {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("输入任意一个姓名： ");
		String name = input.next();
		int length = name.length();
		System.out.println("\n姓氏:  " + name.charAt(0));   //获得姓
		System.out.println("名字：  " + name.substring(1,length));   //获得名
	}
}
