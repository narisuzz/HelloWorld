package com.narisu.service;

import com.narisu.domain.House;

public class HouseService {

		//houseService.java 业务层
			//定义House[]数组 保存House对象
			//完成对房屋信息的各种操作 增删改查 create read update delete
			private static House[] houses;//保存House 对象
			private int houseNums = 1;//记录当前有多少房屋信息
			private int idCounter = 1;//记录当前的id 增长到哪个值了

		    public HouseService(int size) {
		    //new houses
		    	houses =new House[size];//当创建 HouseService对象 指定数组大小
		    	//为了配合测试列表信息 初始化一个House对象
		    	houses[0] = new House(1,"jack","112","港区",200000,"未出租");
		    }
		    //del方法 删除一个房屋信息】
		    public boolean del(int delId) {
		    	//应当先找到要删除的房屋信息的对应下标
		    	//下标和房屋的编号不是一回事
		    	int index = -1;
		    	for(int i = 0; i < houseNums; i++) {
		    		 
		    	}
		    }
		    //add方法 添加新对象 返回 boolean
		    public boolean add(House newHouse) {
		    	//判断是否可以继续添加 先不考虑数组扩容的问题
		    	if(houseNums == houses.length) {//不能再添加
		    		System.out.println("数组已满，不能在添加了");
		    		return false;
		    	}
		    	//把newHouse对象加入到  新增加了一个房屋
		    	houses[houseNums++] = newHouse;
		    	//我们程序员需要设计一个ID自增长的机制 然后更新newHouse的id
		    	newHouse.setId(++idCounter);
		    	return true;
		    }
			//list 方法  返回houses
		    public static House[] list() {
		    	return houses;
		    }
		}

