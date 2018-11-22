package cn.jbit.classandobject;

import java.util.Scanner;
	/**
	 * 上机阶段4： 登录并购买商品 
	 *
	 */
public class Goods {
	
	String[] goods=new String[]{"电风扇","洗衣机","电视机","冰 箱","空调机"};
	double[] price=new double[]{124.23,4500,8800.90,5000.88,4456,12000.46};
	
	/**
	 * 	登录验证
	 * @return flag登录是否成功，true为成功
	 */
	public boolean login(){
		boolean flag=false;
		Scanner input = new Scanner(System.in);		
		
		System.out.print("请输入用户名： ");
		String name=input.next();
		System.out.print("请输入密码： ");
		String pwd=input.next();		
		
		if(name.equals("TOM")&&pwd.equals("123")){
			System.out.println("登录成功！ ");
			flag=true;
		}else{
			System.out.println("用户名或密码不匹配，登录失败！");
		}
		return flag;
	}
	/**
	 * 	显示格式转换，每隔三位加逗号 
	 * @param d
	 */
	public StringBuffer change(double d){
		StringBuffer str=new StringBuffer(String.valueOf(d));		
		for(int i=str.indexOf(".")-3;i>0;i=i-3){
			str.insert(i,',');
		}
		return str;
	}
	/**
	 * 	商品显示 
	 */
	public void showGoods(){
		System.out.print("*********欢迎进入商品批发城*********");
		System.out.print("\n\t编号\t商品\t价格\n");
		for(int i=0;i<goods.length;i++){
			System.out.print("\t"+(i+1));
			System.out.print("\t"+goods[i]);			
			System.out.print("\t"+change(price[i])+"\n");	
		}
		System.out.println("**********************************");
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);	
		Goods g=new Goods();
		int serial,num;
		double totle=0;
		
		if(g.login()){
			g.showGoods();
			
			System.out.print("请输入您批发的商品编号：");
			serial=input.nextInt();
			System.out.print("请输入批发数量：");
			num=input.nextInt();
			
			totle=g.price[serial-1]*num;//计算总金额		
			System.out.print("您需要付款："+g.change(totle));
		}
	}
}
