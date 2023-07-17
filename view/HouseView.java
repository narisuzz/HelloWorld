package com.narisu.view;

import com.narisu.domain.House;
import com.narisu.service.HouseService;
import com.narisu.utils.Utility;

/*
1.显示界面
2.接受用户输入
3.调用HouseService 完成对房屋信息的各种操作
*/
public class HouseView {
	private boolean loop = true;//控制显示菜单
	private char key = ' ';//接受用户选择  输入
	private HouseService houseService = new HouseService(2);//设置数组的大小为2
	
	//编写 delHouse（） 接受输入的Id 调用Service 的del方法
public void delHouse() {
	 System.out.println("==============添加房屋信息==============");
	 System.out.println("输入待删除房屋的编码（-1退出）");
	 int delId = Utility.readInt();
	 if(delId == -1) {
		 System.out.println("==============放弃删除房屋信息==============");
		 return;
	 }
	 System.out.println("请确认是否删除（Y/N），小心选择");
	 //注意必须输入 y n 不然一直死循环
	 boolean choice = Utility.readConfirmSelection();
	 
}
	  //编写一个addHouse（）接受输入 创建House对象  调用add的方法
	  public void addHouse() {
		  System.out.println("==============房屋出租信息菜单==============");
		  System.out.println("姓名：");
		  String name = Utility.readString(8);
		  System.out.println("电话：");
		  String phone = Utility.readString(12);
		  System.out.println("地址：");
		  String address = Utility.readString(16);
		  System.out.println("月租：");
		  int rent = Utility.readInt();
		  System.out.println("状态");
		  String state = Utility.readString(3);
		  //创建一个新的House对象 注意id是系统分配的
		 House newhouse = new House(0,name,phone,address,rent,state);
		 if(houseService.add(newhouse)){
			 System.out.println("==============房屋出租信息菜单==============");
		 } else {
			 System.out.println("==============房屋出租信息失败==============");
		 }
		  
		  
	  }
	 //编写listHouses（）方法 显示房屋列表 
	  public void listHouses() {
	  System.out.println("==============房屋出租信息菜单==============");
	  System.out.println("编号\t房主\t电话\t地址\t月租\t状态（未出租/已出租");
	  House[]houses = HouseService.list();//得到所有房屋信息 
	  for(int i = 0; i < houses.length; i++) { 
		  if(houses[i] == null) { 
			  break; 
			  } 
		  System.out.println(houses[i]); 
		  }
	  System.out.println("==============房屋列表显示完毕==============");
	  }
	
	//显示主菜点
	public void mainMenu() {
		do {
			System.out.println("==============房屋出租信息菜单==============");
			System.out.println("\t\t1新 增 房 源");
			System.out.println("\t\t2查 找 房 屋");
			System.out.println("\t\t3删 除 房 屋 信 息");
			System.out.println("\t\t4修 改 房 屋 信 息");
			System.out.println("\t\t5房 屋 列 表");
			System.out.println("\t\t6退       出");
			System.out.print("请输入你的选择 1-6");
			key = Utility.readChar();
			//使用 switch 分支控制
			switch(key) {
			case '1':
				addHouse();
				break;
			case '2':
				System.out.println("查找");
				break;
			case '3':
				System.out.println("删除");
				break;
			case '4':
				System.out.println("修改");
				break;
			case '5':
				this.listHouses();
				break;
			case '6':
				System.out.println("退出");
				loop = false;
				break;
			}
		} while(loop);
	}
}
