package cn.jbit.classandobject;

import java.util.*;
/**
 * 作业2：水果排序 
 *
 */
public class SortFruit {    
	public static void main(String[] args) {
		String fruit[] = new String[5];
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < fruit.length; i++){
			System.out.print("请输入第" + (i+1) + "种水果：");
			fruit[i] = input.next();
		}
		Arrays.sort(fruit);
		System.out.println("\n这些水果在字典中出现的顺序是：");
		for(int i = 0; i < fruit.length; i++ ){
			System.out.println(fruit[i]);
		}
	}
}
