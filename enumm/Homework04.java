package com.narisu.enumm;

public class Homework04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//编写接口
interface ICalculate {
	//至于该方法完成怎么样的计算 我们交给匿名内部类
	public double  work(double n1,double n2);
	
}

class Cellphone {
	private ICalculate iCalculate;

	public void testWork(ICalculate iCalcuate, double n1,double n2) {
	double result = iCalculate.work(n1,n2);
	System.out.println("计算后的结果是=" + result);
	}
}