package cn.jbit.classandobject;

import java.util.Scanner;
/**
 * ��ҵ3���ա������ 
 *
 */
public class GetName {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("��������һ�������� ");
		String name = input.next();
		int length = name.length();
		System.out.println("\n����:  " + name.charAt(0));   //�����
		System.out.println("���֣�  " + name.substring(1,length));   //�����
	}
}
