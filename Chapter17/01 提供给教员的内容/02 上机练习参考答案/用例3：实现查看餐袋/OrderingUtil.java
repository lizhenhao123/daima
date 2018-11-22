package cn.jbit.orderingmgr;

import java.util.Scanner;

/**
 * 订餐管理
 * 
 * @author bdqn
 * 
 */
public class OrderingUtil {
	
	// 供选择的菜品信息
	String[] dishNames = { "红烧带鱼", "鱼香肉丝", "时令鲜蔬" }; // 菜品名称
	double[] prices = new double[] { 38.0, 20.0, 10.0 }; // 菜品单价
	int[] praiseNums = new int[3]; // 点赞数
	
	//创建订单对象
	OrderingSet oSet = new OrderingSet();
	
	//初始2个订单	
	public void initial() {			
		//初始化第1条订单信息
		oSet.names[0] = "张晴";
		oSet.dishMegs[0] = "红烧带鱼 2份";
		oSet.times[0] = 12;
		oSet.addresses[0] = "天成路207号";
		oSet.sumPrices[0] = 76.0;
		oSet.states[0] = 1;
		
		//初始化第2条订单信息
		oSet.names[1] = "张晴";
		oSet.dishMegs[1] = "鱼香肉丝 2份";
		oSet.times[1] = 108;
		oSet.addresses[1] = "天成路207号";
		oSet.sumPrices[1] = 20.0;
		oSet.states[1] = 0;
	}
	
	public void startMenu(){
		Scanner input = new Scanner(System.in);
		int num = -1; // 用户输入0返回主菜单，否则退出系统
		boolean isExit = false; // 标志用户是否退出系统： true:退出系统
	
		System.out.println("\n欢迎使用“吃货联盟订餐系统”");
		// 循环：显示菜单，根据用户选择的数字执行相应功能
		do {
			// 显示菜单			
			System.out.println("****************************");
			System.out.println("1、我要订餐");
			System.out.println("2、查看餐袋");
			System.out.println("3、签收订单");
			System.out.println("4、删除订单");
			System.out.println("5、我要点赞");
			System.out.println("6、退出系统");
			System.out.println("****************************");
			System.out.print("请选择：");
			int choose = input.nextInt(); // 记录用户选择的功能编号
			//boolean isAdd = false;  //记录是否可以订餐
			//boolean isSignFind = false;  //找到要签收的订单
			//boolean isDelFind = false;  //找到要删除的订单
			// 根据用户选择的功能编号执行相应功能
			switch (choose) {
			case 1:
				// 我要订餐
				System.out.println("***我要订餐***");				
				break;
			case 2:
				// 查看餐袋
				System.out.println("***查看餐袋***");
                display();
				break;
			case 3:
				// 签收订单
				System.out.println("***签收订单***");				
				break;
			case 4:
				// 删除订单
				System.out.println("***删除订单***");								
				break;
			case 5:
				// 我要点赞
				System.out.println("***我要点赞***");
				
				break;
			case 6:
				// 退出系统
				isExit = true;
				break;
			default:
				//退出系统
				isExit = true;
				break;
			}
			if (!isExit) {
				System.out.print("输入0返回：");
				num = input.nextInt();
			} else {
				break;
			}
		} while (num == 0);
		
		System.out.println("谢谢使用，欢迎下次光临！");
	}
	void display(){
		System.out.println("序号\t订餐人\t餐品信息\t\t送餐时间\t送餐地址\t\t总金额\t订单状态");
		for(int i=0;i<oSet.names.length;i++){
			if(oSet.names[i]!=null){
				System.out.println(i+"\t"+oSet.states[i]);
				String state = (oSet.states[i]==0)?"已预定":"已完成";
				String date = oSet.times[i]+"时";
				String sumPrice = oSet.sumPrices[i]+"元";
				System.out.println((i+1)+"\t"+oSet.names[i] 
						+ "\t"+oSet.dishMegs[i]+"\t"+date+"\t"
						+ oSet.addresses[i]+"\t"+sumPrice+"\t"+state);
				
			}
		}
	}
}
