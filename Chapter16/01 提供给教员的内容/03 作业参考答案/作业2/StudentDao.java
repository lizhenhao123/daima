import java.util.Scanner;


public class StudentDao {
	/**
	 * ģ�����ѧ�����ݵ����ݿ�
	 * @param stu
	 */
	public void insertStudent(Student stu){
		String name=stu.getName();
		int age=stu.getAge();
		String sex=stu.getSex();
		String school=stu.getSchool();		
		System.out.println("\n����ѧ����Ϣ�ɹ�д�뵽���ݿ�");	
		System.out.println(name+"  "+age+"   "+ sex +"  "+school);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������ѧ��������");
		String name = input.next();
		System.out.println("������ѧ�����䣺");
		int age = input.nextInt();
		System.out.println("������ѧ���Ա�");
		String sex = input.next();
		System.out.println("������ѧ��ѧУ��");
		String school = input.next();
		Student stu = new Student();
		stu.setName(name);
		stu.setAge(age);
		stu.setSchool(school);
		stu.setSex(sex);
		
		StudentDao stuDao =new StudentDao();
		stuDao.insertStudent(stu);
	}
}
