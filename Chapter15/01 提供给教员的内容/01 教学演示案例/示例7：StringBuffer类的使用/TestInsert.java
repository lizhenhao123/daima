package cn.jbit.classandobject;
import java.util.*;
public class TestInsert {

	/**
	 * ÿ����λ���붺��
	 * 
	 */
	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);
		//�������ִ��������StringBuffer���͵Ķ�����
		System.out.print("������һ�����֣� ");
		String nums = input.next();
		StringBuffer str=new StringBuffer(nums);
		//�Ӻ���ǰÿ����λ��Ӷ���
		for(int i=str.length()-3;i>0;i=i-3){
			str.insert(i,',');
		}
		System.out.print(str);
	}
}
