package cn.jbit.classandobject;

import java.util.Scanner;

/**
 * �ϻ��׶�2�� ʵ�ֻ�Աע������ 
 *
 */
public class Register2 {
	/**
	 * ��֤ע����Ϣ
	 * @return flag ��֤��Ϣ
	 */
	public String verify(String id,String cell,String phone){
		String flag="ע��ɹ���";
		String[] splitphone=new String[3];
		splitphone=phone.split("-",2);
		if(id.length()!=16 && id.length()!=18){
			flag="���֤�ű�����16λ��18λ��";
		}else if(cell.length()!=11){
			flag="�ֻ����������11λ��";
		}else if(splitphone[0].length()!=4 && splitphone[0].length()!=7){
			flag="�����������ű���Ϊ4λ���绰���������7λ��";
		}
		return flag;
	}
	public static void main(String[] args) {
		Register2 r=new Register2();
		Scanner input = new Scanner(System.in);
		String ID,p1,p2;
		String resp;
		
		System.out.println("***��ӭ����ע��ϵͳ*** \n");
		do{			
			System.out.print("���������֤�� ");
			ID=input.next();
			System.out.print("�������ֻ��ţ� ");
			p1=input.next();
			System.out.print("�����������ţ� ");
			p2=input.next();		
			resp=r.verify(ID, p1, p2);
			System.out.println(resp);
		}while(!resp.equals("ע��ɹ���"));
		
	}
}
