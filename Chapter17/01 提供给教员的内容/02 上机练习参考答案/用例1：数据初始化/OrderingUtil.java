package cn.jbit.orderingmgr;

import java.util.Scanner;

/**
 * ���͹���
 * 
 * @author bdqn
 * 
 */
public class OrderingUtil {
	
	// ��ѡ��Ĳ�Ʒ��Ϣ
	String[] dishNames = { "���մ���", "������˿", "ʱ������" }; // ��Ʒ����
	double[] prices = new double[] { 38.0, 20.0, 10.0 }; // ��Ʒ����
	int[] praiseNums = new int[3]; // ������
	
	//������������
	OrderingSet oSet = new OrderingSet();
	
	//��ʼ2������	
	public void initial() {			
		//��ʼ����1��������Ϣ
		oSet.names[0] = "����";
		oSet.dishMegs[0] = "���մ��� 2��";
		oSet.times[0] = 12;
		oSet.addresses[0] = "���·207��";
		oSet.sumPrices[0] = 76.0;
		oSet.states[0] = 1;
		
		//��ʼ����2��������Ϣ
		oSet.names[1] = "����";
		oSet.dishMegs[1] = "������˿ 2��";
		oSet.times[1] = 18;
		oSet.addresses[1] = "���·207��";
		oSet.sumPrices[1] = 20.0;
		oSet.states[0] = 0;
	}
	
}
