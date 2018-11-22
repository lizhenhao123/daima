package cn.jbit.classandobject;

import java.util.Scanner;
/**
 * 作业5：字符串查找 
 *
 */
public class StringExplorer {
	/**
	 * 定位字符
	 */
	public void locateChar(String full, char c) {
		System.out.print(c + "出现的位置是： ");
		for (int i = 0; i < full.length(); i++) {
			if (c == full.charAt(i)) {
				System.out.print(i + "\t");
			}
		}
	}

	/**
	 * 定位字符串
	 */
	public void locateString(String full, String s) {
		int index = 0;
		int i = index;
		int length = full.length();
		System.out.print(s + "出现的位置是： ");
		do {
			index = full.indexOf(s, i);
			if (index == -1) {
				break;
			}
			System.out.print(index + "   ");
			i = index + s.length();
		} while (i <= length);
	}

	public static void main(String[] args) {
		StringExplorer se = new StringExplorer();
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一段字符： ");
		String full = input.next();
		System.out.println("请输入要查询的字符串： ");
		String s = input.next();
		se.locateString(full, s);
	}
}
