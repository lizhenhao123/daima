package cn.jbit.classandobject;

import java.util.*;
/**
 * 作业6：对录入的信息进行有效性验证 
 *
 */
public class InputVerify {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean con = true;
		/*检验生日形式的有效性*/
		while(con){
		   System.out.print("\n请输入会员生日<月/日：00/00>：  ");
		   String day = input.next();
		   if(day.indexOf('/')!=2){
			   System.out.println("生日形式输入错误！");
		   }else{
		       System.out.println("该会员生日是： " + day);	
		       con = false;
		   }
		}
		
		con = true;
		/*检验用户密码的有效性*/
		while(con){
		   System.out.print("\n请输入会员密码<6~10位>：  ");
		   String psw = input.next();
		   if(psw.length() < 6 || psw.length() > 10){
			    System.out.println("密码形式输入错误！");
		   }else{
			    System.out.println("该会员的密码是： " + psw);	
			    con = false;
		   }
		}
	}
}
