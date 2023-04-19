import java.util.Scanner;
public class For09 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
        double totalScore = 0; //累计所有学生的成绩
        int passNum = 0;//累计及格人数
        int classNum = 3;
        int stuNum = 5;
		for(int i = 1; i <= classNum ; i++) { //三个班的成绩for循环
			double sum = 0; //一个班级的总分
		for (int j = 1; j <= stuNum; j++) {  //一个班五个学生的成绩for循环
			System.out.println("请输第" + i + "班" + j + "个学生的成绩" );
			double score = myScanner.nextDouble(); //输入成绩
			if (score >= 60) {
				passNum++; //及格人数自增
			}
			sum += score; //一个班级的总分 每个学生分数累加
			System.out.println("成绩为" + score);
		}
		System.out.println("一个班级的总分=" + sum + "平均成绩=" + (sum / stuNum)); 
		totalScore += sum;//把每个班级的sum累计到totalScore = 累计所有学生的成绩
	}
		System.out.println("三个班级的总分=" + totalScore  + "平均成绩=" + totalScore  /(classNum *stuNum));
		System.out.println("及格人数=" + passNum);
}
}