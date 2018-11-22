package cn.jbit.classandobject;

import java.util.Scanner;

/**
 * 上机阶段2： 实现会员注册升级 
 *
 */
public class Register2 {
	/**
	 * 验证注册信息
	 * @return flag 验证信息
	 */
	public String verify(String id,String cell,String phone){
		String flag="注册成功！";
		String[] splitphone=new String[3];
		splitphone=phone.split("-",2);
		if(id.length()!=16 && id.length()!=18){
			flag="身份证号必须是16位或18位！";
		}else if(cell.length()!=11){
			flag="手机号码必须是11位！";
		}else if(splitphone[0].length()!=4 && splitphone[0].length()!=7){
			flag="座机号码区号必须为4位，电话号码必须是7位！";
		}
		return flag;
	}
	public static void main(String[] args) {
		Register2 r=new Register2();
		Scanner input = new Scanner(System.in);
		String ID,p1,p2;
		String resp;
		
		System.out.println("***欢迎进入注册系统*** \n");
		do{			
			System.out.print("请输入身份证： ");
			ID=input.next();
			System.out.print("请输入手机号： ");
			p1=input.next();
			System.out.print("请输入座机号： ");
			p2=input.next();		
			resp=r.verify(ID, p1, p2);
			System.out.println(resp);
		}while(!resp.equals("注册成功！"));
		
	}
}
