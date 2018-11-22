package cn.jbit.classandobject;

import java.util.Scanner;
/**
 * ��ҵ5���ַ������� 
 *
 */
public class StringExplorer {
	/**
	 * ��λ�ַ�
	 */
	public void locateChar(String full, char c) {
		System.out.print(c + "���ֵ�λ���ǣ� ");
		for (int i = 0; i < full.length(); i++) {
			if (c == full.charAt(i)) {
				System.out.print(i + "\t");
			}
		}
	}

	/**
	 * ��λ�ַ���
	 */
	public void locateString(String full, String s) {
		int index = 0;
		int i = index;
		int length = full.length();
		System.out.print(s + "���ֵ�λ���ǣ� ");
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
		System.out.println("������һ���ַ��� ");
		String full = input.next();
		System.out.println("������Ҫ��ѯ���ַ����� ");
		String s = input.next();
		se.locateString(full, s);
	}
}
