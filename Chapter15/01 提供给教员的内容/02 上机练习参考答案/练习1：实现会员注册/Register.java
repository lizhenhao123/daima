package cn.jbit.classandobject;

import java.util.Scanner;

/**
 * �ϻ��׶�1�� ע�� 
 *
 */
public class Register {
	/**
	 * ��֤ע����Ϣ
	 * @return flag ��֤��Ϣ
	 */
	public boolean verify(String name,String pwd1,String pwd2){
		boolean flag=false;
		if(name.length()<3 || pwd1.length()<6){
			System.out.println("�û������Ȳ���С��3�����볤�Ȳ���С��6��");
		}else if(!pwd1.equals(pwd2)){
			System.out.println("������������벻��ͬ��");
		}else{
			System.out.println("ע��ɹ������μ��û��������롣");
			flag=true;
		}
		return flag;
	}
	public static void main(String[] args) {
		Register r=new Register();
		Scanner input = new Scanner(System.in);
		String uname,p1,p2;
		boolean resp=false;
		
		System.out.println("***��ӭ����ע��ϵͳ*** \n");
		do{			
			System.out.print("�������û����� ");
			uname=input.next();
			System.out.print("���������룺 ");
			p1=input.next();
			System.out.print("���ٴ��������룺 ");
			p2=input.next();		
			resp=r.verify(uname, p1, p2);		
		}while(!resp);
	}
}
