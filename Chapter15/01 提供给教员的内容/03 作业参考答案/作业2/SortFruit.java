package cn.jbit.classandobject;

import java.util.*;
/**
 * ��ҵ2��ˮ������ 
 *
 */
public class SortFruit {    
	public static void main(String[] args) {
		String fruit[] = new String[5];
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < fruit.length; i++){
			System.out.print("�������" + (i+1) + "��ˮ����");
			fruit[i] = input.next();
		}
		Arrays.sort(fruit);
		System.out.println("\n��Щˮ�����ֵ��г��ֵ�˳���ǣ�");
		for(int i = 0; i < fruit.length; i++ ){
			System.out.println(fruit[i]);
		}
	}
}
