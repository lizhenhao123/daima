import java.util.Scanner;


public class Login{
	
	/**
	 * 判断学生登录是否成功
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
		System.out.println("请输入用户名：");
		String name = input.next();
		System.out.println("请输入密码：");
		String password = input.next();
		
		Login lg=new Login ();
		boolean flag=lg.login(name, password);
		if(flag){
			System.out.println("登录成功！");
		}else{
			System.out.println("用户名或密码错误！");
		}
	}
}
