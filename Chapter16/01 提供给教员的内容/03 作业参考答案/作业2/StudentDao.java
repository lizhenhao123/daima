import java.util.Scanner;


public class StudentDao {
	/**
	 * 模拟插入学生数据到数据库
	 * @param stu
	 */
	public void insertStudent(Student stu){
		String name=stu.getName();
		int age=stu.getAge();
		String sex=stu.getSex();
		String school=stu.getSchool();		
		System.out.println("\n将该学生信息成功写入到数据库");	
		System.out.println(name+"  "+age+"   "+ sex +"  "+school);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入学生姓名：");
		String name = input.next();
		System.out.println("请输入学生年龄：");
		int age = input.nextInt();
		System.out.println("请输入学生性别：");
		String sex = input.next();
		System.out.println("请输入学生学校：");
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
