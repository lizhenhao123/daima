package cn.jbit.classandobject;
import java.util.Scanner;
/**
 * �ϻ��׶�3�� ͳ���ַ����ִ��� 
 *
 */
public class Counter {
	public int counter(String inputs,String word){
		int counter=0;//����������ʼ��0
		String[] temps=new String[inputs.length()];
		//�ַ���ת��������
		for(int i=0;i<temps.length;i++){
			temps[i]=inputs.substring(i,i+1);			
		}
		//�Ƚ���ĸ������
		for(int j=0;j<temps.length;j++){
			if(temps[j].equals(word)){
				counter++;
			}
		}
		return counter;
	}
	public static void main(String[] args) {		
		Scanner myinput=new Scanner(System.in);
		Counter cnt=new Counter();
		
		//����2�������������û�������
		String myString;
		String myWord;
		System.out.print("������һ���ַ�����");
		myString=myinput.next();
		System.out.print("������Ҫ���ҵ��ַ���");
		myWord=myinput.next();
		
		//���÷�����������
		int geshu=cnt.counter(myString,myWord);
		System.out.print("\""+myString+"\"�а���"+geshu+"��\""+myWord+"\"��");
	}
}
