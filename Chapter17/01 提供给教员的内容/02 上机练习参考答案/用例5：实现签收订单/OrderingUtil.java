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
	
	Scanner input = new Scanner(System.in);
	
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
		oSet.states[1] = 0;
	}
	
	public void startMenu(){

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
			
			// �����û�ѡ��Ĺ��ܱ��ִ����Ӧ����
			switch (choose) {
			case 1:
				// ��Ҫ����
				System.out.println("***��Ҫ����***");
				add();
				break;
			case 2:
				// �鿴�ʹ�
				System.out.println("***�鿴�ʹ�***");
				display();
				break;
			case 3:
				// ǩ�ն���
				System.out.println("***ǩ�ն���***");
				sign();
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
	
	boolean add() {
		boolean isAdd = false;  //��¼�Ƿ���Զ���
		
		for (int j = 0; j < oSet.names.length; j++) {					
            if(oSet.names[j] == null){  //�ҵ���һ����λ�ã�������Ӷ�����Ϣ
         	   isAdd = true;  //�ñ�־λ�����Զ���
         	   System.out.print("�����붩����������");
					String name = input.next(); 
				// ��ʾ��ѡ��Ĳ�Ʒ��Ϣ
				System.out.println("���" + "\t" + "����" + "\t" + "����" + "\t" + "������");
				for (int i = 0; i < dishNames.length; i++) {
					String price = prices[i] + "Ԫ";
					String priaiseNum = (praiseNums[i]) > 0 ? praiseNums[i]
							+ "��" : "0";
					System.out.println((i + 1) + "\t" + dishNames[i] + "\t"	+price+"\t"+ priaiseNum);
				}
				// �û����
				System.out.print("��ѡ����Ҫ��Ĳ�Ʒ���:");
				int chooseDish = input.nextInt();
				System.out.print("��ѡ������Ҫ�ķ���:");
				int number = input.nextInt();
				String dishMeg =  dishNames[chooseDish - 1]
						+" "+ number + "��";
				double sumPrice = prices[chooseDish - 1] * number;
				//�ͷ���50Ԫ�����Ͳͷ�5Ԫ
				double deliCharge = 0;                   
				if (sumPrice < 50)
					deliCharge=5;	

				System.out.print("�������Ͳ�ʱ�䣨�Ͳ�ʱ����10����20��������Ͳͣ�:");
				int time = input.nextInt();
				while (time < 10 || time > 20) {
					System.out.print("������������������10~20���������");
					time = input.nextInt();
				}
				System.out.print("�������Ͳ͵�ַ��");
				String address = input.next();
									
				//�������״̬��Ĭ����0������Ԥ��״̬��
				System.out.println("���ͳɹ���");
				System.out.println("�������ǣ�"+dishMeg);
				System.out.println("�Ͳ�ʱ�䣺"+time+"ʱ");
				System.out.println("�ͷѣ�"+sumPrice+"Ԫ���Ͳͷ�"+deliCharge+"Ԫ���ܼƣ�"+(sumPrice+deliCharge)+"Ԫ��");
				
				//�������
				oSet.names[j] = name;
				oSet.dishMegs[j] = dishMeg;
				oSet.times[j] = time;
				oSet.addresses[j] = address;
				oSet.sumPrices[j] = sumPrice+deliCharge;					
				break;					
            }
		}
		if(!isAdd){
			System.out.println("�Բ������Ĳʹ�������");
			return false;
		}
		else
			return true;
	}
	void display(){
		System.out.println("���\t������\t��Ʒ��Ϣ\t\t�Ͳ�ʱ��\t�Ͳ͵�ַ\t\t�ܽ��\t����״̬");
		for(int i=0;i<oSet.names.length;i++){
			if(oSet.names[i]!=null){  
				String state = (oSet.states[i]==0)?"��Ԥ��":"�����";
				String date = oSet.times[i]+"ʱ";
				String sumPrice = oSet.sumPrices[i]+"Ԫ";
				System.out.println((i+1)+"\t"+oSet.names[i] 
						+ "\t"+oSet.dishMegs[i]+"\t"+date+"\t"
						+ oSet.addresses[i]+"\t"+sumPrice+"\t"+state);
				
			}
		}
	}
	void sign(){
		boolean isSignFind = false;  //�ҵ�Ҫǩ�յĶ���
		
		System.out.print("��ѡ��Ҫǩ�յĶ�����ţ�");
		int signOrderId = input.nextInt();
		for(int i=0;i<oSet.names.length;i++){
			//״̬Ϊ��Ԥ�������Ϊ�û�����Ķ�����ţ���ǩ��
			//״̬Ϊ����ɣ����Ϊ�û�����Ķ�����ţ�����ǩ��					
			if(oSet.names[i]!=null && oSet.states[i]==0 && signOrderId==i+1){
				oSet.states[i] = 1; //��״ֵ̬��Ϊ�����
				System.out.println("����ǩ�ճɹ���");
				isSignFind = true;
			}else if(oSet.names[i]!=null && oSet.states[i]==1 && signOrderId==i+1){
				System.out.println("��ѡ��Ķ��������ǩ�գ������ٴ�ǩ�գ�");
				isSignFind = true;
			}
		}
		//δ�ҵ��Ķ�����ţ�����ǩ��
		if(!isSignFind){
			System.out.println("��ѡ��Ķ��������ڣ�");
		}

	}
}
