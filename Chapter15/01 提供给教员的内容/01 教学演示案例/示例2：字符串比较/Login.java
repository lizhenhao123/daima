package cn.jbit.classandobject;
import java.util.*;
public class Login {

	/**
	 * ��¼
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String uname,pwd;
		
		System.out.print("�������û����� ");
		uname=input.next();
		System.out.print("���������룺 ");
		pwd=input.next();
		
		if(uname.equals("TOM")&&pwd.equals("1234567")){
			System.out.print("��¼�ɹ��� ");
		}else{
			System.out.print("�û��������벻ƥ�䣬��¼ʧ�ܣ�");
		}
	}
}
