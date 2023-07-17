package com.hspedu.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//该功能是完成零钱通的各个功能的类
//要求使用 oop 面向对象
//将各个功能对应一个方法
public class SmallChangeSysOOP {
//属性
	boolean loop = true;
	Scanner scanner = new Scanner(System.in);//输入
    String key = "";
	
	//2.完成零钱通明细
	//2.老汉思路 先可以把收益入账和消费保存到数组 （2）可以使用对象 （3） 简单的话可以使用
	   //String拼接
	String details = "\n------------零钱通明细OOP------------";
	//3完成收益入账 完成 功能驱动程序增加新的变化和代码
	//3定义新的变量
	
	double money = 0;
	double balance = 0; //余额¥
	Date date = null; //date 是 java.util.Date 类型，表示日期
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//可以用于日期格式化
	// 消费
	//定义先变量 保存消费的原因
	String note = "";
	
//先完成显示菜单
    public void mainManu() {
    	do {
			System.out.println("===========零钱通目录==========");
			System.out.print("\t1 零钱通明细");
			System.out.println("\t2 收益入账");
			System.out.println("\t3 消费");
			System.out.println("\t4 退      出");
			
			System.out.println("请选择 1-4：");
			 key = scanner.next();//接受输入
			//使用 switch 分支控制
			switch(key) {
			case"1":
				this.detail();
				break;
			case"2":
				this.income();
				break;
			case"3":
				this.pay();
				break;
			case"4":
				this.exit();
				default:
					System.out.println("选择有误，请重现选择");
			}
			
		} while(loop);
    }
    //零钱通明细
    public void detail() {
    	System.out.println(details);
    }
    //收益入账
    public void income() {
    	System.out.println("收益入账金额");
		money = scanner.nextDouble();
		//money 的值范围校验
		//找出不正确金额条件 然后给提示 就直接break
		if(money <= 0) {
			System.out.println("收益入账金额 需要 大于0");
			return;//退出方法
		}
		balance += money;
		//拼接收益入账信息到 details
		date = new Date();//获取当前日期
		//System.out.println(sdf.format(date));
		details +="\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + balance;
    }
    public void pay() { //消费
    	System.out.println("消费金额");
		money = scanner.nextDouble();
		//money 的值范围校验
		if(money <= 0 || money > balance) {
			System.out.println("消费金额应该在 0 -" + balance);
	
          }
    }
    public void exit() {
    	//定义一个变量 choice 接受用户的输入
		//使用while + break 来处理接收到的输入是 y 或 n
		//退出 while 后 再判断choice 是y还是 n 就可以决定是否退出
		//一段代码 完成一个小功能 尽量不要混在一起
		String choice = "";
		while(true) {
			System.out.println("你确定要退出吗  ");
			choice = scanner.next();
			if("y".equals(choice) || "n".equals(choice)) {
				break;
			}
		}
	    //当用户退出 while 进行判断
		if(choice.equals("y")) {
			loop = false;
		}
    }
}
