import java.util.Scanner;


public class Login{
	
	/**
	 * �ж�ѧ����¼�Ƿ�ɹ�
	 * @param name
	 * @param password
	 * @return
	 */
	public boolean login(String name,String password){
		if(name.equals("jbit")&&password.equals("bdqn")){
			return true;
		}else
			return false;
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("�������û�����");
		String name = input.next();
		System.out.println("���������룺");
		String password = input.next();
		
		Login lg=new Login ();
		boolean flag=lg.login(name, password);
		if(flag){
			System.out.println("��¼�ɹ���");
		}else{
			System.out.println("�û������������");
		}
	}
}
