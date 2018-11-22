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
		oSet.times[1] = 108;
		oSet.addresses[1] = "���·207��";
		oSet.sumPrices[1] = 20.0;
		oSet.states[1] = 0;
	}
	
	public void startMenu(){
		Scanner input = new Scanner(System.in);
		int num = -1; // �û�����0�������˵��������˳�ϵͳ
		boolean isExit = false; // ��־�û��Ƿ��˳�ϵͳ�� true:�˳�ϵͳ
	
		System.out.println("\n��ӭʹ�á��Ի����˶���ϵͳ��");
		// ѭ������ʾ�˵��������û�ѡ�������ִ����Ӧ����
		do {
			// ��ʾ�˵�			
			System.out.println("****************************");
			System.out.println("1����Ҫ����");
			System.out.println("2���鿴�ʹ�");
			System.out.println("3��ǩ�ն���");
			System.out.println("4��ɾ������");
			System.out.println("5����Ҫ����");
			System.out.println("6���˳�ϵͳ");
			System.out.println("****************************");
			System.out.print("��ѡ��");
			int choose = input.nextInt(); // ��¼�û�ѡ��Ĺ��ܱ��
			//boolean isAdd = false;  //��¼�Ƿ���Զ���
			//boolean isSignFind = false;  //�ҵ�Ҫǩ�յĶ���
			//boolean isDelFind = false;  //�ҵ�Ҫɾ���Ķ���
			// �����û�ѡ��Ĺ��ܱ��ִ����Ӧ����
			switch (choose) {
			case 1:
				// ��Ҫ����
				System.out.println("***��Ҫ����***");				
				break;
			case 2:
				// �鿴�ʹ�
				System.out.println("***�鿴�ʹ�***");
                display();
				break;
			case 3:
				// ǩ�ն���
				System.out.println("***ǩ�ն���***");				
				break;
			case 4:
				// ɾ������
				System.out.println("***ɾ������***");								
				break;
			case 5:
				// ��Ҫ����
				System.out.println("***��Ҫ����***");
				
				break;
			case 6:
				// �˳�ϵͳ
				isExit = true;
				break;
			default:
				//�˳�ϵͳ
				isExit = true;
				break;
			}
			if (!isExit) {
				System.out.print("����0���أ�");
				num = input.nextInt();
			} else {
				break;
			}
		} while (num == 0);
		
		System.out.println("ллʹ�ã���ӭ�´ι��٣�");
	}
	void display(){
		System.out.println("���\t������\t��Ʒ��Ϣ\t\t�Ͳ�ʱ��\t�Ͳ͵�ַ\t\t�ܽ��\t����״̬");
		for(int i=0;i<oSet.names.length;i++){
			if(oSet.names[i]!=null){
				System.out.println(i+"\t"+oSet.states[i]);
				String state = (oSet.states[i]==0)?"��Ԥ��":"�����";
				String date = oSet.times[i]+"ʱ";
				String sumPrice = oSet.sumPrices[i]+"Ԫ";
				System.out.println((i+1)+"\t"+oSet.names[i] 
						+ "\t"+oSet.dishMegs[i]+"\t"+date+"\t"
						+ oSet.addresses[i]+"\t"+sumPrice+"\t"+state);
				
			}
		}
	}
}
