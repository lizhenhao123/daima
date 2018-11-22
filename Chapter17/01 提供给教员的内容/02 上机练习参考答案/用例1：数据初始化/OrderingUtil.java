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
		oSet.times[1] = 18;
		oSet.addresses[1] = "天成路207号";
		oSet.sumPrices[1] = 20.0;
		oSet.states[0] = 0;
	}
	
}
