package cn.jbit.classandobject;

public class Lyric {

	/**
	 * ��ָ��
	 * 
	 */
	public static void main(String[] args) {
		String words="��ͤ�� �ŵ��� ���ݱ����� ���� �������� Ϧ��ɽ��ɽ";
		String[] printword=new String[100];//��������
		
		System.out.println("***ԭ��ʸ�ʽ***\n"+words);
		System.out.println("\n***��ֺ��ʸ�ʽ***");
		printword=words.split(" ");//���տո���в��
		for(int i=0;i<printword.length;i++){
			System.out.println(printword[i]);//��ӡ���
		}

	}

}
