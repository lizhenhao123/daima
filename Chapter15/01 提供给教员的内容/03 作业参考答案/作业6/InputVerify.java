package cn.jbit.classandobject;

import java.util.*;
/**
 * ��ҵ6����¼�����Ϣ������Ч����֤ 
 *
 */
public class InputVerify {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean con = true;
		/*����������ʽ����Ч��*/
		while(con){
		   System.out.print("\n�������Ա����<��/�գ�00/00>��  ");
		   String day = input.next();
		   if(day.indexOf('/')!=2){
			   System.out.println("������ʽ�������");
		   }else{
		       System.out.println("�û�Ա�����ǣ� " + day);	
		       con = false;
		   }
		}
		
		con = true;
		/*�����û��������Ч��*/
		while(con){
		   System.out.print("\n�������Ա����<6~10λ>��  ");
		   String psw = input.next();
		   if(psw.length() < 6 || psw.length() > 10){
			    System.out.println("������ʽ�������");
		   }else{
			    System.out.println("�û�Ա�������ǣ� " + psw);	
			    con = false;
		   }
		}
	}
}
