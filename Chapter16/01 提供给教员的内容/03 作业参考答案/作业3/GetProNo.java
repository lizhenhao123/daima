import java.util.Scanner;
public class GetProNo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("���������:  "); 
		int year = input.nextInt();   
		System.out.print("��ѡ���Ʒ���ͣ�1. ̨ʽ�� 2. �ʼǱ� 3. ������");
		int type = input.nextInt();
		int random = (int)(Math.random() * 1000);  //����3λ�����
		String productNo = year + "0" + type + random;   //������Ʒ���
		System.out.println("\n�ù̶��ʲ�����ǣ� " + productNo);
	}
}
