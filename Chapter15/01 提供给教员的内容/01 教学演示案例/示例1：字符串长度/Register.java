package cn.jbit.classandobject;
import java.util.*;
public class Register {

	/**
	 * ע�����볤�Ȳ�����6λ
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String uname,pwd;
		
		System.out.print("�������û����� ");
		uname=input.next();
		System.out.print("���������룺 ");
		pwd=input.next();
		
		if(pwd.length()>=6){
			System.out.print("ע��ɹ��� ");
		}else{
			System.out.print("���볤�Ȳ���С��6λ��");
		}
		
	}
}
