package com.narisu.staticc;

public class CodeBlock01 {
	public static void main(String[] args) {
		Movie movie = new Movie("消失的她");
		Movie movie2 = new Movie("唐探3",100,"陈思成");
	}

}

class Movie {
	private String name;
	private double Perce;
	private String director;
	//可以把相同的语句放入到一个代码块中即可
	//这样当我们不管调用哪个构造器，创造对象 都会先调用代码块的内容
	{
		System.out.println("电影屏幕打开，，，，");
		System.out.println("广告开始，，，，");
		System.out.println("电影正式开始，，，，");
	}
	//构造器
	public Movie(String name) {
		System.out.println("Movie(String name)被调用，，，");
		this.name = name;
	}
	public Movie(String name, double perce) {
		super();
		this.name = name;
		Perce = perce;
	}
	public Movie(String name, double perce, String director) {
		System.out.println("Movie(String name, double perce, String director)被调用，，，");
		this.name = name;
		Perce = perce;
		this.director = director;
	}
	
	
}
