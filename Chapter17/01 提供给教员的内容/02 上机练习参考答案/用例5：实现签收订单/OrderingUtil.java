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
	
	Scanner input = new Scanner(System.in);
	
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
		oSet.times[1] = 18;
		oSet.addresses[1] = "天成路207号";
		oSet.sumPrices[1] = 20.0;
		oSet.states[1] = 0;
	}
	
	public void startMenu(){

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
			
			// 根据用户选择的功能编号执行相应功能
			switch (choose) {
			case 1:
				// 我要订餐
				System.out.println("***我要订餐***");
				add();
				break;
			case 2:
				// 查看餐袋
				System.out.println("***查看餐袋***");
				display();
				break;
			case 3:
				// 签收订单
				System.out.println("***签收订单***");
				sign();
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
	
	boolean add() {
		boolean isAdd = false;  //记录是否可以订餐
		
		for (int j = 0; j < oSet.names.length; j++) {					
            if(oSet.names[j] == null){  //找到第一个空位置，可以添加订单信息
         	   isAdd = true;  //置标志位，可以订餐
         	   System.out.print("请输入订餐人姓名：");
					String name = input.next(); 
				// 显示供选择的菜品信息
				System.out.println("序号" + "\t" + "菜名" + "\t" + "单价" + "\t" + "点赞数");
				for (int i = 0; i < dishNames.length; i++) {
					String price = prices[i] + "元";
					String priaiseNum = (praiseNums[i]) > 0 ? praiseNums[i]
							+ "赞" : "0";
					System.out.println((i + 1) + "\t" + dishNames[i] + "\t"	+price+"\t"+ priaiseNum);
				}
				// 用户点菜
				System.out.print("请选择您要点的菜品编号:");
				int chooseDish = input.nextInt();
				System.out.print("请选择您需要的份数:");
				int number = input.nextInt();
				String dishMeg =  dishNames[chooseDish - 1]
						+" "+ number + "份";
				double sumPrice = prices[chooseDish - 1] * number;
				//餐费满50元，免送餐费5元
				double deliCharge = 0;                   
				if (sumPrice < 50)
					deliCharge=5;	

				System.out.print("请输入送餐时间（送餐时间是10点至20点间整点送餐）:");
				int time = input.nextInt();
				while (time < 10 || time > 20) {
					System.out.print("您的输入有误，请输入10~20间的整数！");
					time = input.nextInt();
				}
				System.out.print("请输入送餐地址：");
				String address = input.next();
									
				//无需添加状态，默认是0，即已预订状态。
				System.out.println("订餐成功！");
				System.out.println("您订的是："+dishMeg);
				System.out.println("送餐时间："+time+"时");
				System.out.println("餐费："+sumPrice+"元，送餐费"+deliCharge+"元，总计："+(sumPrice+deliCharge)+"元。");
				
				//添加数据
				oSet.names[j] = name;
				oSet.dishMegs[j] = dishMeg;
				oSet.times[j] = time;
				oSet.addresses[j] = address;
				oSet.sumPrices[j] = sumPrice+deliCharge;					
				break;					
            }
		}
		if(!isAdd){
			System.out.println("对不起，您的餐袋已满！");
			return false;
		}
		else
			return true;
	}
	void display(){
		System.out.println("序号\t订餐人\t餐品信息\t\t送餐时间\t送餐地址\t\t总金额\t订单状态");
		for(int i=0;i<oSet.names.length;i++){
			if(oSet.names[i]!=null){  
				String state = (oSet.states[i]==0)?"已预定":"已完成";
				String date = oSet.times[i]+"时";
				String sumPrice = oSet.sumPrices[i]+"元";
				System.out.println((i+1)+"\t"+oSet.names[i] 
						+ "\t"+oSet.dishMegs[i]+"\t"+date+"\t"
						+ oSet.addresses[i]+"\t"+sumPrice+"\t"+state);
				
			}
		}
	}
	void sign(){
		boolean isSignFind = false;  //找到要签收的订单
		
		System.out.print("请选择要签收的订单序号：");
		int signOrderId = input.nextInt();
		for(int i=0;i<oSet.names.length;i++){
			//状态为已预定，序号为用户输入的订单序号：可签收
			//状态为已完成，序号为用户输入的订单序号：不可签收					
			if(oSet.names[i]!=null && oSet.states[i]==0 && signOrderId==i+1){
				oSet.states[i] = 1; //将状态值置为已完成
				System.out.println("订单签收成功！");
				isSignFind = true;
			}else if(oSet.names[i]!=null && oSet.states[i]==1 && signOrderId==i+1){
				System.out.println("您选择的订单已完成签收，不能再次签收！");
				isSignFind = true;
			}
		}
		//未找到的订单序号：不可签收
		if(!isSignFind){
			System.out.println("您选择的订单不存在！");
		}

	}
}
