package cn.jbit.classandobject;

import java.util.Scanner;
	/**
	 * �ϻ��׶�4�� ��¼��������Ʒ 
	 *
	 */
public class Goods {
	
	String[] goods=new String[]{"�����","ϴ�»�","���ӻ�","�� ��","�յ���"};
	double[] price=new double[]{124.23,4500,8800.90,5000.88,4456,12000.46};
	
	/**
	 * 	��¼��֤
	 * @return flag��¼�Ƿ�ɹ���trueΪ�ɹ�
	 */
	public boolean login(){
		boolean flag=false;
		Scanner input = new Scanner(System.in);		
		
		System.out.print("�������û����� ");
		String name=input.next();
		System.out.print("���������룺 ");
		String pwd=input.next();		
		
		if(name.equals("TOM")&&pwd.equals("123")){
			System.out.println("��¼�ɹ��� ");
			flag=true;
		}else{
			System.out.println("�û��������벻ƥ�䣬��¼ʧ�ܣ�");
		}
		return flag;
	}
	/**
	 * 	��ʾ��ʽת����ÿ����λ�Ӷ��� 
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
	 * 	��Ʒ��ʾ 
	 */
	public void showGoods(){
		System.out.print("*********��ӭ������Ʒ������*********");
		System.out.print("\n\t���\t��Ʒ\t�۸�\n");
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
			
			System.out.print("����������������Ʒ��ţ�");
			serial=input.nextInt();
			System.out.print("����������������");
			num=input.nextInt();
			
			totle=g.price[serial-1]*num;//�����ܽ��		
			System.out.print("����Ҫ���"+g.change(totle));
		}
	}
}
