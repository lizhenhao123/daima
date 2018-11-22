package cn.jbit.classandobject;

public class PrintScore {

	/**
	 * 打印成绩单
	 * 
	 */
	public static void main(String[] args) {
		int sqlScore = 80;        	//SQL成绩
		int javaScore = 90;       	//Java成绩
		double htmlScore = 86.7;  	//HTML成绩

		String scoreSheet = "SQL:" + sqlScore + "  Java:" + javaScore  + "  HTML:" + htmlScore;    			//成绩单
		//打印成绩单
        System.out.println("*****成绩单*****");
        System.out.println(scoreSheet);   


	}

}
