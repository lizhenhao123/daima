import java.util.Scanner;
public class GetBirthday {

	public static void main(String[] args) {
		
		System.out.print("�������û������֤���룺 ");
		Scanner input = new Scanner(System.in);
		String id = input.next();
		String year = "";
		String month = "";
		String day = "";
		if(id.length() != 18){   //��Ч���֤����Ϊ18λ
			System.out.println("\n���֤������Ч��");
		}else{
			year = id.substring(6,10);   //��ȡ��
			month = id.substring(10,12); //��ȡ��
			day = id.substring(12,14);   //��ȡ��
			System.out.println("\n���û������ǣ� " + year + "��" + month + "��" + day + "��");
		}
	}
}
